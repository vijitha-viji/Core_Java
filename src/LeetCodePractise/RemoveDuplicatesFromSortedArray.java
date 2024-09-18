package LeetCodePractise;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

	        // Test case
	        int[] nums = {12,13,13,14,14};
	        int[] expectedNums = {12,13,14}; // Expected unique elements

	        // Call removeDuplicates method
	        int k = solution.removeDuplicates(nums);

	        // Validate the length of the output
	        assert k == expectedNums.length : "Expected length does not match";

	        // Validate the content of the output
	        for (int i = 0; i < k; i++) {
	            assert nums[i] == expectedNums[i] : "Element mismatch at index " + i;
	        }

	        System.out.println("All tests passed!");
	    }
	
	
	
	public int removeDuplicates(int[] nums)

	{
        if (nums.length == 0) return 0;

        // Pointer j tracks the last position of the unique element
        int j = 0;

        // Start from the second element, compare with the last unique element
        for (int i = 1; i < nums.length; i++) {
            // If a new unique element is found, move it to the next available position
            if (nums[i] != nums[j]) {
               // j++;
                nums[j] = nums[i]; //0,0,1,1,1
                j++;
            }
        }

        // Return the number of unique elements
        return j+1 ;
    }

}
