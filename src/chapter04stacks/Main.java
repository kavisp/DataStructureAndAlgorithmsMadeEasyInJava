/*Copyright (c) Jun 18, 2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Main.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter04stacks;

public class Main {
	public static void main(String[] args) throws Exception {
		DynamicArrayStack stack = new DynamicArrayStack();
		stack.push(10);
		stack.push(12);
		stack.push(13);
		stack.push(10);
		System.out.println(stack.pop());
	}
}
