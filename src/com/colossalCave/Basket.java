package com.colossalCave;

import java.util.Collections;
//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
	private final String name;
	private final Map<StockItem, Integer> list;
	
	Basket(String name) {
		this.name = name;
		//Tree map keeps a natural order of the keys
		this.list = new TreeMap<StockItem,Integer>();
	}
	
	public int addToBasket(StockItem item, int quantity) {
		
		if((item != null) && (quantity > 0)) {
			int inBasket = list.getOrDefault(item, 0);
			list.put(item, inBasket + quantity);
			return inBasket;
		}
		
		return -1;
		
	}
	
	public int removeFromBasket(StockItem item, int quantity) {
		
        if((item != null) && (quantity > 0)) {
            // check if we already have the item in the basket
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;

            if(newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if(newQuantity == 0) {
                list.remove(item);
                return quantity;
            }
        }
        return 0;
	}
	
	
	public void clearBasket() {
		this.list.clear();
	}
	
	
	public Map<StockItem, Integer> Items(){
		return Collections.unmodifiableMap(list);
	}
	
	public String toString() {
		String s = "\nShopping basket " + name + " contains " + list.size() + " items. \n";
		double totalCost = 0;
		for(Map.Entry<StockItem, Integer> item : list.entrySet()) {
			s = s + item.getKey() + ". $"+item.getKey().getPrice() * item.getKey().getReservedStock() + "\n";
			totalCost += item.getKey().getPrice() * item.getKey().getReservedStock();
		}
		
		return s + totalCost;
	}
	
	public static void main(String[] args) {
		

	}

}
