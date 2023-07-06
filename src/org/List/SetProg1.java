package org.List;

import java.util.HashSet;
import java.util.Set;

public class SetProg1 {
	
	public static void main(String[] args) {
		
		Set<Integer> m = new HashSet<>();
		
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		
		for (Integer a : m) {
			System.out.println(a);
			
		}
		
	}

}