package JAVAInteviewPrograms;

import java.util.Scanner;

public class SumOfNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter te 5 digit");
		
		for(int i=0;i<5;i++)
		{
		num=sc.nextInt();
		sum=sum+num;
		
		}
		System.out.println("The sum of teh 5 digit is:"+sum);
	}

}
