package InterviewPrograms;

public class StringContainsVowel {

	public static void main(String[] args) {
	
		String str = "fgdhfbiiidhfkeio";
		String vowel = "aeiou";
		int count =0;
		
		for(int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			if(vowel.indexOf(c) !=  -1)
			{
				count++;
				System.out.println("Vowels present are:" + c);
			}
			
		}
		
		System.out.println("No. of Vowels present: " +count);
		
	}
	
}
