package com.del;


	import java.util.Comparator;

	public class Employeesort implements Comparator<EmployeeVo> {

		@Override
		public int compare(EmployeeVo e, EmployeeVo e1) {
			
			return (int)(e.getTax()-(e1.getTax()));
		}

	}

