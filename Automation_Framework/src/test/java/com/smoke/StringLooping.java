package com.smoke;

public class StringLooping {
	static String name="SMARTTECH";
	public static void main(String[] args) {
		//System.out.println(name.length());
		//System.out.println(name.charAt(6));
		//System.out.println(name.charAt(name.length()-1));
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
			System.out.println(" ");
		
		for(int i=(name.length()-1);i>=0;i--){
			System.out.println(name.charAt(i));
			
		}
		
	}

}
