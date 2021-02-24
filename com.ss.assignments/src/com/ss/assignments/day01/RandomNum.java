package com.ss.assignments.day01;
import java.util.*;

public class RandomNum {
	private int random;
	private int guessCount=5;
	int userInput;
	
	RandomNum(){
		this.generateRandom();
	}
	
	private void generateRandom() {
		this.random  = (int)(Math.random() * 100);
		System.out.println("generateRandom: " + this.random);
		System.out.println("Guess the number 1-100, guesses remaining: " + this.guessCount);
	}

	public void readInput() {
		int x;
		Scanner scanny = new Scanner(System.in);
		x = scanny.nextInt();
		this.userInput = x;
		this.compareNums();
	}
	
	private void checkCount(){
		System.out.println("Guesses remaining: " + --this.guessCount);
		if(this.guessCount == 0) {
			System.out.println("Sorry, you ran out of guesses :(");
			System.exit(0);
		}
	}
	
	public void compareNums() {
		if(this.random-10 <= this.userInput && this.userInput <= this.random + 10) {
			System.out.println("You were within +-10 of the number: " + this.random);
			System.exit(0);
		}else {
			System.out.println("You were further than +-10, try again.");
			this.checkCount();
			this.readInput();
		}
	}
}
