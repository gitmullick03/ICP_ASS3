/*
 Program: Write a program to input the age of a person and check if the age of the person is greater than or equal to 18 then print the message:
			“You are eligible to cast your vote”.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q1 
{
	public static void main(String args[])
	{
		Scanner l=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=l.nextInt();
		if (age>=18)
			System.out.println("You are eligible to cast your vote");l.close();
	}
}