package com.del;

public class MyStringTest 
{
	
	public MyStringTest() {
		String str = "Hello";
		System.out.println("str is :"+str);
		modify(str);// String is immutable , it is a constant
		System.out.println("After modify str :"+str);
		StringBuilder sb=new StringBuilder("Hello");
		modify(sb);
		System.out.println("sb is :"+sb);//String builder is not immutable
	}
	private void modify(StringBuilder sb) {
			sb.append( "guys");
		
	}
	private void modify(String str)
	{
		str=str.concat("guys");//new String object
		System.out.println("Here str : "+str);
	}

	public static void main(String[] args) 
	{
		new MyStringTest();
	}
}
