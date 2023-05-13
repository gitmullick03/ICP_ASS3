/*
 Program: From the above question no. (6) write a java program with a choice if the consumer wants to pay bill online. 
 		  Consumer who pays their electricity bill online will get a discount of 3%.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q7 
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
		System.out.print("Do you want to pay online (Y/N): ");
		char ch=a.next().charAt(0);
		if (ch=='y' || ch=='Y')
		{
			System.out.println("Total amount: "+pr+"\nDiscount: "+(0.03*pr)+"\nAmount payable: "+(pr-(0.03*pr)));
		}
		else
		{
			System.out.println("Total amount: "+pr+"\nAmount payable: "+pr);
		}
		a.close();
	}
}