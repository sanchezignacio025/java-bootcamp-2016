package org.ignacio.topic6;



public interface CardShopServices {
	
    public String addProduct(String name, double price);
    public String deleteProduct(String name);
    public CardShop showProduct();

}
