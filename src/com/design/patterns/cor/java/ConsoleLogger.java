package com.design.patterns.cor.java;

import java.util.Arrays;
import java.util.EnumSet;

public class ConsoleLogger extends Logger {

	private EnumSet<LogLevel> set;

	public void message(String msg, LogLevel severity) {
		if (set.contains(severity)) {
			System.err.println("Writing to console: " + msg);			
		}
		if (this.successor != null)
			this.successor.message(msg, severity);
	}

	public ConsoleLogger(LogLevel... levels) {
		set = EnumSet.copyOf(Arrays.asList(levels));
	}
	
}
