package task9;

import java.util.Scanner;
public class Gradingsystem {
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the mark of the student: ");
		Scanner mar = new Scanner(System.in);
		int m = mar.nextInt();
		String grade = "";
		
		if(m==100)
		grade = "S";
		else if(m>100)
		{
			System.out.println("Invalid Input");
		}
			
		else if(m==90 || m<=99)
		grade = "A";
		else if(m==80 || m<=89 )
	    grade = "B";
		else if(m==70 || m<=79)
			grade = "C";
		else if(m==60 || m<=69)
			grade = "D";
		else if (m==50 || m<=59)
			grade ="E";
		else 
			grade ="F";
		
		System.out.println("Grade "+grade);
		}
}
