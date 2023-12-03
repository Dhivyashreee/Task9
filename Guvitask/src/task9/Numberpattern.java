package task9;

import java.util.Scanner;

public class Numberpattern {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows: ");
	Scanner row = new Scanner(System.in);
	int n= row.nextInt();
	int counter =1;
	
	for(int i=1; i <= n ; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.println(counter+ " ");
			counter++;
		}
		System.out.println();	
	}
	
	}
}
