package Topic3;

public class CrudService implements CrudUser {
	
public void newUser (User u){	
 		
 		UserArray.getInstance().addUser(u);
 	}
 
 	public void deleteUser(int id) {
 	
 		
 		UserArray.getInstance().deleteUser(id);
 	}
 
 	public User getUser(int id) {
 	
 		return UserArray.getInstance().getUser(id);
 	}
 
 	public void updateUser(User u) {
 	
 		
 		UserArray.getInstance().updateUser(u);
 	}
 
 	public void showUserList() {
 	
 		for(User u : UserArray.getInstance().getUser()){
 			System.out.println("ID: "+ u.getId() +" First name: " + u.getFirstName() + " Last name: " + u.getLastName() );
 		}
 	}
 	
 	
 
 }


