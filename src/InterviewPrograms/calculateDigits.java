package InterviewPrograms;

public class calculateDigits {
	public static void main(String[] args) {
		
	int number =-676755454;
		System.out.println(numOfDigits(number));
	}

	public static int numOfDigits(int number)
	{
		int count =0;
		if(number==0)
		return 1;
		
		number = Math.abs(number);
		while(number>0)
		{
			number/=10;
			count++;
		}
		
																												
		return count;
		
	}
}
