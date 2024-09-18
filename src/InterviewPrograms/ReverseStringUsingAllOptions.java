package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringUsingAllOptions {
	public static void main(String[] args) {
		ReverseStringUsingAllOptions p = new ReverseStringUsingAllOptions();
		String name = "Venba";
		p.CoreReverse(name);
		p.stringBuffer(name);
		p.usingCollections(name);
		
	}
	
	public void CoreReverse(String name)
	{
        
		
		for(int i=name.length()-1;i>=0;i--)
		{
		 char ch = name.charAt(i);
		 System.out.print(ch);
		}
	}
	
	public void stringBuffer(String name)
	{
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println("\n");
		System.out.println(buffer.reverse());
		
	}
	
	public void usingCollections(String name)
	{
		char[] array=name.toCharArray();
		List<Character>list = new ArrayList<Character>();
		
		for (Character character : array) {
			list.add(character);
			
		}
	//	System.out.println(list);
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}
	}

}
