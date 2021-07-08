package com.smoke;

public class ReverseString {
	public static void getOpposite(String name) {
		
		for(int i=( name.length()-1);i>=0;i--) {
			System.out.println(name.charAt(i));
		}
		
		
	}
public static void main(String[] args) {
	 getOpposite("BANGLADESH");
}
}
