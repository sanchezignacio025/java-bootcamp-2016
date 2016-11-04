package topic3;



import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class CardShopTest {
	static CardShopFactory imp;
 	
 	
 	

 
    @Before
 	public void setUpUT() throws Exception {
    	imp = new CardShopFactory();
 		Product.getInstance().addCardShop(new CardShop(1,50,"Pincel", 50));
 		Product.getInstance().addCardShop(new CardShop(2,40,"Ruler",700));
 		Product.getInstance().addCardShop(new CardShop(3, 20,"NoteBook ", 300));
 		
 		
 	}
     
 	
 	@Test
 	public void addCardShop() throws IOException {
 		System.out.println("");
 		System.out.println("add product");
 		imp.addCardShop(new CardShop(4,30,"Pen", 200));
 		assertTrue(Product.getInstance().getCardShop().size()==4);
 		imp.showCardShop();
 		Product.getInstance().finish();
 	}
 	
 	@Test 
 	public void deleteCardShop() throws IOException{
 		System.out.println("");
 		System.out.println("delete product");	
 		imp.deleteCardShop(new CardShop(2,40,"Ruler", 700));
 		
 		assertTrue(Product.getInstance().getCardShop().size()==2);
 		imp.showCardShop();
 		Product.getInstance().finish();
 	}
 	
 	@Test
 	public void showCardShop() throws IOException{
 		
 		System.out.println("");
 		System.out.println("show product");
 		assertTrue(Product.getInstance().getCardShop().size()==3);
 		imp.showCardShop();
 		Product.getInstance().finish();
 	}
 
 }