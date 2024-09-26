/* Logical NOT (!) for Negation
Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
Use logical ! to negate conditions
*/
package assignment26;
import java.util.Scanner;
public class Number {
	Scanner sc=new Scanner(System.in);
	private int num;
	
	public void accept()
	{
		System.out.println("Enter the number:");
		num=sc.nextInt();
	}
	
	public void checkNumber()
	{
		if(!(num>=10 && num<=20))
		{
			System.out.println(num+" is between not 10 and 20.");
		}
		else
		{
			System.out.println(num+" is between 10 and 20.");
		}
	}
	
	public void display()
	{
		System.out.println("The number to check is "+num);
	}

}
