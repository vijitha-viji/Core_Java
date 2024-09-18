package InterviewPrograms;

public class DuplicateElementsInArray {
	
	public static void main(String[] args) {
		int[] arr= {12,54,87,90,90,12};
		DuplicateElementsInArray d = new DuplicateElementsInArray();
		d.duplicate(arr);
	}
	

	public void duplicate(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]== arr[j])
				{
					System.out.println("Duplicate : " + arr[i]);
				}
			}
			
		}
	}
}
