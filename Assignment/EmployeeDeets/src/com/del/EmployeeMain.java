package com.del;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees ");
		int number = sc.nextInt();
	    ArrayList<EmployeeVo> array = new ArrayList<>(); 
	    for(int i=0;i<number;i++)
	    {
	    	System.out.println("Enter Employee ID, Employee name, Annual Income ");
	    	array.add(new EmployeeVo(sc.nextInt(),sc.next() ,sc.nextDouble(), null));
	        array.get(i).calincomeTax(array.get(i));
	    }
	    
	    for (EmployeeVo emp : array) {
			System.out.println(emp.toString());
		} 
	    
	    
	    
	    Collections.sort(array, new Employeesort());
	    System.out.println("Sotring according to tax....");
		for (EmployeeVo emp : array) {
			System.out.println(emp);
		}

	}
}
