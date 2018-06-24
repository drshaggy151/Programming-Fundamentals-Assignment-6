package WageCalculator;

//*********************************************************************************************************
//Assignment 6 Wage Calculator         Author: Carlos Fernandez/L30031020
//
//Finds the calculated Wages of Person PaidAdvisor whose variables are: regularPayRate, specialPayRate, 
//overtimePayRate, and hoursWorked
//*********************************************************************************************************

public class Person {

	private String firstName;
	private String lastName;

	public Person() {
		firstName = "";
		lastName = "";
	}

	public Person(String first, String last) {
		setName(first, last);
	}

	public String toString() {
		return (firstName + " " + lastName);
	}

	public void setName(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}