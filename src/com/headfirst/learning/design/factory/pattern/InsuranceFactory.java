package com.headfirst.learning.design.factory.pattern;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class InsuranceFactory {
	
	private static Map<String, Class<?>> factory = new HashMap<String, Class<?>>();
	
	public static void storeInFactory(String type, Class<?> cl) {
		factory.put(type, cl);
	}
	
	public static Insurance getInstance(String type) {
		try {
			return (Insurance) factory.get(type).getDeclaredConstructors()[0].newInstance();
		} catch (InstantiationException | 
				IllegalAccessException | 
				IllegalArgumentException |
				InvocationTargetException |
				SecurityException e) {
			throw new RuntimeException(e);
		}
	}
}
