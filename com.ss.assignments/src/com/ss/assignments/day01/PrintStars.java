package com.ss.assignments.day01;

public class PrintStars {
	
	public void one() {
		int x = 4;
		
		for(int j = 0; j < x; j++) {
			for(int i = 0; i <= j ; i++) {
				System.out.print(("*"));
			}
			System.out.print("\n");
		}
		System.out.println("PrintStars one()");
		
	}
}
