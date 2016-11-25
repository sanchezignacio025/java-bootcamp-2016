package org.ignacio.topic62;

   import org.ignacio.topic6.User;
   import java.util.ArrayList;
   import org.ignacio.topic6.UserInterface;
   import org.springframework.web.bind.annotation.RequestMapping;
   import org.springframework.web.bind.annotation.RequestParam;
   import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	public class UserInterfaceImplem implements UserInterface {
	
		ArrayList<User> userList = new ArrayList<User>();
		
    @RequestMapping("/showUsers")
		public ArrayList<User> showUsers(){
			return userList;
		}
	
    @RequestMapping("/addUser")
		public String addUser(  @RequestParam(value="nickname", defaultValue="")  String nickName,
								@RequestParam(value="first name", defaultValue="")String firstName, 
								@RequestParam(value="last name", defaultValue="") String lastName) {
			for (User u : userList){
				if (u.getNickName().equals(nickName)){
					return "Nickname is fine";
				}
			}
			userList.add(new User(nickName, firstName, lastName));
			return "User " + nickName + " welcome";
		}
	
    @RequestMapping("/deleteUser")
		public String deleteUser(@RequestParam(value="nickname", defaultValue="")   String nickName) {
			for(User u: userList){
				if(u.getNickName().equals(nickName)){
					userList.remove(u);
					return "User " + nickName + " goodbye";
				}
			}
			return nickName + " unknown";
			
			
		}
	
   @RequestMapping("/findByName")
		public User findByName(@RequestParam(value="name",       defaultValue="")    String firstName) {	
			for (User u: userList){
				if (u.getFirstName().equals(firstName)){
					return u;
				}
			}
			return null;
		}
	
   @RequestMapping("/updateUser")
		public String updateUser(@RequestParam(value="nickname",   defaultValue="")  String nickname,
								 @RequestParam(value="first name", defaultValue="")  String firstName, 
								 @RequestParam(value="last name",  defaultValue="")  String lastName) {
			for (User u: userList){
				if (u.getNickName().equals(u.getNickName())){
					u.setFirstName(firstName);
					u.setLastName(lastName);
					break;
				}
			}
			return "User updated";
		}
	
	@RequestMapping("/findByNickName")
		public User findByNickName(@RequestParam(value="nickname", defaultValue="") String nickName) {
			for (User u: userList){
				if (u.getNickName().equals(nickName)){
					return u;
				}
			}
			return null;
		}
		
		
	
	}

