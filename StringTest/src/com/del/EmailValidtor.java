package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ^ start of line
// () one group
// \d{n} match n digits , where n.=0
// -? match a dash optional
// $ end of line
public class EmailValidtor {
	Pattern pattern;
	Matcher matcher;
	private String regex="^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z] {2,})$";
	public EmailValidtor() {
		
		pattern=Pattern.compile(regex);
		
		
	}


	public static void main(String[] args) {
		EmailValidtor idv=new EmailValidtor();
		Scanner scan=new Scanner(System.in);
		// use while while for multiple inputs
		while(true)
		{
		System.out.println("Enter the email ");
		String input = scan.nextLine();
		
		boolean valid = idv.validate(input);
		System.out.println("email valid : "+valid);
		}
	}

	private boolean validate(String input) {
		boolean valid=false;
		matcher =pattern.matcher(input);
		valid=matcher.matches();
		return valid;
	}

}
