package JAVAInteviewPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,result=1;
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num>0)
		{
			result=result*num;
			num--;
		}
		
		System.out.println("The factorial of the number is"+result);
		

	}

}
