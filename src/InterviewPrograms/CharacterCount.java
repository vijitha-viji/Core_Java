package InterviewPrograms;

public class CharacterCount {
	//Character count of a string
	public static void main(String[] args) {
		String text = "Character Count of a String";
		
		CharacterCount cc= new CharacterCount();
		cc.characterCount(text);
		cc.wordCount(text);
	}
	
	public void characterCount(String text)
	{
		int count =0;
		String text1= text.replaceAll("\\s", "");
		for(int i=0;i<text1.length();i++)
		{
			char ch = text1.charAt(i);
		     // System.out.println(ch);
		      count++;
		}
		System.out.println(count);
	}
	
	public void wordCount(String text)
	{
		int count =0;
		String[] arr= text.split(" ");
		
		for(int i=0; i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			count++;
		}
		System.out.println(count);
	}
	
}
