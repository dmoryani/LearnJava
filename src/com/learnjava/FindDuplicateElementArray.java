package com.learnjava;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementArray {
	
	public static void main(String[] args) {
		
		
		String a[] ={"Java","JS","Ruby","C","Java"};
		
		Set<String> names = new HashSet<String>() ;
		
		for(String lang : a){
			if(names.add(lang)==false){
				
				System.out.println("The duplicate name is : " +lang );
			}
		}
		
		
	}

}
