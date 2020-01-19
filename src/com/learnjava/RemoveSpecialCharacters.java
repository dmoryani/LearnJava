package com.learnjava;

public class RemoveSpecialCharacters {
	
	public static void main(String[] args) {
		
		
		String s = "@!#$%^abcd&*^D98760()";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
