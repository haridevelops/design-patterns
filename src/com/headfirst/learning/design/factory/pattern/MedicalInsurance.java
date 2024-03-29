package com.headfirst.learning.design.factory.pattern;

public class MedicalInsurance extends Insurance {

	public MedicalInsurance() { }
	
	@Override
	public long getPremium() {
		return 26000;
	}

	@Override
	public String getInsuranceName() {
		return "Medical Insurance";
	}

	@Override
	public long getTenure() {
		return 20;
	}

}
