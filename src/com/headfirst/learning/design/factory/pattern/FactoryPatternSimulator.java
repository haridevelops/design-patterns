package com.headfirst.learning.design.factory.pattern;

import java.lang.reflect.InvocationTargetException;

public class FactoryPatternSimulator {

	static {
		InsuranceFactory.storeInFactory("Medical", MedicalInsurance.class);
		InsuranceFactory.storeInFactory("Life", LifeInsurance.class);
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Insurance instance = InsuranceFactory.getInstance("Medical");
		System.out.println(instance.getInsuranceName());
		Insurance instance1 = InsuranceFactory.getInstance("Life");
		System.out.println(instance1.getInsuranceName());
	}
}
