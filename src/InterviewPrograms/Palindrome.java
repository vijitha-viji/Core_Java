package InterviewPrograms;



public class Palindrome {
public static void main(String[] args) {
	
	Palindrome p = new Palindrome();
	//p.palindrome();
	p.ZohoPalindrome();

	

}
public void palindrome()
{
	String s1 = "MADAM";
	char ch = 0;
	char ch1 = 0;

	for(int i=0; i<s1.length(); i++)
	{
		ch = s1.charAt(i);
		System.out.println(ch);
		
		for(int j =s1.length()-1; j>=0; j--)
		{
			ch1 = s1.charAt(j);
			System.out.println(ch1);
		}
		
		}
	if(ch==ch1)
	{
		System.out.println("Palindrome");
	}else
	{
		System.out.println("Not Palindrome");
	}	
}

public void ZohoPalindrome()
{
   String s ="RACE CAR";
   
   //s.trim();
   char ch = 0,ch1 = 0;;
   
   for(int i=0;i<s.length();i++)
   {
	   ch=  s.charAt(i);
	   System.out.println(ch);
	   
	   for(int j = s.length()-1; j>=0; j--)
	   {
		   ch1=s.charAt(j);
	   }
	   
   }
   if(ch==ch1)
   {
	   System.out.println("Palindrome");
   }
   else
	   System.out.println("Not Palindrome");
}
}
