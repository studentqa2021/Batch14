package com.smoke;

public class PractiseString {
	
		//static int a=50;
	//	static int b=30;
	
	
		public static void getswap(int a, int b) {
			System.out.println("before swap a value is ="+a);
			System.out.println("before swap b value is ="+b);
			//swap the value
			a=a+b;
			b=a-b;
			a=a-b;
		
		System.out.println("after swap a value is ="+a);
		System.out.println("after swap b value is ="+b);
				
		}
		public static void main(String[] args) {
			PractiseString.getswap(100,200);
			
			
		}

}
