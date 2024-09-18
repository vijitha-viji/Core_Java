package InterviewPrograms;

public class LargestNumber {
public static void main(String[] args) {

	int[] num = {23,76,90};
	LargestNumber l = new LargestNumber();
	l.largest(num);
	
}

public void largest(int[] num)
{
	int max=num[0];
	for(int i=0; i<num.length;i++)
	{
		if(num[i]> max)
		{
			max = num[i];
		}
		
		
	}
	
	System.out.println("Largest is" + max);
	
}
}
