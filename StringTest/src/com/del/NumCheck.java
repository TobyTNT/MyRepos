package com.del;

import java.util.Scanner;

public class NumCheck {

	

	public static void main(String[] args) {
		//take a n digit number from user and verify
		int digits=5;
		System.out.println("Enter a "+digits+"digit number");
		Scanner scan=new Scanner(System.in);
		String input = scan.nextLine();
		boolean valid=input.matches("\\d{"+digits+","+7+"}"); // d{5}
		System.out.println("valid is "+valid);

	}

}
