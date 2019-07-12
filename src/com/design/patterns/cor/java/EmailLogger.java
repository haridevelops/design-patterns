package com.design.patterns.cor.java;

import java.util.Arrays;
import java.util.EnumSet;

public class EmailLogger extends Logger {

	private EnumSet<LogLevel> set;
	
	@Override
	void message(String msg, LogLevel severity) {
		if (set.contains(severity)) {
			System.err.println("Sending via email: " + msg);
		}
		if (this.successor != null)
			this.successor.message(msg, severity);
	}

	public EmailLogger(LogLevel... levels) {
		set = EnumSet.copyOf(Arrays.asList(levels));
	}
	
}
