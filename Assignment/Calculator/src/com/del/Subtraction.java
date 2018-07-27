package com.del;

import java.util.Scanner;

public class Subtraction extends Arithemetic {

	public Subtraction() {
		
	}
	Scanner scan=new Scanner(System.in);
	@Override
	public void calculate() {
		num3=num1-num2;
		display();
	}

	@Override
	public void read() {
		try
		{
		System.out.println("Enter number to be subtracted from");
		num1=scan.nextInt();
		System.out.println("Enter number to be subtracted ");
		num2=scan.nextInt();
		calculate();
		}
		catch(Exception e)
		{
			System.out.println("Enter valid numbers");
		}
	}

	@Override
	public void display() {
		System.out.println(num1+"-"+num2+"="+num3);
		
	}

}
