/*
 Program: Write a program that reads three integers from the user and prints "Increasing" if the numbers are in increasing order,
  		  "Decreasing" if the numbers are in decreasing order, and "Neither increasing nor decreasing order" otherwise.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q3 
{
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		System.out.print("Enter the first number: ");int n1=o.nextInt();
		System.out.print("Enter the second number: ");int n2=o.nextInt();
		System.out.print("Enter the third number: ");int n3=o.nextInt();
		if (n1<n2 && n2<n3)
			System.out.println("Increasing");
		else if(n1>n2 && n2>n3)
			System.out.println("Decreasing");
		else
			System.out.println("Neither increasing nor decreasing order");
		o.close();
	}
}