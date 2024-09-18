package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingNumbers {
	
	public static void main(String[] args) {
		int[]  n = {78,12,34,665,90};
		
		SortingNumbers sn = new SortingNumbers();
		sn.sortLogic(n);
		sn.arraysLogic();
	}

	public void sortLogic(int[] n)
	{
		int order = 0;
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					order=n[i];
					n[i]=n[j];
					n[j]=order;
					
				}
			}
			System.out.println(n[i]);
		}
		
	}
	
	public void arraysLogic()
	{
		Integer[] n =  {78,12,34,665,90};
		Arrays.sort(n);
//		 System.out.println(Arrays.toString(n));
		
		// Arrays.sort(n, Collections.reverseOrder());
		 	System.out.println(Arrays.toString(n));
		 
	}
}
