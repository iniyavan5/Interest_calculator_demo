package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {

    public boolean validateData(float principal, int tenure, int age, String gender) throws BankValidationException {
        if (principal >= 500 &&
            (tenure == 5 || tenure == 10) &&
            (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) &&
            (age > 0 && age < 100)) {
            return true;
        } else {
            throw new BankValidationException();
        }
    }

    public void calculate(float principal, int tenure, int age, String gender) {
        try {
            if (validateData(principal, tenure, age, gender)) {
                RDAccount account = new RDAccount(tenure, principal);
                account.setInterest(age, gender);

                float interest = account.calculateInterest();
                float deposited = account.calculateAmountDeposited();
                float maturityAmount = account.calculateMaturityAmount(deposited, interest);

                System.out.println("The Interest is: " + interest);
                System.out.println("The Total Amount Deposited: " + deposited);
                System.out.println("The Maturity Amount is: " + maturityAmount);
            }
        } catch (BankValidationException e) {
            System.out.println(e.toString());
        }
    }
}
