package ArrayConcepts;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[3];
		str[0]="Welcome";
		str[1]="Welcome1";
		str[2]="Welcome2";
		
		System.out.println("The length of the string arrya is"+str.length);
		for(String s:str)
		{
			System.out.println(s);
		}
		

	}

}
