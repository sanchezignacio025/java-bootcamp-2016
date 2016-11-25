package org.ignacio.finalProject.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {
	private static Connection connect = null;
	private static ConnectionBd connectionBd = null;

    
    private ConnectionBd() throws SQLException{ 
        try {
    		Class.forName("com.mysql.jdbc.Driver");
    	    connect = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart","root","Globant2016");	    	    
    	  } catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	  }   	
    }
    public static ConnectionBd getInstance() throws SQLException{
    	if (connectionBd == null){
    		connectionBd = new ConnectionBd();
    	}
    	return connectionBd;
    }
    
   
    public Connection getConnection() throws SQLException{
    	return connect;
    }
    
    public void CloseConnection(){
    	    	connect = null;
    	   	connectionBd=null;
    	   }
    	
}