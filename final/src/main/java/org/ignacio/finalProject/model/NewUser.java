package org.ignacio.finalProject.model;


  public class NewUser {
    String nickName;
    String password;
    String first_name;
    String last_name;
    int idUser;
    
    public NewUser(int idUser, String nickName, String password, String first_name, String last_name) {
  	  this.nickName = nickName;
  	  this.password = password;
  	  this.first_name = first_name;
  	  this.last_name = last_name;
  	  this.idUser = idUser;
  	  
    }
    
    
  public NewUser(String nickName, String password, String first_name, String last_name) {
	  this.nickName = nickName;
	  this.password = password;
	  this.first_name = first_name;
	  this.last_name = last_name;
	  
  }

    public int getId() {
        
		return idUser;
    }

    public void setId(int idUser) {
        this.idUser = idUser;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }
    
    
}