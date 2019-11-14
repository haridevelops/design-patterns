package com.headfirst.learning.design.factory.pattern;

public class FactoryPatternSimulator {

	static {
		InsuranceFactory.storeInFactory("Medical", MedicalInsurance.class);
		InsuranceFactory.storeInFactory("Life", LifeInsurance.class);
	}
	
	public static void main(String[] args) {
		Insurance instance = InsuranceFactory.getInstance("Medical");
		System.out.println(instance.getInsuranceName());
		Insurance instance1 = InsuranceFactory.getInstance("Life");
		System.out.println(instance1.getInsuranceName());
	}
}
