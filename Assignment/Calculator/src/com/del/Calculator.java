package com.del;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		try
		{
		while(true)
		{
		System.out.println("Enter choice : ");
		System.out.println("0:Addition");
		System.out.println("1:Subtraction");
		System.out.println("2:Multiplication");
		System.out.println("3:Division");
		int choice = scan.nextInt();
		Arithemetic object_array[]= {new Addition(),new Subtraction(),new Multiplication(),new Division()};
		
		object_array[choice].read();
		}
		}
		catch(Exception e)
		{
			System.out.println("Enter valid choice");
		}
	}
}
	

