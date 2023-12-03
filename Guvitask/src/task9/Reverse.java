package task9;


	
	import java.util.Scanner;
	public class Reverse {

		
		public static void main(String[] args)
		{
			String s1, s2 = " ";
			System.out.println("Enter a String: ");
			Scanner str = new Scanner(System.in);
			s1 = str.nextLine();
			
			int l = s1.length();
			for (int k = l-1; k >= 0; k-- )
			{
				s2 = s2+ s1.charAt(k);
				
			}
			System.out.println("The reversed string is: " +s2);
			
			
		}

}
