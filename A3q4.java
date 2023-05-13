/*
 Program: Make a simple game involving a computer and a user. The computer first guesses a number between 1 and 9 inclusive,
  		  then ask the user to enter a number between 1 and 9 inclusive. 
  		  If the user guess is correct then display “You got it right”, if the guess is close (+1, -1) “Almost got it “, 
  		  Otherwise “You got it wrong”.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q4 
{
	public static void main(String args[])
	{
		Scanner j=new Scanner(System.in);
		int cnum=(int)((9*Math.random()))+1;
		System.out.print("Guess a number between 1 and 9: ");int usernum=j.nextInt();
		System.out.println("Computer guesses: "+cnum);
		if (usernum==cnum)
			System.out.println("You got it right");
		else if ((usernum+1)==cnum || (usernum-1)==cnum)
			System.out.println("Almost got it");
		else
			System.out.println("You got it wrong");
		j.close();
	}
}