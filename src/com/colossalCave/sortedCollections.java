package com.colossalCave;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class sortedCollections {
	
	private static StockList stockList = new StockList();
	
	public static void main(String[] args) {
		StockItem temp = new StockItem("Bread",0.86,100);
		
		stockList.addStockItem(temp);
		
		temp = new StockItem("Cake",2.86,100);
		stockList.addStockItem(temp);
		
		temp = new StockItem("Mangoes",2.86,100);
		stockList.addStockItem(temp);
		
		temp = new StockItem("Apples",3.86,100);
		stockList.addStockItem(temp);
		
		temp = new StockItem("Juice",4.86,100);
		stockList.addStockItem(temp);
		
		temp = new StockItem("Mangoes",3.86,100);
		stockList.addStockItem(temp);
		
		temp = new StockItem("Cup",3.86,300);
		stockList.addStockItem(temp);
		
		System.out.println(stockList.toString());
		

		Basket joshuasBasket = new Basket("Joshua");
		
		sellItem(joshuasBasket,"Cup",100);
		sellItem(joshuasBasket,"Juice",5);
		sellItem(joshuasBasket,"Cup",1);
		
		System.out.println(joshuasBasket.toString());
		
		removeItem(joshuasBasket,"Cup",9);
		removeItem(joshuasBasket,"Juice",2);
		
		System.out.println(joshuasBasket.toString());
		
		removeItem(joshuasBasket,"Cup",92);
		removeItem(joshuasBasket,"Juice",3);
		
		System.out.println(joshuasBasket.toString());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		sellItem(joshuasBasket,"Cup",100);
		sellItem(joshuasBasket,"Juice",5);
		sellItem(joshuasBasket,"Cup",1);
		
		
		
		System.out.println("STOCK LIST");
		System.out.println(stockList.toString());
		
		System.out.println(joshuasBasket.toString());
		
//		sellItem(joshuasBasket, "Mangoes", 50);
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println(stockList.toString());
//		
//		sellItem(joshuasBasket, "Apples", 50);
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println(stockList.toString());
//		
//		sellItem(joshuasBasket, "Juice", 50);
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println(stockList.toString());
//		
//		removeItem(joshuasBasket, "Mangoes", 25);
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println(stockList.toString());
//		
//		System.out.println(joshuasBasket.toString());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	
	public static int sellItem(Basket basket, String item, int quant) {
		StockItem product = 	stockList.getStockItem(item);
		if(product == null) {
			System.out.println("We do not sell that item");
			return 0;
		}
		
		if(stockList.reserveStock(item, quant) != 0) {
			basket.addToBasket(product, quant);
			return basket.addToBasket(product, quant);
		}
		
		System.out.println("We do not have enough of that item");
		return 0;
		
		
	}
	
	public static int removeItem(Basket basket, String item, int quant) {
		StockItem product = stockList.getStockItem(item);
		if(product == null) {
			System.out.println("We do not sell that item");
			return 0;
		}
		
		if(basket.removeFromBasket(product, quant) == quant) {
			
			return stockList.unreserveStock(product.getName(), quant);
		}
		
		System.out.println("We do not have enough of that item");
		return 0;
		
		
	}
	
	public static void checkOut(Basket basket) {
		for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet()) {
			stockList.sellStock(item.getKey().getName(), item.getValue());
		}
		
		basket.clearBasket();
	}
}
