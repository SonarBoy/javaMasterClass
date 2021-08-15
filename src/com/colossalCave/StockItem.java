package com.colossalCave;

public class StockItem implements Comparable<StockItem>{
	private final String name;
	private double price;
	private int quantityStock = 0;
	private int reserved = 0;
	
	public StockItem(String name, double price,int quant) {
		this.name = name;
		this.price = price;
		this.quantityStock = quant;
	}
	
	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityStock = 0;
	}
	
	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}

	public int getAvaliableQuantityStock() {
		return quantityStock - reserved;
	}
	
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}


	public void adjustQuantityStock(int quantityStock) {
		int adjustedQuantity = this.quantityStock + quantityStock;
		
		if(adjustedQuantity >= 0) {
			this.quantityStock = adjustedQuantity;
		}
		
	}
	
	public int getReservedStock() {
		return this.reserved;
	}
	
	
	public int reserveStock(int quantity) {
		if(quantity <= this.getAvaliableQuantityStock()) {
			reserved += quantity;
			
			return quantity;
		}
		
		return 0;
	}
	
	public int unreserveStock(int quantity) {
		if(quantity <= this.reserved) {
			reserved -= quantity;
			
			return quantity;
		}
		
		return 0;
	}
	
	public int finaliseStock(int quantity) {
		if(quantity <= reserved) {
			quantityStock -= quantity;
			reserved -= quantity;
			return quantity;
		}
		
		return 0;
	}
	

	@Override
	public int compareTo(StockItem obj) {
		System.out.println("Entering comapre to");
		
		if(this == obj) {
			return 0;
		}
		
		if(obj != null) {
			return this.name.compareTo(obj.getName());
		}
		
		throw new NullPointerException();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Entering Stock Item Equals");
		
		if(obj == this) {
			return true;
		}
		
		if((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}
		
		return this.getName().equals(((StockItem)obj).getName());
	}
	
	
	@Override
	public String toString() {
		return this.name + " " + this.price + " Reserved: "+this.reserved;
	}
	
	public int hashCode() {
		return this.name.hashCode() + 29;
	}
	
}
