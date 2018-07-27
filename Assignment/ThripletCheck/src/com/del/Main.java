package com.del;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array followed by elements of array");
		int length=scan.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=scan.nextInt();
		}
		UserMainCode obj=new UserMainCode();
		boolean check=obj.checkTripplets(arr);
		
		System.out.println(check);
		
		

	}

}
