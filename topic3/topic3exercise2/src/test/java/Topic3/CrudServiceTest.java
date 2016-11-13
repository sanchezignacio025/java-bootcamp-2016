package Topic3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CrudServiceTest {
	
	@BeforeClass
 	public static void setUpBeforeClass() throws Exception {
 	}
 
 	@Before
 	public void setUp() throws Exception {
 		UserArray.getInstance().addUser(new User(1, "Bruno", "Sanfilippo"));
 		UserArray.getInstance().addUser(new User(2, "Carlos", "Aused"));
 		UserArray.getInstance().addUser(new User(3, "Jose", "Felini"));
 	}
 		
 	@Test
 	public void newUser() {
 		System.out.println("");
 		System.out.println("new user");
 		CrudService userCrud = new CrudService();
 		userCrud.newUser(new User (7, "Ezequiel", "Fort"));
 		assertTrue(UserArray.getInstance().getUser().size()==4);
 		userCrud.showUserList();
 		UserArray.getInstance().finish();
 		
 	}
 
 	@Test
 	public void removeUser() {
 		System.out.println("");
 		System.out.println("delete user");
 		CrudService userCrud = new CrudService();
 		userCrud.deleteUser(2);
 		assertTrue(UserArray.getInstance().getUser().size()==2);
 		userCrud.showUserList();
 		UserArray.getInstance().finish();		
 	}
 	
 	@Test
 	public void getUser() {
 		System.out.println("");
 		System.out.println("user");
 		CrudService userCrud = new CrudService();
 		User u = userCrud.getUser(1);
 		assertTrue(u.getFirstName().equals("Bruno"));
 		System.out.println("Id: "+ u.getId() +" First Name: " + u.getFirstName() + " Lastname: " + u.getLastName());
 		UserArray.getInstance().finish();	
 	}
 	
 
 	@Test
 	public void getUserList() {
 		System.out.println("");
 		System.out.println("list");
 		CrudService userCrud = new CrudService();
 		assertTrue(UserArray.getInstance().getUser().size()==3);
 		userCrud.showUserList();
 		UserArray.getInstance().finish();	
 	}
 }


