package ikinci_lab;

import java.util.*;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int day,future_day,x;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		day=input.nextInt();
		
		System.out.println("Enter number of days elapsed since today: ");
		future_day=input.nextInt();
		
		
		x=(day+future_day)%7;
		
		
		switch(x) {
		
		case 0:
			System.out.println("Today is Sunday ");
			break;
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday ");
			break;
		case 3:
			System.out.println("Today is wednesday ");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday ");
			break;
		case 6:
			System.out.println("Today is Saturday ");
			break;	
		}
	}
}