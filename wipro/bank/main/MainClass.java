package com.wipro.bank.main;
import java.util.Scanner;
import com.wipro.bank.service.BankService;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tenure (5 or 10): ");
        int tenure = sc.nextInt();

        System.out.print("Enter Principal Amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Gender (male/female): ");
        String gender = sc.next();

        BankService service = new BankService();
        service.calculate(principal, tenure, age, gender);

        sc.close();
	}

}
