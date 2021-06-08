package com.series;

public class Series {
	
	public static int nSum(int n) {
		
		int x = 0;
		
		for(int runner = 1; runner < n + 1;runner++) {
			x += runner;
		}
		
		return x;
	}
	
	
	public static int fact(int n) {
		if(n <= 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return n * fact(n - 1);
		}
	}
	
	
	public static int fibo(int n) {
		
		if(n <= 0) {
			return 0;
		}else if(n == 1){
			return 1;
		}else {
			return fibo(n - 1) + fibo(n - 2);
		}
		
	}
}
