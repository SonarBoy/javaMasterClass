package com.InterfacesExamples;

public class RecursionExample {
	public static void main(String [] args) {
		
		int results = sum(5);
		
		int resl = sub(5);
		
		System.out.println(results);
		
		System.out.println(resl);
		
	}
	
	public static int sum(int k) {
		
		if(k > 0) {
			return k + sum(1 - k);
		}else{
			return 0;
		}
		
	}
	
	public static int sub(int k) {
		
		if(k > 0) {
			return k - sub(1 - k);
		}else {
			return 0;
		}
	}
}
