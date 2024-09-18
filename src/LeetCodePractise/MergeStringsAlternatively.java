package LeetCodePractise;

public class MergeStringsAlternatively {
	
	
	public static void main(String[] args) {
		String word1 = "Venba";
		String word2 = "Vasuaaaa";
		
		MergeStringsAlternatively m = new MergeStringsAlternatively();
		//m.mergeStrings(word1, word2);
		m.mergeStringsUsingBuilder(word1, word2);
	//	m.mergeStringsUsingWhileLoop(word1, word2);
	}
	
	
	public void mergeStrings(String word1, String word2)
	{
		String result = "";
		for(int i=0; i<word1.length() || i<word2.length();i++)
		{
			if(i<word1.length())
			{
				result = result+ word1.charAt(i);
			}
			if(i<word2.length())
             {
				result = result +word2.charAt(i);
	         }
			
		}
			
		System.out.println(result);	
		
	}
	
	public void mergeStringsUsingBuilder(String word1, String word2)
	{
		//String result= "";
		StringBuilder b = new StringBuilder();
		
		for(int i=0; i<word1.length() && i<word2.length(); i++)
		{
			if(i<word1.length())
			{
				b.append(word1.charAt(i));
			}
			
			if(i<word2.length())
			{
				b.append(word2.charAt(i));
			}
		}
		System.out.println(b);
		
	}
  
	public void mergeStringsUsingWhileLoop(String word1, String word2)
	{
		
		StringBuilder b = new StringBuilder();
		
	  int i=0;  int j=0;
	     
	  while(i<word1.length() || j<word2.length())
	  {
		  if(i<word1.length())
		  {
			  b.append(word1.charAt(i++));
		  }
		  
		  if(j<word2.length())
		  {
			  b.append(word2.charAt(j++));
		  }

	  }
	  
	  System.out.println(b);
	  
	}
	
	

}
