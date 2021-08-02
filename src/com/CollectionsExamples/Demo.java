package com.CollectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre("Olympian",8,12);
		
		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		}else{
			System.out.println("D12 Seat already reserved");
		}
		
		if(theatre.reserveSeat("B13")) {
			System.out.println("Please pay for B13");
		}else{
			System.out.println("Seat already reserved");
		}
		
		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		}else{
			System.out.println("Seat already reserved");
		}
		
		
		
		List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeatsList());
		priceSeats.add(theatre.new Seat("B00",13.00));
		priceSeats.add(theatre.new Seat("A00",13.00));
		
		Collections.sort(priceSeats,Theatre.PRICE_ORDER);
		
		printList(priceSeats);
		
//		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//		printList(seatCopy);
//		
//		
//		seatCopy.get(1).reserve();
//		
//		if(theatre.reserveSeat("A02")) {
//			System.out.println("Please pay for A02");
//		}else{
//			System.out.println("Seat already reserved");
//		}
//		
//		//Reverse Sorting of the seats.
//		Collections.reverse(seatCopy);
//		System.out.println("Printing seatCopy");		
//		printList(seatCopy);
//		
//		//Shows that the seats in the theatre object and seatCopy point to the same data
//		System.out.println("Printing theatre Seats");
//		printList(theatre.seats);
//		
//		//Showing Shuffle method
//		Collections.shuffle(seatCopy);
//		System.out.println("Printing shuffled seatCopy");		
//		printList(seatCopy);
//		
//		
//		Theatre.Seat minSeat = Collections.min(seatCopy);
//		Theatre.Seat maxSeat = Collections.max(seatCopy);
//		
//		System.out.println("Min seat number is " + minSeat.getSeatNumber());
//		System.out.println("Max seat number is " + maxSeat.getSeatNumber());
//		
//		sortList(seatCopy);
//		System.out.println("Printing sortedList seatCopy");		
//		printList(seatCopy);
		
		//If destination of the copy does not have the same number of elements
		//that are populated already then the copy will fail.
		/*
		 * Source: { 1,2,3,4,5,6}
		 * Dest: { , , , , , }
		 * This will fail
		 * 
		 * Source: { 1,2,3,4,5,6}
		 * Dest: {0,0,0,0,0,0}
		 * This will pass
		 */
//		List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//		Collections.copy(newList,theatre.seats);
		
//		theatre.getSeats();
//		
//		if(theatre.reserveSeatBinaryMethod("A01")) {
//			System.out.println("Pay");
//		}else {
//			System.out.println("Seat Taken");
//		}
		
		
		//System.out.println(theatre.binarySearch(, l, r, x));
		
//		if(theatre.reserveFractal("H11")) {
//			System.out.println("Pay");
//		}else {
//			System.out.println("Seat Taken");
//		}
		

	}
	
	public static void printList(List<Theatre.Seat> list) {
		
		for(Theatre.Seat seat: list) {
			System.out.println(" " + seat.getSeatNumber() + " " + seat.getSeatPrice());
		}
		
		System.out.println();
		System.out.println("============================================");
	}
	
	
	public static void sortList(List<? extends Theatre.Seat> list) {
		
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i+1; j < list.size(); j++) {
				
				if(list.get(i).compareTo(list.get(j)) > 0) {
					Collections.swap(list, i, j);
				}
			}
		}
		
		
		
	}
}
