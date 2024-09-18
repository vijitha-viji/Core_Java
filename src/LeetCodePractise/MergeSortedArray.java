package LeetCodePractise;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
	       int[] arr2 = {2,5,6};
	       int n=3;
	       int m=3;
	       int[] mergedArray = new int[n+n];
	       MergeSortedArray sortedArray= new MergeSortedArray();
	       sortedArray.mergeSortedArrays(arr1, m, arr2, n,mergedArray);
	       for(int i=0;i<mergedArray.length;i++)
	       {
	    	   System.out.println(mergedArray[i]);
	       }
	      
	}
	
	
	
	public  int[] mergeSortedArrays(int[] arr1,int m, int[] arr2,int n,int[] mergedArray) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        
        int i = 0, j = 0, k = 0;
        
        // Traverse both arrays and coan mpare elements to merge them
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements of arr1, if any
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        
        // Copy remaining elements of arr2, if any
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        
        return mergedArray;
    }

}
