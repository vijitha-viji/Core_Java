package InterviewPrograms;

public class Fibonacci {
	public static void main(String[] args) {
		
		// 2,3,5,8, 
		
		int n =10;
		int i1=0;
		int i2=1;
		int i3 ;
		
		for(int i=0; i<n; i++)
		{
			
			i3= i1+i2; // 1
			
			
			i1=i2;
			i2=i3;
			System.out.println(i3);
		
		}
		
		
	}

}
