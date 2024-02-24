package JAVAInteviewPrograms;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		System.out.println("Enter the first string");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		System.out.println("Enter the second string");
		Scanner sc1=new Scanner(System.in);
		str2=sc.nextLine();
		
		
		boolean status=str1.contentEquals(str2);
		
		if(status==true)
		{
			System.out.println("It is same");
			
		}
		else
			
			System.out.println("It is not same");
	}

}
