/*Assignment 7: Weather Conditions
Write a program that determines whether it's safe to go outside based on temperature and 
weather conditions. The conditions to go outside are:
•    Temperature should be between 20°C and 30°C.
•    It should not be raining.
Requirements:
•    Use logical operators && and !. 
 */
package assignment26;
import java.util.Scanner;
public class Weather {
	Scanner sc=new Scanner(System.in);
	private double temperature;
	private boolean raining;
	
	public void accept() {
		System.out.println("Check if it safe to go outside.....");
		System.out.println("Enter the temperature.");
		temperature=sc.nextDouble();
		System.out.println("Is it raining outside?");
		raining=sc.nextBoolean();
	}
	
	public void checkTemperature() {
		if((!(temperature>=20 && temperature<=30)) && (raining==false)){
			System.out.println("Not safe to go outside based on weather conditions.");
		}
		else
		{
			System.out.println("Safe to go outside based on weather conditions.");
		}
	}
	
	public void display()
	{
		System.out.println("Temperature is "+temperature+" C");
		System.out.println("Is it raining outside : "+raining);
	}

}
