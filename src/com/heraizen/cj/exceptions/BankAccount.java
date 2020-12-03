package com.heraizen.cj.exceptions;

import java.util.Scanner;

public class BankAccount {
	int accNo;
	String custName;
	String accType;
	float balance;

	public BankAccount(int accNo, String custName, String accType, float balance) {

		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	public void deposit(float amt, float currentBalance) {

		try {

			if (amt > 0) {
				this.balance += amt;
			} else {
				throw new IllegalArgumentException("Negative amount not to be processed");
			}

		} catch (IllegalArgumentException i) {
			System.out.println(i);

		}

		System.out.println("Your Balance:" + balance);

	}

	public void withdraw(float amt, float currentBalance) throws InsufficientFundException {

		try {

			if (amt > this.balance) {
				throw new InsufficientFundException("Not have sufficient amount " + amt);
			} else if (amt < 0) {
				throw new IllegalArgumentException("Negative amount not to be processed");
			}

			else {
				this.balance -= amt;
				System.out.println("Your Balance:" + balance);
			}

		} catch (InsufficientFundException i) {
			System.out.println(i);

		} catch (IllegalArgumentException i) {
			System.out.println(i);

		}

	}

	public void getBalance(float balance) {
		System.out.println("Your Balance:" + balance);

	}

	public static void main(String[] args) throws InsufficientFundException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number");
		int accountNumber = sc.nextInt();

		System.out.println("Enter name");
		String name = sc.next();

		System.out.println("Enter account type");
		String accountType = sc.next();

		System.out.println("Enter balance");
		float currentBalance = sc.nextFloat();

		System.out.println("1.Deposit\t2.Withdraw\t3. Balance");
		int choice = sc.nextInt();

		BankAccount bank = new BankAccount(accountNumber, name, accountType, currentBalance);

		switch (choice) {
		case 1:
			System.out.println("Enter the deposit amount");
			float depAmout = sc.nextFloat();
			bank.deposit(depAmout, currentBalance);
			break;

		case 2:
			System.out.println("Enter the withdraw amount");
			float withDrawAmout = sc.nextFloat();
			bank.withdraw(withDrawAmout, currentBalance);
			break;

		case 3:
			bank.getBalance(currentBalance);
			break;
		}
		sc.close();

	}

}
