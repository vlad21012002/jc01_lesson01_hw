package com.edu.les01.start;

public class Task06 {

	public static void main(String[] args) {
		double a = 2;
		double b = 4;
		double c = 6;
		
		double rez;
		
		rez = (b + (Math.sqrt(b * b + 4 * a * c)) / 2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));
		System.out.println("rez = " + rez);

	}

}
