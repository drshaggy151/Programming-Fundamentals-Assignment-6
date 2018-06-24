package WageCalculator;

//*********************************************************************************************************
//Assignment 6 Wage Calculator         Author: Carlos Fernandez/L30031020
//
//Finds the calculated Wages of Person PaidAdvisor whose variables are: regularPayRate, specialPayRate, 
//overtimePayRate, and hoursWorked
//*********************************************************************************************************

public class calculatePay {

	public static void main(String[] args) {

		PaidAdvisor pA = new PaidAdvisor();

		pA.setNameRateHours();

		pA.calculatePay();

		System.out.println(pA.toString());

	}

}