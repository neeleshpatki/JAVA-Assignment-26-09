/*Assignment 4: Voting Eligibility
Write a program that checks if a person is eligible to vote. 
A person can vote if they are a citizen and their age is 18 or above.
Requirements:
Use logical && to combine conditions, and ! to negate conditions if necessary.
*/
package assignment26;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Voting {
	Scanner sc=new Scanner(System.in);
	private boolean citizen;
	int age;
	String country;
	
	public void accept() {
		System.out.println("Is the person citizen of the country?");
		citizen=sc.nextBoolean();
		System.out.println("Enter the country of the person:");
		country=sc.next();
		System.out.println("Enter the person age:");
		age=sc.nextInt();
	}
	
	public void checkVotingEligibility() {
		if(citizen==true && age>=18)
		{
			System.out.println("Person is eligible to vote...");
		}
		else
		{
			System.out.println("Person is not eligible to vote...");
		}
	}
	
	public void display() {
		System.out.println("Is person citizen of the country? : "+citizen);
		System.out.println("Country of the person : "+country);
		System.out.println("Age of the person : "+age);
	}
}
