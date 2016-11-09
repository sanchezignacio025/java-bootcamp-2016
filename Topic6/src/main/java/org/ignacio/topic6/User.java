package org.ignacio.topic6;

public class User {
	
	
			private String firstName;
			private String lastName;
			private String nickName;
			
			public User(){
			
			}
			
			public User(String nickName, String firstName, String lastName){
				this.setFirstName(firstName);
				this.setLastName(lastName);
				this.setNickName(nickName);
			}
			
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public String getNickName() {
				return nickName;
			}
			public void setNickName(String nickName) {
				this.nickName = nickName;
			}
			
			
			
		}


