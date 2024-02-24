package ArrayConcepts;

public class ArrayStringOPeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="WELCOME";
		String s2="welcome";
		
//concadination	
		
System.out.println(s1+s2);
System.out.println(s1.concat(s2));

//Length of the string

System.out.println(s1.length());
System.out.println(s2.length());

//Checking equal

System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));

//contains

System.out.println(s2.contains("come"));

//substring

System.out.println(s1.substring(0, 5));

//Replace
System.out.println(s2.replace('w','u'));
System.out.println(s2);

	}

}
