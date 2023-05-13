/*
 Program: Alice visited SUM hospital to get treatment for her fever and illness. Doctor advised her to drink at least 5000 ml of water each day. 
 		  Alice drank x ml of water today. Write a program that print the following message depending on the value of x.
			“Yes, Alice is following doctor’s advice”
							OR
			“No, Alice is not following doctor’s advice”
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q2 
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		System.out.print("How much water did Alice drink today in mililitres? ");
		double ml=k.nextDouble();
		if (ml>=5000)
			System.out.print("Yes, Alice is following doctor’s advice");
		else
			System.out.print("No, Alice is not following doctor’s advice");
		k.close();
	}
}