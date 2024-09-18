package InterviewPrograms;

public class ZohoQuestions_Array1 {
	
	// {2,2,0,4,0,8} // 4,0,0,4,0,8
	//{4,4,8,0,0,0} 
	//{0,2,2,2,0,6,6,0,0,8} // 0,4,0,2,0,12,0,0,0,8
	
	public static void main(String[] args) {
		
		int[] arr = {2, 2, 0, 4, 0, 8};
        rearrange(arr);

        // Output the modified array
        for (int num : arr) {
            System.out.print(num + " ");
		
	}
	}
	public static void rearrange(int[] arr) {
        int n = arr.length;

        // Step 1: Traverse the array and modify it as per the condition
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }

        // Step 2: Shift all non-zero elements to the front and zero elements to the end
        int count = 0; // Count of non-zero elements

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Set the remaining elements to 0
        while (count < n) {
            arr[count++] = 0;
        }
    }
	}
