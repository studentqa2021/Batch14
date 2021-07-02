package com.smoke;

import java.util.Arrays;

public class PractiseString4 {
	
	static String SchoolName="SMART TECH NEW YORK NY";
	
static	void getPieces2() {
		String[] pieces=SchoolName.split(" ");
		
		System.out.println(Arrays.toString(pieces));
		
	}
public static void main(String[] args) {
	getPieces2();
	
}
}
