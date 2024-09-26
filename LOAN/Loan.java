/*
Assignment 1: Validating Age and Income
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
    Use logical && to combine these conditions.
 */

package assignment26;
import java.util.Scanner;
public class Loan {
	Scanner sc=new Scanner(System.in);
	private int age;
	private double income;
	
	public void accept() {
		System.out.println("Enter age of person:");
		age=sc.nextInt();
		System.out.println("Enter income of the person:");
		income=sc.nextDouble();
	}
	
	public void checkLoanEligibility() {
		if(age>=18 && age<60 && income>25000 )
		{
			System.out.println("Person is eligible for loan based on his age and income");
		}
		else
		{
			System.out.println("Person is not eligible for loan");
		}
	}
	
	public void display() {
		System.out.println("Person age : "+age);
		System.out.println("Person income : "+income);
	}
}
