package com.ss.assignments.day01;
import java.util.*;

public class RandomNum {
	private int random;
	int userInput;
	
	RandomNum(){
		this.generateRandom();
	}
	
	private void generateRandom() {
		this.random  = (int)(Math.random() * 100);
		System.out.println("generateRandom: " + this.random);
	}

	public void readInput() {
		int x;
		Scanner scanny = new Scanner(System.in);
		System.out.println("Guess the number 1-100: ");
		x = scanny.nextInt();
		this.userInput = x;
		this.compareNums();
	}
	
	public void compareNums() {
		if(this.random-10 <= this.userInput && this.userInput <= this.random + 10) {
			System.out.println("You were within +-10 of the number: " + this.random);
			System.exit(0);
		}else {
			System.out.println("you were further than +-10, guess again.");
			this.readInput();
		}
	}
}
