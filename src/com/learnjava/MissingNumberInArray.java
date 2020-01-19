package com.learnjava;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] ={1,2,4,5};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			
			sum=sum+a[i];
		}
		
		int sum1= 0;
		
		for(int j=1;j<=5;j++){
			sum1=sum1+j;
		}
		int mn = sum1-sum;
		System.out.println(mn);
	}
	
}
