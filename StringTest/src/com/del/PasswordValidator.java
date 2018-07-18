package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ^ start of line
// () one group
// \d{n} match n digits , where n.=0
// -? match a dash optional
// $ end of line
public class PasswordValidator {
	Pattern pattern;
	Matcher matcher;
	private String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z](?=.*[@#$%^&+=])(?=\\S=$).{8,}$";
	public PasswordValidator() {
		
		pattern=Pattern.compile(regex);
		
		
	}


	public static void main(String[] args) {
		PasswordValidator idv=new PasswordValidator();
		Scanner scan=new Scanner(System.in);
		// use while while for multiple inputs
		while(true)
		{
		System.out.println("Enter the password ");
		String input = scan.nextLine();
		
		boolean valid = idv.validate(input);
		System.out.println("password valid : "+valid);
		}
	}

	private boolean validate(String input) {
		boolean valid=false;
		matcher =pattern.matcher(input);
		valid=matcher.matches();
		return valid;
	}

}
