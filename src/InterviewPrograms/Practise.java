package InterviewPrograms;

public class Practise {
public static void main(String[] args) {
	Practise p = new Practise();
	p.plaindrome();
	
}

public void plaindrome()
{
    String text = "MAL";
    char ch = 0;
    char ch1 = 0;
    for(int i=0;i<text.length();i++)
    {
    	ch = text.charAt(i);
    	System.out.print(ch);
    }
    System.out.print("\n");
    for(int j=text.length()-1;j>=0;j--)
    {
    	ch1 = text.charAt(j);
    	
    	System.out.print(ch1);
    }
    System.out.println("\n");
    if(ch==ch1)
    {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("Not Palindrome");
    }
    
}
}
