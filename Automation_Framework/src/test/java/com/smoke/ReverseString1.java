package com.smoke;

public class ReverseString1 {
	public static void getOpposite1(String name) {
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		//System.out.println(" ");
		//for(int i=(name.length()-1); i>=0;i--) {
			//System.out.println(name.charAt(i));
		//}
	}
	 static void getBuffer(String Countryname) {
				StringBuilder obj=new StringBuilder(Countryname);
			System.out.println(obj.reverse());
			
		}
			
	
public static void main(String[] args) {
	 getOpposite1("BANGLADESH");
	 System.out.println(" ");
	 getBuffer("NEW YORK");
}
}
