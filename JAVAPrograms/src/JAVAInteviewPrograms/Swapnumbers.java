package JAVAInteviewPrograms;

import java.util.Scanner;

public class Swapnumbers {
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
	
		 c=a;
		 a=b;
		 b=c;
		 
		 System.out.println("the swapping value is:"+a+"  "+b);
		} 
		
		

	}


