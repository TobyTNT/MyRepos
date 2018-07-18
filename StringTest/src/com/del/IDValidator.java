package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ^ start of line
// () one group
// \d{n} match n digits , where n.=0
// -? match a dash optional
// $ end of line
public class IDValidator {
	Pattern pattern;
	Matcher matcher;
	private String regex="^(\\d{3}-?\\d{2}-?\\d{4}$)";
	public IDValidator() {
		
		pattern=Pattern.compile(regex);
		
		
	}


	public static void main(String[] args) {
		IDValidator idv=new IDValidator();
		Scanner scan=new Scanner(System.in);
		// use while while for multiple inputs
		while(true)
		{
		System.out.println("Enter the ID ");
		String input = scan.nextLine();
		
		boolean valid = idv.validate(input);
		System.out.println("ID valid : "+valid);
		}
	}

	private boolean validate(String input) {
		boolean valid=false;
		matcher =pattern.matcher(input);
		valid=matcher.matches();
		return valid;
	}

}
