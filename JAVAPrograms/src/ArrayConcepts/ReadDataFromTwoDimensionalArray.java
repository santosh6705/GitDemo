package ArrayConcepts;

public class ReadDataFromTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[3][2];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
	    arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
	
//Classic for loop		
	/*	
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(arr[i][j]+"   ");
				
			}
			System.out.println();
		}
			*/
// for each loop
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
		{
			
		}
		
		
		
		
		
		
		

	}

}
