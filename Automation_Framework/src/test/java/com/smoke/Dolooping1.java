package com.smoke;

public class Dolooping1 {
	//static void getInfinity() {
		static String NAME = "I AM FROM BANGLADESH";
		static void getInfinity() {
			System.out.println(NAME);//PRINT VARIABLE
			System.out.println(NAME.length());//total how many character
			System.out.println(NAME.charAt(3));//specific character number
			System.out.println(NAME.charAt(NAME.length()-1));//LAST CHARACTER
			
			
		
	}
	public static void main(String[] args) {
		getInfinity();
	}
}