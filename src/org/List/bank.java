package org.List;

public class bank implements Student, Employee  {
	
	public void savings() {
		System.out.println("Savings is 20%");
	}
	
	
	public static void main(String[] args) {
		
		bank b = new bank();
		b.age();
		b.regno();
		b.id();
		b.savings();
	}

	@Override
	public void age() {
	System.out.println(30);
		
	}

	@Override
	public void regno() {
		System.out.println("122334");
		
	}

	@Override
	public void id() {
		System.out.println("789");
		
	}

	
	}

