package com.headfirst.learning.design.singleton.pattern;

public class BasicSingleton {

	private static BasicSingleton singletonInstance;
	
	private BasicSingleton() { }
	
	public static BasicSingleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new BasicSingleton();
		}
		return singletonInstance;
	}
	
}
