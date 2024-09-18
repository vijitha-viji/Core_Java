package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListExamplle {
	
 public static void main(String[]args)
 {
	 ArrayList<Integer> al = new ArrayList<Integer>();
	 al.add(5);
	 al.add(10);
	 al.add(6);
	 System.out.println(al);
	 System.out.println(al.remove(0));
	 System.out.println(al);
	// System.out.println(al.remove());
	 
	 //Find Maximum and minimum in ArrayList
	System.out.println("Min" + Collections.min(al));
	System.out.println("Max" + Collections.max(al));
	Collections.sort(al);
	System.out.println(al);
	 
	//Find Maximum and minimum in Array
	int[] arr= {2,5,6,12,35,11};
	
	int min = arr[0];
	int max = arr[0];
	for(int i=0; i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min= arr[i];
			
		}
		if(arr[i]>max)
		{
			max= arr[i];
			
		}
		
	}
	
	int[] asc ;
	int[] dec;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			
		}
	}
	
	
	System.out.println(min);
	System.out.println(max);

	 ArrayList<String> s = new ArrayList<String>();
	 s.add("Venba");
	 s.add("Vasu");
	 s.add(0,"Yogi");
	 System.out.println(s);
	
	// Collections.sort(s);
	 System.out.println(s);
	 s.toArray();
	 
//	 for(String s1: s)
//	 {
//		 int i = 0;
//		 s1.indexOf(s.get(i));
//	 }
	 System.out.println(s.get(0));
	 
	 // Convert arraylist to array
	String[] converted = s.toArray(new String[4]);
	
	for(String conArr:converted )
	{
		System.out.print(" " +conArr);
	}
	
	
 }

}
