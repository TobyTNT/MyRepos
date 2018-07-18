package com.del;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		
		StarPyramid sp=new StarPyramid();
		sp.createstar();

	}

	private void createstar() {
		String c="*";
		String space=" ";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=scan.nextInt();
		int half=rows/2;
		for(int i=0;i<=half;i++)
		{
			for(int j=0;j<=(rows-i);j++)
			{
				System.out.print(space);
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("  "+c+" ");
			}
		 System.out.println();
		}
		for(int i=half;i<=rows;i++)
		{
			for(int j=0;j<=(rows-i);j++)
			{
				System.out.print(space);
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(c+" "+c+" ");
			}
			System.out.println();
		}
		
		
			}
					
				
				
		
		
	}


