package JAVAInteviewPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualstring,revestring=" ";
		System.out.println("Enter the String for reverse");
		Scanner sc=new Scanner(System.in);
		actualstring=sc.nextLine();
		int strilenth=actualstring.length();
		for(int i=strilenth-1;i>=0;i--)
		{
			revestring=revestring+actualstring.charAt(i);
		}
		System.out.println(revestring);

	}

}
