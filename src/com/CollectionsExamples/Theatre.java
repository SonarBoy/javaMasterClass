package com.CollectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Theatre {
	
	private final String theatreName;
	private List<Seat> seats = new ArrayList<>();
//	private Collection<Seat> seats = new HashSet<>();
//	private Collection<Seat> seats = new LinkedHashSet<>();
	
	static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
		
		@Override
		public int compare(Seat seat1, Seat seat2) {
			
			if(seat1.getSeatPrice() < seat2.getSeatPrice()) {
				return -1;
			}else if(seat1.getSeatPrice() > seat2.getSeatPrice()) {
				return 1;
			}else {
				//return this.seatNumber.compareToIgnoreCase(that.getSeatNumber());
				return 0;
			}
		}
	};
	
	
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (numRows - 1);
		
		for(char row = 'A'; row <= lastRow; row++) {
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				
				double price = 12.00;
				
				if((row < 'D' ) && (seatNum >= 4 && seatNum <= 9)) {
					price = 14.00;
				}else if((row > 'F') && (seatNum >= 4 && seatNum <= 9)) {
					price = 7.00;
				}
				
				Seat seat = new Seat(row + String.format("%02d", seatNum),price);
				seats.add(seat);
				
			}
			
		}
	}
	
	public String getTheatreName() {
		return theatreName;
	}
	
	public Collection<Seat> getSeatsList(){
		return this.seats;
	}
	
	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber,0);
		
		int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
		
		if(foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		}else {
			System.out.println("There is no seat" + seatNumber);
			return false;
		}
//		
//		for(Seat seat: seats) {
//			if(seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			}
//		}
//		
//		if(requestedSeat == null) {
//			System.out.println("There is no seat "+seatNumber);
//			return false;
//		}
//		
//		return requestedSeat.reserve();
	}
	
	public boolean reserveSeatBinaryMethod(String seatNumber) {
		int low = 0;
		int high = seats.size() - 1;
		
		while(low <= high) {
			
			System.out.println(".");
			
			int mid = (low + high) / 2;
			
			Seat midVal = seats.get(mid);
			
			int cmp = midVal.getSeatNumber().compareTo(seatNumber);
			
			if(cmp < 0) {
				
				low = mid + 1;
				
			}else if(cmp > 0) {
				
				high = mid - 1;
				
			}else {
				return seats.get(mid).reserve();
			}
		}
		
		System.out.println("There is no seat " + seatNumber);
		return false;
	}
	
	int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
  
        // We reach here when element is not present
        // in array
        return -1;
    }
	
	public void getSeats() {
		for(Seat seat: seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	
	public class Seat implements Comparable<Seat>{
		private final String seatNumber;
		private boolean reserved = false;
		private double price;
		
		
		
		public Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price = price;
		}
		
		public boolean reserve() {
			
			if(!this.reserved) {
				
				this.reserved = true;
				System.out.println("Seat "+seatNumber+" reserved");
				
				return true;
				
			}else {
				
				return false;
				
			}
		}
		
		public boolean cancel() {
			
			if(this.reserved) {
				this.reserved = false;
				System.out.println("Reserved of seat " + seatNumber + " cancelled");
				
				return true;
			}else {
				return false;
			}
		}
		
		public String getSeatNumber() {
			return seatNumber;
		}
		
		public double getSeatPrice() {
			return price;		
		}

		@Override
		public int compareTo(Seat that) {
			
			return this.seatNumber.compareToIgnoreCase(that.getSeatNumber());
			
		}
	}
}
