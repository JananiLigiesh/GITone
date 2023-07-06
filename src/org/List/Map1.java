package org.List;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new LinkedHashMap<>();
		
		mp.put("janu", 500);
		mp.put("Ligi", 400);
		mp.put("raj", 300);
		
		
		Set<Entry<String,Integer>>entryset = mp.entrySet();
		System.out.println(entryset);
				
		
		for (Entry<String,Integer> entry : entryset) {
			System.out.println(entry.getKey());
			
		}
		
		for (Entry<String,Integer> entry : entryset)  {
			System.out.println(entry.getValue());
			
		}		
			
		}
	}

