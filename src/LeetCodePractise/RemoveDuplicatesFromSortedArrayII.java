package LeetCodePractise;

//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]
//Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).

//Input: nums = [0,0,1,1,1,1,2,3,3]
//Output: 7, nums = [0,0,1,1,2,3,3,_,_]

public class RemoveDuplicatesFromSortedArrayII {
	public static void main(String[] args) {
		
		int[] input = {0,0,1,1,1,1,2,3,3};
		
		
		RemoveDuplicatesFromSortedArrayII re= new RemoveDuplicatesFromSortedArrayII();
		re.removeDuplicate(input);
	}
	
	public void removeDuplicate(int[] input)
	{
		int count=0;
		int temp=0;
		for(int i=0; i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]==input[j])
				{
					temp=input[j];
					input[i]= input[j];
					
				}else
				{
					
				}
				
			}
			
			System.out.println(input[i]);
			
		}
	}
	
	
	
	

}
