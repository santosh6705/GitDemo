package JAVAInteviewPrograms;
import java.util.Scanner;

public class Maximum3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		a=in.nextInt();
		System.out.println("Enter the value of b");
		b=in.nextInt();
		System.out.println("Enter the value of c");
		c=in.nextInt();
		if(a>b&&a>c) {
			System.out.println("a is maximum number");
	
		}
		if(b>a&&b>c)
		{
			System.out.println("b is maximum number");	
		}
		else
			System.out.println("c is maximum number");

	}

}
