package JAVAInteviewPrograms;

import java.util.Scanner;

public class SumofFibonaccinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int f1,f2=0,f3=1,num,sum=0;
		 System.out.println("The the no of fibinacci number you want");
		  Scanner sc=new Scanner(System.in);
		  num=sc.nextInt();
		  
		  for(int i=0;i<num;i++)
		  {
			  f1=f2;
			  f2=f3;
			  f3=f1+f2;
			  System.out.println(f3);
			  sum=sum+f3;
			  
			  
		  }
		  System.out.println("The sum is"+sum); 

	}

}
