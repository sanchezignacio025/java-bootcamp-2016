package org.ignacio.topic6;

import java.util.ArrayList;

public interface UserInterface {
	
	public ArrayList<User> showUsers();
		public String addUser(String nickname, String firstName, String lastName);
		public String deleteUser(String nickName);
		public User findByName(String firstName);
		public String updateUser(String nickName, String firstName, String lastName);
		public User findByNickName(String nickName);


}
