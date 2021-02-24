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
	public void two() {
		int x = 0;
		int y = 4;
		for(int j = 0; j < y; j++) {
			for(int i = 4; i > j ; i--) {
				System.out.print(("*"));
			}
			System.out.print("\n");
		}
		System.out.println("PrintStars two()");
		
	}
	
	public void three() {
		int x = 4;
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= (-i + x); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("PrintStars three()");
	}
	
	public void four() {
		int x = 4;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 1 + 2*i; k <= (2*x - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("PrintStars four()");
	}
	
	
}
