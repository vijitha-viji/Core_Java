package InterviewPrograms;

public class Zoho_TwistedPrime {
	public static void main(String[] args) {
		int num = 97;
		twistedPrime(num);
	}
	
	public static void twistedPrime(int num)
	{
		int reversed =0;
		if(num%2!=0)
		{
			System.out.println(num + "is a Prime number");
		while(num%2!=0)
		{
			 int digit = num % 10; // 7
	            reversed = reversed * 10 + digit; // 7
	            num /= 10; // 9
			System.out.println(reversed);
		}
			
			
		}
		else
		{
			System.out.println(num + "is not a Prime number");
			
		}
	
			
		
	}

}
