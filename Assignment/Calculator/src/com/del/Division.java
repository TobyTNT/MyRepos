package com.del;

import java.util.Scanner;

public class Division extends Arithemetic{

	public Division() {
		
	}
	Scanner scan=new Scanner(System.in);
	@Override
	public void calculate() {
			num3=num1/num2;
			display();
		
	}

	@Override
	public void read() {
		System.out.println("Enter numerator for division");
		try
		{
			
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		calculate();
		}
		catch(Exception e)
		{
			System.out.println("Enter valid numbers , cannot divide by zero");
		}
	}

	@Override
	public void display() {
		System.out.println(num1+"/"+num2+"="+num3);
		
	}

}
