package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListLearning {
public static void main(String[] args) {
	
	ArrayListLearning al = new ArrayListLearning();
	al.arrayListExample();
}
public void arrayListExample()
{
  
	List<String> arrayList = new ArrayList<String>();
	arrayList.add("BMW");
	arrayList.add("Benz");
	arrayList.add("Bugatti");
	arrayList.add("Bugatti");
	arrayList.add("Jaguar");
	
	
	System.out.println(arrayList);
	System.out.println(arrayList.get(3));
	System.out.println(arrayList.indexOf("Benz"));
	System.out.println(arrayList.lastIndexOf("Bugatti"));
	
	List<String> anotherList = new ArrayList<String>();
	anotherList.addAll(arrayList);
	System.out.println(anotherList);
	
	anotherList.clear();
	System.out.println(anotherList);
	
	arrayList.remove(0);
	System.out.println(arrayList);
	
	arrayList.remove("Benz");
	System.out.println(arrayList);
	
	arrayList.set(0, "Chevrolet");
	System.out.println(arrayList);
	
	arrayList.add(null);
	System.out.println(arrayList);
	
	for (String string : arrayList) {
		System.out.println("Using ForEach:" +string);
		
	}
	for(int i=0;i<arrayList.size();i++)
	{
		System.out.println("Using ForLoop:"+arrayList.get(i));
	}
	
	System.out.println("_____________");
	
	ListIterator<String> listIterator = arrayList.listIterator();
	System.out.println(listIterator.next());
	
	while(listIterator.hasNext())
	{
		System.out.println(listIterator.next());
	}
	
	while(listIterator.hasPrevious())
	{
		System.out.println("Previous:" + listIterator.previous());
	}
	Iterator<String> iterator =  arrayList.iterator();
	
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	
}
}
