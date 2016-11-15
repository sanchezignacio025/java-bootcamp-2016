package org.ignacio.topic6;


	import java.util.ArrayList;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	  
	    @RestController
	    public class CardShopFactory implements CardShopServices{
	
		CardShop cartInstance = CardShop.getInstance();
		ArrayList<Product> productList = null;
		
		@RequestMapping("/")
		String CardShop(){
			return "CardShop Api";
		}
		
		@RequestMapping("/add")
		public String addProduct(@RequestParam(value="name", defaultValue="") String name , @RequestParam(value="price", defaultValue="0") double price  ) {
			Product i = new Product(name, price);
			cartInstance.addProduct(i);
			return "Product " + name + " added";
		
		}
	
		@RequestMapping("/delete")
		public String deleteProduct(@RequestParam(value="name", defaultValue="") String name) {
			cartInstance.deleteProduct(name);
			return "Product " + name + " deleted";
		}
	
		@RequestMapping("/showProduct")
		public CardShop showProduct() {
			return cartInstance;
		}

	
	}


