package org.List;


import java.util.ArrayList;
import java.util.List;

public class ListProg {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		
		for (Integer a : li) {
			System.out.println(a);
			
		}
	}
}
