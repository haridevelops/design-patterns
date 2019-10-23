package com.headfirst.learning.design.singleton.pattern;

public class EagerLoadSingleton {

	private static EagerLoadSingleton singletonInstance = new EagerLoadSingleton();;
	
	private EagerLoadSingleton() { }
	
	public static EagerLoadSingleton getInstance() {
		return singletonInstance;
	}
	
}
