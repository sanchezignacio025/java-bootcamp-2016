package org.ignacio.finalProject.data;


import java.sql.Statement;
import org.ignacio.finalProject.model.NewUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class User {
	private Statement statement;
	private ResultSet resultSet;
	private static User dataUser = null;
		
		
		private User() {
		}
		
		public static User getInstance() {
			if (dataUser== null) {
				dataUser = new User();
			}
			return dataUser;
		}
		
		
		public String newUser(String nickName, String password, String first_name, String last_name) throws SQLException{
			Connection connect = ConnectionBd.getInstance().getConnection();
			NewUser u = getId(nickName);
			  if(u==null){			
				  String query = " INSERT INTO user (nickName, password, first_name, last_name)"
				        + " VALUES (?, ?, ?, ?)";
			      PreparedStatement preparedStmt = connect.prepareStatement(query);
			      preparedStmt.setString (1, nickName);
			      preparedStmt.setString (2, password);
			      preparedStmt.setString (3, first_name);
			      preparedStmt.setString (4, last_name);	
			      preparedStmt.execute();
			      
			}
				return "welcome new user";

		}
			
			public NewUser getId(String nickName) throws SQLException{
						Connection connect = ConnectionBd.getInstance().getConnection();
						statement = connect.createStatement();
					    resultSet = statement.executeQuery("SELECT * FROM user WHERE nickName='"+nickName+"'");
				    if(!resultSet.next()){
					    	return null;
					    	}
						 NewUser u = new NewUser(
									  resultSet.getString("user.nickName"),
									  resultSet.getString("user.password"),
									  resultSet.getString("user.first_name"),
									  resultSet.getString("user.last_name"));
						return u;
						
					}	

}
