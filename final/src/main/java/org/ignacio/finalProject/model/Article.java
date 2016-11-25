package org.ignacio.finalProject.model;

public class Article {
	public int idarticle ;
	String descripcion, category;
	int price;
	int quantity;
	
	public Article(){
	}
	
	public Article(int idarticle,String descripcion, int price,String category){
		this.idarticle=idarticle;
		this.descripcion=descripcion;
		this.price=price;
		this.category=category;
	}

	public int getArticleId() {
		return idarticle;
	}
	public void setArticleId(int idarticle) {
		this.idarticle =idarticle;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}	
	public String getCategory(String category) {
	     return category;
	     
	}
	
	public void setCategory(String category) {
		this.category = category;
    }

	public int getQuantity() {
				return quantity;
			}
   public void setQuantity(int quantity) {
	   this.quantity = quantity;
			}
   

}	
	
