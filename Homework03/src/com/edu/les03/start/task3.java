package com.edu.les03.start;

public class task3 {

	public static void main(String[] args) {
		double x1 = 2;
		double y1 = 2;
		double x2 = 4;
		double y2 = 4;
		double x3 = 5;
		double y3 = 5;
		double a = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double b = Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double c = Math.sqrt( Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double perimeter = a + b + c;
		double s = perimeter / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));;
		System.out.println("perimeter = " + perimeter);
		System.out.println("area = " + area);

	}

}
