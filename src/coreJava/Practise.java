package coreJava;

public class Practise {
	public static void main(String[] args) {
		String rev= "Venba Vasudev";
		Practise p = new Practise();
		//p.reverseString(rev);
	//	p.containVowels(rev);
		p.fibonacci();
	}

	public void reverseString(String rev)
	{
		char ch = 0;
		
		String[]rev1=  rev.split(" ");
		
		String revString ="";
		
		for(int i=0 ;i<rev1.length;i++)
		{
			String word = rev1[i];
			//System.out.println(word);
			String revEachWord = "";
		
		
		for(int j= word.length()-1;j>=0;j--)
		{
			ch = word.charAt(j);
			//System.out.println(ch);
			revEachWord = revEachWord +ch;
			
		}
		revString = revString+revEachWord;
		}
		
		
		System.out.println(revString);
		
		
	}
	
	public void containVowels(String rev)
	{
		String vowel = "aeiou";
		int count = 0;
		for(int i=0;i<rev.length();i++)
		{
			char ch = rev.charAt(i);
			
			if(vowel.indexOf(ch)!= -1)
			{
				count++;
				System.out.println("Vowel is" +ch);
			}
			
		}
		System.out.println(count);
		
		
	}
	
	public void fibonacci()
	{
		int n =0;
		int m =1;    // 0,1,1,2,3
		int o=1;
		int count =5;
		
		for(int i=0;i<=count;i++)
		{
			n=m;
			m=o;
			o =m+n;   
			// a=b; b=c; c= a+b;
			
			System.out.print(" " +o);
		}
		
	
		
	}
	
	public void checkOdd()
	{
		
	}
	
}
