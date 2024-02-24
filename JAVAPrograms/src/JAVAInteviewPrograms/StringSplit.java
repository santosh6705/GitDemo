package JAVAInteviewPrograms;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("JyoshnaMajhi");
		System.out.println("Split(String regex):");
		String array1[]=str.split(str, 2);
		for(String temp:array1)
		{
			System.out.println(temp);
		}
		

	}

}
