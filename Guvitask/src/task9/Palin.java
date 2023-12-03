package task9;

import java.util.Scanner;

public class Palin {
	



		public static void main(String[] args)
		{
			String x, y = "";
			System.out.println("Enter a String: ");
			Scanner str = new Scanner(System.in);
			x = str.nextLine();
			int l = x.length();
		
			for (int k=l-1; k>=0; k--)
			{
				y = y + x.charAt(k);
			}
			
			
			
			if (x.equalsIgnoreCase(y))
			{
				System.out.println(" The String is Palindrome ");
			}
			
			else 
			{
				System.out.println(" The String is not a Palindrome ");
			}
			
		}
		
	}


