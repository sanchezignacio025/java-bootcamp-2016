package org.ignacio.finalProject.presentation;

import java.sql.SQLException;
import java.util.ArrayList;

import org.ignacio.finalProject.model.Article;
import org.ignacio.finalProject.model.Bill;


public interface ShoppingCart {
	
	 public String login(String nickName, String password) throws SQLException;
	 public String logoff();
	 public String findByName(String name) throws SQLException;
	 public ArrayList<Article> findByCategory(String category) throws SQLException;
	 public String addArticleToCart(String name, int quantity) throws SQLException;
	 public Bill showList();
	 public String saveBill() throws SQLException;
	 public String buyBill() throws SQLException;
	

}
