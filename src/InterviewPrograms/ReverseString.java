package InterviewPrograms;

public class ReverseString {
	public static void main(String[] args) {
		
		ReverseString rs = new ReverseString();
		rs.reverseWordsOnly();
		
		String name = "Venba Vasudev";
		
		String rstr="";
		char ch ;
		
		System.out.print("Original :");
		System.out.println(name);
		
//		for(int i=0; i<name.length();i++)
//		{
//			 ch = name.charAt(i);
//			 rstr = ch+rstr;
//			
//			
//		}
		
	//	 System.out.println(rstr);
		 
		 
		 for(int i= name.length()-1;i>=0;i--)
		 {
			 ch = name.charAt(i);
			 System.out.print(ch);
			 
		 }
		 
		 System.out.println("\n");
		 // Reverse each word in sentence
		 
		 String str = "Reversing this whole sentence by word";
		 
		String[] eachword= str.split(" ");
		//String revWord ="";
		String revString = "";
		
		for(int i=0; i<eachword.length; i++)
		{
			
			String word = eachword[i];
			//System.out.println(word);
		String revWord ="";
		
		 
		 for(int j= word.length()-1; j>=0;j--)
			 
		 {
			 char ch1 = word.charAt(j);
			// System.out.print(ch1);
			 revWord = revWord + ch1;
		 }
		 revString = revString + revWord + " ";
		
		
		}
		 System.out.println(revString);
		 
		 
		 // Reverse only alphabets
		 
	}
	
	public void reverseWordsOnly()
	{
	   String word = "Reverse Each Word";
	    String[] ar=word.split(" ");
        String revString="";
        
        for(int i=0;i<ar.length;i++)
        {
        	String eachWord=ar[i];
        	String revChar="";
        	
        	for(int j=eachWord.length()-1;j>=0;j--)
        	{
        		char ch = eachWord.charAt(j);
        		revChar = revChar+ch;
        	}
        	revString = revString+ revChar + " ";
        }
      System.out.println(revString);  
	}

}