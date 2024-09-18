package LeetCodePractise;

public class GreatestCommonDivisorOfStrings {
	public static void main(String[] args) {
		
	//	String str1= "ABCABCABC";
	//	String str2="ABC";
		GreatestCommonDivisorOfStrings s = new GreatestCommonDivisorOfStrings();
		//s.commonDivisorOfStrings(str1, str2);
		
		//***************
		
		System.out.println(s.gcdOfStrings("ABCABC", "ABC"));  // Output: "ABC"
		System.out.println(s.gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
		System.out.println(s.gcdOfStrings("LEET", "CODE"));   // Output: ""
		
	}
	
//	public void commonDivisorOfStrings(String str1, String str2)
//	{
//		for(int i=0;i<str1.length();i++)
//		{
//			if(str1.charAt(i)%str2.charAt(i)==0)
//			{
//				
//			}
//		}
//		  
//	}
	
	public String gcdOfStrings(String str1, String str2) {
		
//		System.out.println(str1+str2);// 
//		System.out.println(str2+str1);
		
		if(!(str1+str2).equals(str2+str1))
		{
			//System.out.println(!(str1+str2).equals(str2+str1));
			System.out.println("null");
			return "";
			
		}
		
		int gcdLength = gcd(str1.length(),str2.length());
		return str1.substring(0, gcdLength);
		
	
				
				
	}
	private int gcd(int a , int b)// 6, 3
	{
         while(b!=0)    
         {
        	int temp =b;   // 3
        	b=a%b;   // 
        	a=temp;
         }
		return a;
	}

}
