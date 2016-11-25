package org.ignacio.topic6;

import java.util.ArrayList;

public class CardShop {
	
	private static ArrayList<Product> products = new ArrayList<Product>();	
		private static CardShop cardShop = null;
	
		public CardShop() {	
		}
		
		public static CardShop getInstance() {
			if (cardShop == null) {
				cardShop = new CardShop();
		
		  }
			return cardShop;
		}
		
		
		public ArrayList<Product> getItems() {
			return products;
		}
	
		public void setProduct(ArrayList<Product> products) {
			CardShop.products = products;
		}
		
		public void addProduct (Product i){
			products.add(i);
		}
		
		public void deleteProduct (String name){
			for (Product i : products){
				if (i.getName().equals(name)){
					products.remove(i);
					break;
				}
			}
		}
		public void finalize(){
			cardShop = null;
			products = new ArrayList<Product>();
		}
}		