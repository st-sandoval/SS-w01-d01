/**
 * 
 */
package com.ss.assignments.day01;

/**
 * @author m3
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main of Main");
		PrintStars printer = new PrintStars();
		printer.one();
		lineBreak();
		printer.two();
		lineBreak();
		printer.three();
		lineBreak();
		printer.four();
	}
	
	
	
	public static void lineBreak() {
		System.out.println("---------");
	}


}
