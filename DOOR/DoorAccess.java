/*Assignment 3: Door Access Control
Write a program that simulates an access control system. 
A person is allowed access if they have both a valid ID and a valid access card, 
or if they are an admin.
Requirements:
Use logical operators &&, ||, and !.
*/
package assignment26;
import java.util.Scanner;
public class DoorAccess {
	Scanner sc=new Scanner(System.in);
	private boolean validID;
	private boolean validAccessCard;
	private boolean admin;
	
	public void accept() {
		System.out.println("Does user have ValidID?");
		validID=sc.nextBoolean();
		System.out.println("Does user have valid access card?");
		validAccessCard=sc.nextBoolean();
		System.out.println("Is user a Admin?");
		admin=sc.nextBoolean();
	}
	
	public void checkAccess() {
		if((validID==true && validAccessCard==true)||(admin==true)) {
			System.out.println("User can access the control system...");
		}
		else
		{
			System.out.println("User does not access to the control system..");
		}
	}
	
	public void display()
	{
		System.out.println("ValidID : "+validID);
		System.out.println("Valid Access Card : "+validAccessCard);
		System.out.println("Admin : "+admin);
	}
}
