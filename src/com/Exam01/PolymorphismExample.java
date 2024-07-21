package com.Exam01;

public class PolymorphismExample {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		PolymorphismExample p = new PolymorphismExample();
		System.out.println(p.add(10, 20));
		System.out.println(p.add(10, 20,30));
		System.out.println(p.add(10.89, 20.43));
		System.out.println(p.add(10.89, 20.43,45.23));
		
		System.out.println("Person :");
		Person p2 = new Person();
		p2.Identity();
		System.out.println("\nEmployee :");
		Employee e = new Employee();
		e.Identity();
	}
}

