package JAVAInteviewPrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radius;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious of the circle");
		radius=sc.nextInt();
		area=Math.PI*radius*radius;
		System.out.println("Areaof the circle is "+area);
		

	}

}
