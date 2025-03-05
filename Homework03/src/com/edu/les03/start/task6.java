package com.edu.les03.start;

public class task6 {

	public static void main(String[] args) {
		int number = 1234;
		if ( number < 1000 || number > 9999){
			System.out.println("Error");}
			else { 
				int a = 1;
				while (number > 0) {
					a *= number % 10;
					number /= 10;
				}
			System.out.println("a = " + a);
			}
		}

	}

