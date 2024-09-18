package coreJava;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		// 2 3 4 
		// 4 1 7
		// 6 8 11
		
		int a[][] = new int[2][3];
		a[0][0]	= 2;
		a[0][1]	=3;
		a[0][2]=4;
		a[1][0]	= 4;
		a[1][1]	=5;
		a[1][2]=7;
		//System.out.println(a[1][1]);
		
		int b[][] = {{2,3,4},{4,1,7},{6,8,11}};
		//System.out.println(b[1][2]);
		
	int min= b[0][0];
	int minColumn = 0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(b[i][j]<min)
				{
					min=b[i][j];
				    minColumn = j;
					
				}
				
				
			}
		}
	System.out.println(min);
		int max = b[0][minColumn];	
		
		int k =0;
		while(k<3)
		{
			if(b[k][minColumn]>max)
			{
				max= b[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
				
	}

}
