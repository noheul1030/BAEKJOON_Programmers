package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comparators {

	public static void main(String[] args) {

	      Map<String, Integer> map = new HashMap<>();
	      map.put("vim", 3);
	      map.put("aims", 1);
	      map.put("cimss", 2);
	      map.put("simss", 5);
	      map.put("kimss", 6);

	      List<Map.Entry<String, Integer>> listMap = new ArrayList<>(map.entrySet());

	      Collections.sort(listMap, new Comparator<Map.Entry<String, Integer>>() {
	         public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
	            Integer val1 = entry1.getValue();
	            Integer val2 = entry2.getValue();
	            return val2.compareTo(val1);
	         }
	      });
	      
	      System.out.println(listMap);

	   }

	}