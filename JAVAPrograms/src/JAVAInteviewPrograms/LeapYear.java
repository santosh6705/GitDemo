package JAVAInteviewPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  year");
		year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("THe given year is leap year");
		}
		else
			System.out.println("THe given year is not leap year");	

	}

}
