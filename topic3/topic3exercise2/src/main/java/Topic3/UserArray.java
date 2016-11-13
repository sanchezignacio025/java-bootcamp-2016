package Topic3;

import java.util.ArrayList;

public class UserArray {
	
	private static ArrayList<User> users = new ArrayList<User>();	
 	private static UserArray userArray = null;
 
 	private UserArray() {	
 	}
 	
 	public static UserArray getInstance() {
 		if (userArray == null) {
 			userArray = new UserArray();
 		}
 		return userArray;
 	}
 	
 	
 	public void addUser(User u){
 		users.add(u);
 	}
 	
 	public void deleteUser(int id){
 		for (User u: users){
 			if (u.getId()==id){
 				users.remove(u);
 				break;
 			}
 		}
 	}
 	
 	public User getUser(int id){
 		for (User u: users){
 			if (u.getId()==id){
 				return u;
 			}
 		}
 		return null;
 	}
 	
 	public void updateUser (User user){
 		for (User u: users){
 			if (user.getId()==u.getId()){
 				int position=users.indexOf(u);
 				users.remove(u);
 				users.add(position,user);
 			}
 		}
 	}
 	
 	public ArrayList<User> getUser(){
 		return users;
 	}
 	
 	public void finish(){
 		users = new ArrayList<User>();
 		userArray= null;
 	}
 
 }


