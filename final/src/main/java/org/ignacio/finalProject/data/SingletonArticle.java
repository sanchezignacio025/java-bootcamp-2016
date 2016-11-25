package org.ignacio.finalProject.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.ignacio.finalProject.model.Article;
import org.ignacio.finalProject.model.ArticleStock;


public class SingletonArticle {
	
	    private Statement statement;
		private ResultSet resultSet;	
		private static SingletonArticle singletonArticle = null;
		
		
		private SingletonArticle() {
		}
		
		public static SingletonArticle getInstance() {
			if (singletonArticle == null) {
				singletonArticle = new SingletonArticle();
			}
			return singletonArticle;
		}
		
		public Article findByName(String name) throws SQLException{
			Connection connect = (Connection) ConnectionBd.getInstance().getConnection();
			statement = connect.createStatement();
		    resultSet = statement.executeQuery("SELECT * FROM article "
		    		  
		    		+ " WHERE name='"+name+"'");
		    if(!resultSet.next()){
		    	return null;
		    	}
	
		    Article art = new Article(0,null,0,null);
			art.setArticleId(resultSet.getInt("article.idarticle"));
			art.setDescripcion(resultSet.getString("article.name"));
			art.setCategory(resultSet.getString("article.category"));
			art.setPrice(resultSet.getInt("article.price"));
			return art;
		}
		
		public ArrayList<Article> findByCategory(String category) throws SQLException{
			ArrayList<Article> articleList = new ArrayList<Article>();
			Connection connect = (Connection) ConnectionBd.getInstance().getConnection();
			statement = connect.createStatement();
		    resultSet = statement.executeQuery("SELECT * FROM article WHERE category ='"+ category+ "'");
		    if(resultSet.wasNull()){
		    	return null;
		    }
		    
		    while(resultSet.next()){	    	
				ArticleStock art = new ArticleStock(0,null,0,null,0);
				art.setArticleId(resultSet.getInt("article.idarticle"));
				art.setDescripcion(resultSet.getString("article.name"));
			    art.setCategory(resultSet.getString("article.category"));
				art.setStock(resultSet.getInt("article.stock"));
				art.setPrice(resultSet.getInt("article.price"));
				articleList.add(art);
		    }
			return articleList;
		}
		public boolean updateStock(int idarticle, int quantity)throws SQLException{
			
			Connection connect = ConnectionBd.getInstance().getConnection();
			statement = connect.createStatement();
		    resultSet = statement.executeQuery("SELECT stock FROM article WHERE idarticle="+idarticle);		
		    if(resultSet.next()){
		    	int stock = resultSet.getInt(1);
		    	stock = stock - quantity;
		    	String query = "UPDATE article SET stock=? WHERE idarticle=?";
			    PreparedStatement preparedStmt = connect.prepareStatement(query);
			    preparedStmt.setInt (1, stock);
			    preparedStmt.setInt (2, idarticle);
			    preparedStmt.execute();
		    	return true;
		    }
			return false;
		}
}
