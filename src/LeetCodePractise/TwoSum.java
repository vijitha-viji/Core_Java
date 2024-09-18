package LeetCodePractise;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		
		TwoSum solution = new TwoSum();
	        int[] nums = {3, 4,2,7, 11, 15};
	        int target = 9;
	        int[] result = solution.twoSum(nums, target);
	        System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
	
	
public int[] twoSum(int[] nums,int target)
		{
	  // Create a HashMap to store the numbers we have seen and their indices
    Map<Integer, Integer> seen = new HashMap<>();
    
    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
        // Calculate the complement (the number needed to reach the target)
        int complement = target - nums[i];
        
        // Check if the complement is already in the HashMap
        if (seen.containsKey(complement)) {
            // If it is, return the indices
            return new int[] { seen.get(complement), i };
        }
        
        // Otherwise, add the current number and its index to the HashMap
        seen.put(nums[i], i);
    }
    
    // If no solution is found (which shouldn't happen per problem constraints)
    throw new IllegalArgumentException("No two sum solution");
}
	
	
}
