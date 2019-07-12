package com.design.patterns.cor.java;

public abstract class Logger {
    public enum LogLevel {
        INFO, DEBUG, WARNING, ERROR, FUNCTIONAL_MESSAGE, FUNCTIONAL_ERROR;

        public static LogLevel[] all() {
            return values();
        }
    }

    protected Logger successor;
    
    public void setSuccessor(Logger logger) {
    	this.successor = logger;
    }
    
    abstract void message(String msg, LogLevel severity);

    public Logger appendNext(Logger logger) {
    	this.setSuccessor(logger);
    	return this;
    }
    
}