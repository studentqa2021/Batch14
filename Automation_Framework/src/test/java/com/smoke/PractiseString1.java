package com.smoke;

import java.util.Arrays;

public class PractiseString1 {
	String countryname="UNITED STATE OF AMERICA";
	
	void getPieces() {
		String[] pieces=countryname.split(" ");
		
		
		
		System.out.println(Arrays.toString(pieces));
	}
	public static void main(String[] args) {
		PractiseString1 obj=new PractiseString1();
		obj.getPieces();
	}

}
