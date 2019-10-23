package com.headfirst.learning.design.singleton.pattern;

public class DoubleCheckSyncSingleton {

	private volatile static DoubleCheckSyncSingleton singletonInstance;
	
	private DoubleCheckSyncSingleton() { }
	
	public static DoubleCheckSyncSingleton getInstance() {
		if (singletonInstance == null) {
			synchronized (DoubleCheckSyncSingleton.class) {
				if (singletonInstance == null) {
					singletonInstance = new DoubleCheckSyncSingleton();									
				}
			}
		}
		return singletonInstance;
	}
	
}
