package LeetCodePractise;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,2,8};
		int val=2;
		
		RemoveElement v = new RemoveElement();
		int k= v.removeElemt(nums, val);
	//	System.out.println(nums);
		
		for(int i=0; i<k; i++)
		{
			System.out.println(nums[i]);
		}
	}
	
	public int removeElemt(int[] nums, int val)
	{
		int j=0;
		
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]!= val)
			{
				nums[j] = nums[i];
				j++;
			}
			
		}
		return j;
	}

}
