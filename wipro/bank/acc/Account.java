package com.wipro.bank.acc;

public abstract class Account {
	 protected int tenure;
	    protected float principal;
	    protected float rateOfInterest;

	    public void setInterest(int age, String gender) {
	        if (age < 60 && gender.equalsIgnoreCase("male")) {
	            this.rateOfInterest = 9.8f;
	        } else if (age >= 60 && gender.equalsIgnoreCase("male")) {
	            this.rateOfInterest = 10.5f;
	        } else if (age < 58 && gender.equalsIgnoreCase("female")) {
	            this.rateOfInterest = 10.2f;
	        } else {
	            this.rateOfInterest = 10.8f;
	        }
	    }

	    public float calculateMaturityAmount(float totalPrincipalDeposited, float maturityInterest) {
	        return totalPrincipalDeposited + maturityInterest;
	    }

	    public abstract float calculateInterest();
	    public abstract float calculateAmountDeposited();
}
