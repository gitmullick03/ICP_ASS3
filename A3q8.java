/*
 Program: Write a java program that takes the x – y coordinates of a point in the Cartesian plane
  		  and prints a message telling either an axis on which the point lies or the quadrant in which it is found.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q8 
{
	public static void main(String args[])
	{
		Scanner h=new Scanner(System.in);
		System.out.print("Enter the x coordinate: ");double x=h.nextDouble();
		System.out.print("Enter the y coordinate: ");double y=h.nextDouble();
		if (x==0 && y==0)
		{
			System.out.println("("+x+", "+y+") is the very origin");
		}
		else if (x>0 && y>0)
		{
			System.out.println("("+x+", "+y+") is in Quadrant I");
		}
		else if (x<0 && y>0)
		{
			System.out.println("("+x+", "+y+") is in Quadrant II");
		}
		else if (x<0 && y<0)
		{
			System.out.println("("+x+", "+y+") is in Quadrant III");
		}
		else if (x>0 && y<0)
		{
			System.out.println("("+x+", "+y+") is in Quadrant IV");
		}
		else if (x==0)
		{
			System.out.println("("+x+", "+y+") lies on y-axis");
		}
		else if (y==0)
		{
			System.out.println("("+x+", "+y+") lies on x-axis");
		}
		h.close();
	}
}