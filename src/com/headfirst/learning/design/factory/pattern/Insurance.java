package com.headfirst.learning.design.factory.pattern;

public abstract class Insurance {

	public abstract long getPremium();
	
	public abstract String getInsuranceName();
	
	public abstract long getTenure();

	@Override
	public String toString() {
		return "Insurance [getPremium()=" + getPremium() + ", getInsuranceName()=" + getInsuranceName()
				+ ", getTenure()=" + getTenure() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
