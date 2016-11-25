package org.ignacio.finalProject.data;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.ignacio.finalProject.model.NewUser;

public class SingletonUser {
	
	private Statement statement;
	private ResultSet resultSet;
    private static SingletonUser singletonUser = null;
	
	public static SingletonUser getInstance() {
				if (singletonUser == null) {
				  singletonUser = new SingletonUser();
				}
				return singletonUser;
			}
			
			
			public String newUser(String nickName, String password, String first_name, String last_name) throws SQLException{
				Connection connect = ConnectionBd.getInstance().getConnection();
				
			
				statement = connect.createStatement();
			    resultSet = statement.executeQuery("SELECT * FROM user WHERE nickName='"+nickName+"'");	
			    if(resultSet.next()){
			    	return "user already exist";
			    }else{
					  String query = " INSERT INTO user (nickName, password, first_name, last_name)"
					        + " VALUES (?, ?, ?, ?)";
				      PreparedStatement preparedStmt = connect.prepareStatement(query);
				      preparedStmt.setString (1, nickName);
				      preparedStmt.setString (2, password);
				      preparedStmt.setString (3, first_name);
				      preparedStmt.setString (4, last_name);	
				      preparedStmt.execute();	
				return "Welcome : "+ first_name +" "+last_name;
			    }
			
				
			}
			
			public NewUser getUser(String nickName) throws SQLException{
				Connection connect = ConnectionBd.getInstance().getConnection();
				statement = connect.createStatement();
			    resultSet = statement.executeQuery("SELECT * FROM user WHERE nickName='"+nickName+"'");
			    

			    NewUser u = null;
			    if(resultSet.next()){
			    	u = new NewUser(
			    		resultSet.getInt("user.id_user"),
						resultSet.getString("user.nickName"),
						resultSet.getString("user.password"),
						resultSet.getString("user.first_name"),
						resultSet.getString("user.last_name"));
		    	}
				return u;
				
			}
	}


