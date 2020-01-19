package com.learnjava;

import java.util.Arrays;

public class LargestSmallestNumInArray {
	
	public static void main(String[] args) {
		
		
		int num[]={-10,-20,10,50,60};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i=0;i<num.length;i++){
			
			if(num[i]>largest){
				
				largest=num[i];
			} else if(num[i]<smallest){
				smallest =num[i];
			}
			
			
		}
		System.out.println("The given array is : "+Arrays.toString(num));
		System.out.println("The largest number in the given array is : "+ largest);
		System.out.println("The smallest number in the given array is "+smallest);
	}

}
