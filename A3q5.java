/*
 Program: Write a Java program that takes a year from user and print true if that year is a leap year otherwise print false.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q5 
{
	public static void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a year: ");int year=p.nextInt();
		boolean cond=(year%4==0 && year%100!=0)||(year%400==0);
		if (cond)
			System.out.println(year+" is a leap year: "+cond);
		else
			System.out.println(year+" is a leap year: "+cond);
		p.close();
	}
}