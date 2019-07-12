package com.design.patterns.cor.java;

import com.design.patterns.cor.java.Logger.LogLevel;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		Logger log1 = new ConsoleLogger(LogLevel.all());
		Logger log2 = new EmailLogger(LogLevel.FUNCTIONAL_MESSAGE, LogLevel.FUNCTIONAL_ERROR);
		Logger log3 = new FileLogger(LogLevel.WARNING, LogLevel.ERROR);
		log1.setSuccessor(log2);
		log2.setSuccessor(log3);
		
		perform(log1);
		
		// append next feature
		Logger logger = new ConsoleLogger(LogLevel.all())
				.appendNext(new EmailLogger(LogLevel.FUNCTIONAL_MESSAGE, LogLevel.FUNCTIONAL_ERROR))
				.appendNext(new FileLogger(LogLevel.WARNING, LogLevel.ERROR));
		
		perform(logger);
	}
	
	public static void perform(Logger log1) {
		log1.message("Entering function ProcessOrder().", LogLevel.DEBUG);
		log1.message("Order record retrieved.", LogLevel.INFO);

        // Handled by consoleLogger and fileLogger since file logger implements Warning & Error
		log1.message("Customer Address details missing in Branch DataBase.", LogLevel.WARNING);
		log1.message("Customer Address details missing in Organization DataBase.", LogLevel.ERROR);

        // Handled by consoleLogger and emailLogger as it implements functional error
		log1.message("Unable to Process Order ORD1 Dated D1 For Customer C1.", LogLevel.FUNCTIONAL_ERROR);

        // Handled by consoleLogger and emailLogger
		log1.message("Order Dispatched.", LogLevel.FUNCTIONAL_MESSAGE);
	}
}
