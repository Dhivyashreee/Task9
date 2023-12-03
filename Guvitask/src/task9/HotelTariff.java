


	package task9;

	import java.util.Scanner;



	public class HotelTariff {
		
		public static void main(String[] args) {
			
			
			float  t=0;
			double r=0;
			
			System.out.println("Enter the number of the month, room rent per day and the number of days ");
			Scanner cal = new Scanner(System.in);
			int month = cal.nextInt();
			int n = cal.nextInt();
			float rent = cal.nextFloat();
			
			t = rent*n;
			r = ((rent+(rent*0.2))*n);
			
			
			switch(month)
			{
			
			case 1:
				System.out.println(t);
				break;
			case 2:
				System.out.println(t);
				break;
			case 3:
				System.out.println(t);
				break;
			case 4:
				System.out.println(r);
				break;
			case 5:
				System.out.println(r);
				break;
			case 6:
				System.out.println(r);
				break;
			case 7:
				System.out.println(t);
				break;
			case 8:
				System.out.println(t);
				break;
			case 9:
				System.out.println(t);
				break;
			case 10:
				System.out.println(t);
				break;
			case 11:
				System.out.println(r);
				break;
			case 12:
				System.out.println(r);
				break;
			default:System.out.println("Invalid Month!");
			
				}
			
			
			
		}
		

	}


