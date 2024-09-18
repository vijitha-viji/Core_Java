package coreJava;

public class arrays {
	public static void main(String[] args) {
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		
		System.out.print("Original Array: ");
	for(int i=0;i<arr.length;i++)
	{
	    System.out.print(arr[i] + " ");
	}
		int temp =0;
	for (int i=0;i<arr.length;i++)
	{
		for(int j=i+1; j<arr.length;j++)
		{
			if(arr[i]< arr[j])
			{
				temp =arr[i]; // 78
				arr[i]= arr[j]; // 34
				arr[j] = temp; //
			}
			
		}
	}
	System.out.print("\nAscending Order: ");
	for(int i=0; i<arr.length;i++)
	{
		System.out.print(arr[i] + " ");
	}
	}

}
