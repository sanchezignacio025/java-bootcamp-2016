package topic3;

public class CardShopFactory implements CardShopServices{
	 
 	public CardShopFactory(){
 		
 	};
 	
 	public void addCardShop(CardShop i) {
 		
 		Product.getInstance().addCardShop(i);
 	
 	}
 
 	public void deleteCardShop(CardShop i) {
 		
 		
 		Product.getInstance().deleteCardShop(i);
 	}
 
 
 	public void showCardShop() {
 		
 		int count = 1;
 		for (CardShop i: Product.getInstance().getCardShop()){
 			System.out.println(count++ +". id: "+i.getId()+ " Price: " + i.getPrice()+" Description: " + i.getDescription()+" Stock: " + i.getStock());
 			
 		}
 	}



 }