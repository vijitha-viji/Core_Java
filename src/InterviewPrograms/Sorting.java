package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sorting {
	public static void main(String[] args) {
		Sorting s = new Sorting();
		s.sortingBasedOnAge();
	}
	
	public void sortingBasedOnAge()
	{
		HashMap<String,Integer> student = new HashMap<String,Integer>();
		student.put("Venba", 2);
		student.put("Vedanth", 11);
		student.put("Yogi", 6);
		
		// Convert map to list of map entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(student.entrySet());
        System.out.println(student.entrySet());

        // Sort the list by value
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Put sorted entries into a LinkedHashMap
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted by value: " + sortedByValue);
		
	}

}
