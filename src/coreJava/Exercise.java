package coreJava;

import java.util.ArrayList;

public class Exercise {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
	    a.add("apple");
	    a.add("banana");
	    a.add("cherry");
	    a.add("mango");
	    a.add("apple");
	    
	 //   System.out.println("Orange is not found " + a.contains("Orange"));
	    if(a.contains("Orange"))
	    {
	    	System.out.println("Orange is found");
	    }
	    else
	    {
	    	System.out.println("Orange is not found");
	    }
	    
	    System.out.println("Size of arraylist is:" + a.size());
	    
	    
	    
	    for(String s: a)
	    {
	    	 System.out.print(" "+s);
	    }
	    
	   a.remove("apple");
	   System.out.print("\n");
	   for(String s: a)
	    {
	    	 System.out.println(" "+s);
	    }
	    
	    }
	}
	

