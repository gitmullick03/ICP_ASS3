/*
 Program: Write a program to input 3 integer number a, b, c. Find the largest number among 3. 
 		  Also find the 2nd largest number among 3.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q9 
{
	public static void main(String args[])
	{
		Scanner v=new Scanner(System.in);
		System.out.print("Enter a: ");int a=v.nextInt();
		System.out.print("Enter b: ");int b=v.nextInt();
		System.out.print("Enter c: ");int c=v.nextInt();
		if (a>b && a>c)
		{
			if (b>c)
			{
				System.out.println("Largest number: "+a+"\n2nd largest number: "+b);
			}
			else
			{
				System.out.println("Largest number: "+a+"\n2nd largest number: "+c);
			}
		}
		else if (b>a && b>c)
		{
			if (a>c)
			{
				System.out.println("Largest number: "+b+"\n2nd largest number: "+a);
			}
			else
			{
				System.out.println("Largest number: "+b+"\n2nd largest number: "+c);
			}
		}
		else
		{
			if (b>a)
			{
				System.out.println("Largest number: "+c+"\n2nd largest number: "+b);
			}
			else
			{
				System.out.println("Largest number: "+c+"\n2nd largest number: "+a);
			}
		}
		v.close();}}