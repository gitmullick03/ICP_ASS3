/*
 Program: Write a java program to calculate the monthly electricity bill. The tariff is given as follows:
			
			Price per unit	Unit range
			Rs. 3/-			First 50 units
			Rs. 4.80/-		50-200 units
			Rs. 5.80/-		200-400 units
			Rs. 6.20/-		Above 400 units
			
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q6 
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter no. of units consumed: ");double u=a.nextDouble(),pr;
		if (u<=50)
		{
			pr=u*3;
		}
		else if (u<=200)
		{
			pr=(3*50)+((u-50)*4.80);
		}
		else if (u<=400)
		{
			pr=(3*50)+(4.80*150)+((u-200)*5.80);
		}
		else
		{
			pr=(3*50)+(4.80*150)+(200*5.80)+((u-400)*6.20);
		}
		System.out.println("Total amount payable: "+pr);
		a.close();
	}
}