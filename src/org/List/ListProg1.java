package org.List;

import java.util.ArrayList;
import java.util.List;

public class ListProg1 {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		
		for (Object object : l) {
			System.out.println(object);
			
		}
	}
}

