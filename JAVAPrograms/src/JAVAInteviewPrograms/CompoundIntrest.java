package JAVAInteviewPrograms;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PA,TP,IR,CI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the princepal amount");
		PA=sc.nextDouble();
		System.out.println("Enter the time period ");
		TP=sc.nextDouble();
		System.out.println("Enter the intrest rate ");
		IR=sc.nextDouble();
		CI=PA*Math.pow((1+IR/100),TP);
		System.out.println("The compound intrest is"+CI);
		

	}

}
