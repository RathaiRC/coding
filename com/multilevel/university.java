package com.multilevel;

public class university extends colleges {
	public void admin()
	{
		String uni="Bharathiyar University";
		String addr="Cbe";
		System.out.println("Name of the University:"+ uni);
		System.out.println("Address:"+ addr);
	}
	public static void main(String args[]) {
		university obj=new university();
		
		obj.admin();
		obj.college1();
		obj.college2();
	}
}
