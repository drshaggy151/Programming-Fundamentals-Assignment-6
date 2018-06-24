package WageCalculator;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//*********************************************************************************************************
//Assignment 6 Wage Calculator         Author: Carlos Fernandez/L30031020
//
//Finds the calculated Wages of Person PaidAdvisor whose variables are: regularPayRate, specialPayRate, 
//overtimePayRate, and hoursWorked
//*********************************************************************************************************

class PaidAdvisor extends Person {

	private static double regularPayRate, specialPayRate, payment = 0;

	private static int totalHours, specialHours;

	PaidAdvisor(double regularPayRate, double specialPayRate, int totalHours, int specialHours) {

		PaidAdvisor.regularPayRate = regularPayRate;

		PaidAdvisor.specialPayRate = specialPayRate;

		PaidAdvisor.totalHours = totalHours;

		PaidAdvisor.specialHours = specialHours;

	}

	PaidAdvisor() {

	}

	public void calculatePay() {

		int regularHours = totalHours - specialHours, overtimeHours = 0;

		if (regularHours > 30) {

			overtimeHours = regularHours - 30;

		}

		payment = regularHours * regularPayRate + specialHours * specialPayRate
				+ overtimeHours * (regularPayRate / 2.0f);

	}

	public double getPayRate() {

		Scanner scan = new Scanner(System.in);

		String q = "";

		while (true) {

			System.out.println("Which pay rate are you querying? (r-regualr/o-overtime): ");

			System.out.print("r/o: ");

			q = scan.nextLine();

			if (q.equalsIgnoreCase("r")) {

				return regularPayRate;

			}

			else if (q.equalsIgnoreCase("o")) {

				return specialPayRate;

			}

			else {

				System.out.println("Invalid choice!");

			}

		}

	}

	public void setNameRateHours() {

		Scanner scan = new Scanner(System.in);

		String firstname = "";

		String lastname = "";

		int totalHours, regularHours, specialHours;

		double regularPayRate, specialPayRate;

		System.out.print("Enter Employee's First name: ");

		firstname = scan.nextLine();

		System.out.print("Enter Employee's last name: ");

		lastname = scan.nextLine();

		System.out.print("Enter Employee's total hours worked: ");

		totalHours = Integer.parseInt(scan.nextLine());

		System.out.print("Enter Employee's special hours worked: ");

		specialHours = Integer.parseInt(scan.nextLine());

		System.out.print("Enter Employee's regualar pay rate: ");

		regularPayRate = Float.parseFloat(scan.nextLine());

		System.out.print("Enter Employee's special pay rate: ");

		specialPayRate = Float.parseFloat(scan.nextLine());

		PaidAdvisor.regularPayRate = regularPayRate;

		PaidAdvisor.specialPayRate = specialPayRate;

		PaidAdvisor.totalHours = totalHours;

		PaidAdvisor.specialHours = specialHours;

		setName(firstname, lastname);

	}

	public int getHoursWorked() {

		return totalHours;

	}

	public String toString()

	{

		NumberFormat f = new DecimalFormat("#,##0.00");

		return "Total payment for the employee " + super.getFirstName() + " " + super.getLastName() + " is: $"
				+ f.format(payment);

	}

}