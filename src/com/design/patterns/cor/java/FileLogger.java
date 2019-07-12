package com.design.patterns.cor.java;

import java.util.Arrays;
import java.util.EnumSet;

public class FileLogger extends Logger {
	
	private EnumSet<LogLevel> set;
	
	@Override
	void message(String msg, LogLevel severity) {
		if (set.contains(severity)) {
			System.err.println("Writing to Log File: " + msg);
		}
		if (this.successor != null)
			this.successor.message(msg, severity);
	}

	public FileLogger(LogLevel... levels) {
		set = EnumSet.copyOf(Arrays.asList(levels));
	}
	
}
