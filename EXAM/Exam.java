/*Assignment 2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. 
A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
Use logical operators && and || to combine conditions.
*/
package assignment26;
import java.util.Scanner; 
public class Exam {
	Scanner sc=new Scanner(System.in);
	private int m1,m2,m3;
	private double avg;
	
	public void accept() {
		System.out.println("Enter marks for subject1");
		m1=sc.nextInt();
		System.out.println("Enter marks for subject2");
		m2=sc.nextInt();
		System.out.println("Enter marks for subject3");
		m3=sc.nextInt();
	}
	
	public void calculateAvg()
	{
		avg=(m1+m2+m3)/3;
		System.out.println("The average of the student is : "+avg);
	}
	
	public void checkPassing() {
		if(avg>=60 && m1>40 && m2>40 && m3>40)
		{
			System.out.println("Student is Passing with good grades...");
		}
		else
		{
			System.out.println("Student is failing...");
		}
	}
	
	public void display()
	{
		System.out.println("Suject 1 marks are : "+m1);
		System.out.println("Suject 2 marks are : "+m2);
		System.out.println("Suject 3 marks are : "+m3);
	}
}
