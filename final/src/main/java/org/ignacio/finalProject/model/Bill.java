package org.ignacio.finalProject.model;




import java.sql.SQLException;
import java.util.ArrayList;





public class Bill {
	private int id_bill; 
	private int id_user;
	private String state;
	private ArrayList<Article> artList= new ArrayList<Article>();

	
	
	public Bill(){	
	}
		
	public int getId_bill() {
		return id_bill;
	}
	public void setId_bill(int id_bill) {
		this.id_bill = id_bill;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getTotal() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public ArrayList<Article> getArtList() {
		return artList;
	}

	public void setArtList(ArrayList<Article> artList) {
		this.artList = artList;
	}
	
	
	public void addArticle(Article art) throws SQLException{
						artList.add(art);
			}


	

	public void setProductList(ArrayList<Article> artList) {
		this.artList = artList;
	}	

	
		 
}