package Topic3;

public interface CrudUser {
	
	public void newUser(User u);
 	public void deleteUser(int id);
 	public User getUser(int id);
 	public void updateUser(User u);
 	public void showUserList();

}
