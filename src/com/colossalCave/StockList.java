package com.colossalCave;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
	
	private final Map<String,StockItem> list;
	
	public StockList() {
		//Linked Hash map maintains insertion order
		this.list = new LinkedHashMap<String,StockItem>();
	}
	
	public int addStockItem(StockItem item) {
		if(item != null) {
			StockItem inStock = list.getOrDefault(item.getName(), item);
			
			//check if we already have quantity
			
			if(inStock != item) {
				item.adjustQuantityStock(inStock.getAvaliableQuantityStock());
			}
			
			
			list.put(item.getName(), item);
			return item.getAvaliableQuantityStock();
		}
		
		return 0;
	}
	
	public int reserveStock(String item, int quantity) {
		StockItem inStock = list.get(item);
		
		if(inStock != null && quantity > 0) {
			return inStock.reserveStock(quantity);
		}
		
		return 0;
	}
	
	public int unreserveStock(String item, int quantity) {
		StockItem inStock = list.get(item);
		
		if(inStock != null && quantity > 0) {
			return inStock.unreserveStock(quantity);
		}
		
		return 0;
	}
	
	public int sellStock(String item, int quantity) {
		StockItem inStock = list.get(item);
		
		if(inStock != null && quantity > 0) {
			return inStock.finaliseStock(quantity);
		}
		
//		StockItem inStock = list.getOrDefault(item, null);
//		
//		if((inStock != null) && (inStock.getAvaliableQuantityStock() >= quantity) && (quantity > 0)) {
//			quantity = -1 * quantity;
//			inStock.adjustQuantityStock(quantity);
//			return quantity;
//		}
		
		return 0;
	}
	
	public StockItem getStockItem(String name) {
		return list.get(name);
	}
	
	public Map<String,StockItem> Items(){
		//READ ONLY COPY SEND BACK TO THE USER THROWS UNSUPPORTED EXCEPTION IF FUNCTION IS CALLED TO CHANGE IT 
		return Collections.unmodifiableMap(list);
	}
	
	
	public Map<String, Double> PriceList(){
		Map<String, Double> prices = new LinkedHashMap<String, Double>();
		
		for(Map.Entry<String, StockItem> item: list.entrySet()) {
			prices.put(item.getKey(), item.getValue().getPrice());
		}
		
		return Collections.unmodifiableMap(prices);
	}
	
	public String toString() {
		String itemList = "";
		double total = 0;
		
		for(Map.Entry<String, StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();
			
			//double itemValue = stockItem.getPrice() * stockItem.getAvaliableQuantityStock();
			
			itemList += "ITEM NAME: "+  stockItem.getName()  +" QTY: " + stockItem.getAvaliableQuantityStock() + "\n";
			itemList += "VALUE: $" + ((int)stockItem.getAvaliableQuantityStock()) * stockItem.getPrice() + "\n";
			
			total += (((int)stockItem.getAvaliableQuantityStock()) * stockItem.getPrice());
		}
		
		itemList += " \n____________________\n";
		itemList += "$ " +total;
		
		return itemList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
