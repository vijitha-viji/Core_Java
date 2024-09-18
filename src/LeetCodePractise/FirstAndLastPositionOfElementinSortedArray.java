package LeetCodePractise;

public class FirstAndLastPositionOfElementinSortedArray {
//	Input: nums = [5,7,7,8,8,10], target = 8
//			Output: [3,4]
	
	public static void main(String[] args) {
		
		FirstAndLastPositionOfElementinSortedArray solution = new FirstAndLastPositionOfElementinSortedArray();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and last position: [" + result[0] + ", " + result[1] + "]");
		
	}
	
	
public int[] searchRange(int[] nums, int target) {
	
    int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    return result;
    }


private int findFirst(int[] nums, int target) {
    int index = -1;
    int low = 0, high = nums.length - 1;
    
    while (low <= high) {
        int mid = low + (high - low) / 2;
        
        if (nums[mid] >= target) {
            high = mid - 1; // Move left if nums[mid] >= target
        } else {
            low = mid + 1;
        }
        
        if (nums[mid] == target) {
            index = mid; // Record the first occurrence
        }
    }
    
    return index;
}

// Binary search to find the last occurrence of the target
private int findLast(int[] nums, int target) {
    int index = -1;
    int low = 0, high = nums.length - 1;
    
    while (low <= high) {
        int mid = low + (high - low) / 2;
        
        if (nums[mid] <= target) {
            low = mid + 1; // Move right if nums[mid] <= target
        } else {
            high = mid - 1;
        }
        
        if (nums[mid] == target) {
            index = mid; // Record the last occurrence
        }
    }
    
    return index;
}

}
