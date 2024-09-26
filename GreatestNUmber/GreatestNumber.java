/*Assignment 8: Determine the Greatest Number Using Ternary Operator
Write a Java program to find the greatest number among three numbers using the ternary operator.
*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers
*/
package assignment26;
import java.util.Scanner;
public class GreatestNumber {
	Scanner sc=new Scanner(System.in);
	private int num1;
	private int num2;
	private int num3;
	private int max;
	
	public void accept()
	{
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		System.out.println("Enter third number:");
		num3=sc.nextInt();
	}
	
	public void checkGreaterNumber() {
		max=((num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3));	
				}
	
	public void display() {
		System.out.println("The greatest number between the entered 3 numbers are : "+max);
	}
}
