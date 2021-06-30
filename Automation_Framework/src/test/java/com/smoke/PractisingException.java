package com.smoke;

public class PractisingException {
	public static void main(String[] args){
		System.out.println("hi");
		
		try {
		System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("BYE");
	}

}
