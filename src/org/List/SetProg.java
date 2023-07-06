package org.List;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetProg {
	
	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();
		
		s.add(100);
		s.add(200);
		s.add(300);
		s.add("janani");
		s.add(500);
		
		
		for (Object m : s) {
			System.out.println(m);
			
		}
	}

}
