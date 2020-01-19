package com.learnjava;


/*How to Reverse a String in Java */

/* 1. We can either use StringBuilder and use the inbuilt function or use the for loop and reverse logic.. */


public class ReverseAString {
	
	public static void main(String[] args) {
		
		String s = "Reverseme";
		String rev = "";
		// 1. using StringBuilder and reverse function
		/*StringBuilder sb = new StringBuilder(s);
		
		System.out.println(sb.reverse());*/
		
		
		//using for loop ..... 
		for(int i = s.length()-1;i>=0;i--){
			
			rev = rev+ s.charAt(i);
		}
		System.out.println(rev);
		
	}

}
