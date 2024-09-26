/*Assignment 5: Job Application
Write a program that checks if a person is eligible for a job based on their qualifications.
A person is eligible if they have a bachelor’s degree or equivalent experience, 
and they have a clean criminal record.
Requirements:
Use logical operators to combine conditions.
*/
package assignment26;
import java.util.Scanner;
public class Job {
	Scanner sc=new Scanner(System.in);
	private boolean bachelorDegree;
	private boolean experience;
	private boolean criminalRecord;
	
	public void accept() {
		System.out.println("Do you Bachelor's Degree answer true/false?");
		bachelorDegree=sc.nextBoolean();
		System.out.println("Do you equivalent experience? answer true/false.");
		experience=sc.nextBoolean();
		System.out.println("Do you clean criminal record? answer true/false.");
		criminalRecord=sc.nextBoolean();
	}
	
	public void checkEligibility() {
		if((bachelorDegree==true || experience==true) && (criminalRecord==true))
		{
			System.out.println("Person is eligible for the job!");
		}
		else
		{
			System.out.println("Person is not eligible for the job!");
		}
	}
	
	public void display() {
		System.out.println("Bachelor Degree : "+bachelorDegree);
		System.out.println("Experience : "+experience);
		System.out.println("Clean criminal record : "+criminalRecord);
	}

}
