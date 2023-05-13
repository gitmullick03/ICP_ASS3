/*
 Program: A University conducts a 100-mark exam for its student and grades them as follows. 
 		  Assigns a grade based on the value of the marks. Write a java program to print the grade 
 		  according to the mark secured by the student. [Use switch-case].
				Mark Range		Letter Grade
				>=90			O
				>=80 AND <90	A
				>=70 AND <80	B
				>=60 AND <70	C
				>=50 AND <60	D
				>=40 AND <50	E
				<40				F
				
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class A3q10 
{
	public static void main(String args[])
	{
		Scanner u=new Scanner(System.in);
		System.out.println("Enter your mark: ");int m=u.nextInt();m/=10;
		switch (m)
		{
		case (9):
			System.out.println("Grade: O");break;
		case (8):
			System.out.println("Grade: A");break;
		case (7):
			System.out.println("Grade: B");break;
		case (6):
			System.out.println("Grade: C");break;
		case (5):
			System.out.println("Grade: D");break;
		case (4):
			System.out.println("Grade: E");break;
		default:
			System.out.println("Grade: F");break;
		}
		u.close();
	}
}