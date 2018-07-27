package com.del;

import java.util.Scanner;

public class Addition extends Arithemetic {

	public Addition() {
		
	}
    Scanner scan=new Scanner(System.in);
	@Override
	public void calculate() {
		num3=num1+num2;
		display();
		
	}



	@Override
	public void read() {
		System.out.println("Enter two number to add");
		try
		{
		num1=scan.nextInt();
		num2=scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter valid numbers");
		}
		calculate();
		
	}



	@Override
	public void display() {
		System.out.println(+num1+"+"+num2+"="+num3);
		
	}

}
