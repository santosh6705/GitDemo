package JAVAInteviewPrograms;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		if((a%2)==0)
		{
			System.out.println("given number is even ");
		}
		else
			System.out.println("given number is not even number");
		

	}

}
