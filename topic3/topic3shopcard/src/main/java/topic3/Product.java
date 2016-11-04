package topic3;

import java.util.ArrayList;

public class Product {
	private static ArrayList<CardShop> cardshop = new ArrayList<CardShop>();	
 	private static Product product = null;
 
 	public Product() {	
 	}
 	
 	public static Product getInstance() {
 		if (product == null) {
 			product = new Product();
 		}
 		return product;
 	}
 	
 	
 	public ArrayList<CardShop> getCardShop() {
 		return cardshop;
 	}
 
 	public void setCardShop(ArrayList<CardShop> cardshop) {
 		Product.cardshop = cardshop;
 	}
 	
 	public void addCardShop (CardShop i){
 		cardshop.add(i);
 	}
 	
 	public void deleteCardShop (CardShop i){
 		
 				cardshop.remove(i);
 			
 	}
 	public void finish(){
 		product = null;
 		cardshop = new ArrayList<CardShop>();
 	}
 	
 	
 	
  }


