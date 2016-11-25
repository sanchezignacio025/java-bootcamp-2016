package org.ignacio.finalProject.model;

public class ArticleStock extends Article {

	int stock;
	
	public ArticleStock(){
		super();
	}
	
	public ArticleStock(int idarticle,String descripcion, int price,String category, int stock){
		this.idarticle=idarticle;
		this.descripcion=descripcion;
		this.price=price;
		this.category=category;
		this.stock=stock;
	}
	
	public ArticleStock(int stock){
		this.stock=stock;
		
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	
  }
	

	

}	
	
