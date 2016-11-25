package org.ignacio.finalProject.data;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.ignacio.finalProject.model.Article;
import org.ignacio.finalProject.model.ArticleStock;
import org.ignacio.finalProject.model.Bill;

public class SingletonBill {
	
   private Statement statement;
   private ResultSet resultSet;	
   private static SingletonBill singletonBill = null;
	
	int id_bill=0;
	private SingletonBill() {
	}
	
	public static SingletonBill getInstance() {
		if (singletonBill == null) {
			singletonBill = new SingletonBill();
		}
		return singletonBill;
	}
	
	public boolean saveBill(Bill bill) throws SQLException{
		
		Connection connect = ConnectionBd.getInstance().getConnection();
		statement = (Statement) connect.createStatement();
	
		
		int id_user=bill.getId_user();
		
		String query = " INSERT INTO bill (id_user, state)"
				+ " VALUES (?,?)";
		
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setInt(1, id_user);
		preparedStmt.setString(2, "Saved");		
		preparedStmt.execute();
		
   		
		ArrayList<Article> artList = bill.getArtList();
		for(Article a : artList){
		  String query2 = " INSERT INTO billarticle (idarticle, quantity)"
			        + " VALUES (?, ?)";
		      PreparedStatement preparedStmt2 = connect.prepareStatement(query2);
		      preparedStmt2.setInt (1, a.idarticle);
		      preparedStmt2.setInt (2, a.getQuantity());
		      preparedStmt2.execute();
		}
		return true;
	}

	public boolean renoveBill (Bill bill) throws SQLException{
		Connection connect = ConnectionBd.getInstance().getConnection();
		int id_user = bill.getId_user();
		statement = connect.createStatement();
		resultSet = statement.executeQuery("SELECT id_bill FROM bill WHERE id_user="+id_user);
	    resultSet.next();
	    int id_bill=resultSet.getInt(1);
	    String query = "DELETE FROM billArticle WHERE id_bill=?";
	    PreparedStatement preparedStmt = connect.prepareStatement(query);
	    preparedStmt.setInt (1, id_bill);
	    preparedStmt.execute();
	    
	    query = "DELETE FROM bill WHERE id_bill=?";
	    preparedStmt = connect.prepareStatement(query);
	    preparedStmt.setInt (1, id_bill);
	    preparedStmt.execute();
    
		return true;
	}
	
	public Bill getInformationBill(int id_user) throws SQLException{
		Bill bill = new Bill();
		bill.setId_user(id_user);
		Connection connect = ConnectionBd.getInstance().getConnection();
		statement = connect.createStatement();
		resultSet = statement.executeQuery("SELECT id_bill, total FROM bill WHERE id_user="+id_user);
		if(!resultSet.next()){
				    	return null;
		}
	    	
	    int id_bill = resultSet.getInt(1);
	    bill.setId_bill(id_bill);
	    bill.setState(resultSet.getString(2));
	    ArrayList<Article> articleList = new ArrayList<Article>();
	    
	    resultSet = statement.executeQuery("SELECT billarticle.idarticle, billarticle.quantity, article.name, article.category, article.price, article.stock"
	    		+ " FROM billarticle INNER JOIN article ON billarticle.idarticle=article.idarticle "
	    	        + " WHERE billArticle.id_bill="+id_bill);
	    while(resultSet.next()){
	    	ArticleStock art = new ArticleStock(0,null,0,null,0);	    	
	    	art.setArticleId(resultSet.getInt(1));
	    	art.setQuantity(resultSet.getInt(2));
	    	art.setDescripcion(resultSet.getString(3));
	    	art.setCategory(resultSet.getString(4));
	    	art.setPrice(resultSet.getInt(5));	
	    	art.setStock(resultSet.getInt(6));
	    	articleList.add(art);
	    }
	    bill.setArtList(articleList);    
		return bill;
	    }
	
	
	public boolean setUpArticle(Bill bill, ArrayList<Article> articlesAdded) throws SQLException{
		Connection connect = ConnectionBd.getInstance().getConnection();
		int id_bill = bill.getId_bill();
		
		for(Article art: articlesAdded){
			String query = " INSERT INTO billarticle (id_bill, idarticle, quantity) VALUES (?, ?, ?)";
		    PreparedStatement preparedStmt = connect.prepareStatement(query);
		    preparedStmt.setInt (1, id_bill);
		    preparedStmt.setInt (2, art.getArticleId());
		    preparedStmt.setInt (3, art.getQuantity());
		    preparedStmt.execute();
		}
		
		return false;
	}
		
}






















