package com.smoke;

public class PractiseBuilder {
	public static void getReverse(String name) {
		for(int i =(name.length()-1);i>=0;i--) {
			System.out.print(name.charAt(i));
	}

}
	
public static void getReversebyStringBuilder(String name) {
	StringBuilder obj=new StringBuilder(name);
	System.out.println(obj.reverse());
}
	
	
	public static void main(String[] args) {
		 PractiseBuilder.getReverse("TAMNIA");
		 System.out.println("");
		 PractiseBuilder.getReversebyStringBuilder("ALAM");
		 
	}
}