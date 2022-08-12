package com.example;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println("Math PI: "+Math.PI);
		System.out.println("Math sqrt: "+Math.sqrt(25));
		double random = Math.random(); // from 0 to 1 in fractions i.e., 0.39392093393
		System.out.println("Random number: "+random);
		// use Math.random() and generate 6 digit OTP, 
		// this code should never display other digits OTP except 6 digits EX: 456890, 991234, ...
	}
}
