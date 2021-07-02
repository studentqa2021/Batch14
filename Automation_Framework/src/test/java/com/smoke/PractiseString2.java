package com.smoke;

public class PractiseString2 {
	int a=30;
	int b=40;
	
   void	getSwap2(){
	   System.out.println("the value of a is="+a);
	   System.out.println("the value of b is="+b);
	   
	   
	   a=a+b;//70
	   b=a-b;//30
	   a=a-b;//40
	   
	   System.out.println("the value after swap a="+a);
	   System.out.println("the value after swap b="+b);
		
	}
   public static void main(String[] args) {
	   
	   PractiseString2 obj=new PractiseString2();
	   obj.getSwap2();
}

}
