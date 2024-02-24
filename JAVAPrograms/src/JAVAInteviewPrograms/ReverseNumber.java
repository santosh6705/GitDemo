package JAVAInteviewPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
		 int remainder=0;
		 int result=0;
		 System.out.println("Enter the digit");
		 Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		 while(num>0)
		 {
			 
			  remainder=num%10;
			 result=(result*10)+ remainder;
			 num=num/10;
		 }
		 
		System.out.println(result); 

	}

}
