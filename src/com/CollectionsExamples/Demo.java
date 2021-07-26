package com.CollectionsExamples;

public class Demo {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre("Olympian",2,5);
		theatre.getSeats();
		
		if(theatre.reserveSeatBinaryMethod("A01")) {
			System.out.println("Pay");
		}else {
			System.out.println("Seat Taken");
		}
		
		
		//System.out.println(theatre.binarySearch(, l, r, x));
		
//		if(theatre.reserveFractal("H11")) {
//			System.out.println("Pay");
//		}else {
//			System.out.println("Seat Taken");
//		}
		

	}

}
