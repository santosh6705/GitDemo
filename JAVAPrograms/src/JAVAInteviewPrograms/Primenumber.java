package JAVAInteviewPrograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.println("Enter the number to check for the prime number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1; i<=num;i++)
		{
			for(int j=2;j=i/j;j++)
			{
			if((num%i)==0)
			{
				System.out.println("The given number is prime number");
				break;
			
			}
			else
			{
				System.out.println("The given number is not a prime number");
			}
				
		}
		}

	}

}
