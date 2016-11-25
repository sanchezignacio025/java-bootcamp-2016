package org.ignacio.finalProject.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import org.ignacio.finalProject.data.SingletonArticle;
import org.ignacio.finalProject.data.SingletonBill;
import org.ignacio.finalProject.data.SingletonUser;
import org.ignacio.finalProject.model.Article;
import org.ignacio.finalProject.model.Bill;
import org.ignacio.finalProject.model.NewUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class ServiceCartImp implements ShoppingCart{

    NewUser userLoggedIn;
    Bill billB = new Bill();
    SingletonBill singleton;
    ArrayList<Article> articlesAdded = new ArrayList<Article>();
    NewUser u = new NewUser(null,null,null,null);
	
    
    
	@RequestMapping("/login")
		public String login(@RequestParam(value="nickName", defaultValue="")String nickName, @RequestParam(value="password", defaultValue="")String password) throws SQLException {
			u = SingletonUser.getInstance().getUser(nickName);
			if (u==null){
				return "User wrong";
			}
			if (u.getPassword().equals(password)){
				userLoggedIn = u;
			} else{
				return "Wrong password or user";
			}
			
				
			return "Hello "+ u.getFirstName() +" "+ u.getLastName() ;
		}	
	
	
	
	@RequestMapping("/logoff")
		public String logoff(){
			if (userLoggedIn==null){
				return "You dont logged in";
			}
			userLoggedIn = null;
			billB = null;
			return "GoodBye";
		}
	
     @RequestMapping("/register")
	     public String register(@RequestParam(value="nickName", defaultValue="")String nickName, 
						   @RequestParam(value="password", defaultValue="")String password, 
						   @RequestParam(value="first_name", defaultValue="")String first_name, 
						   @RequestParam(value="last_name", defaultValue="")String last_name) throws SQLException {
		  
		     return SingletonUser.getInstance().newUser(nickName, password, first_name, last_name);
		     
	}
    
 
     @RequestMapping("/findByCategory")
     	public ArrayList<Article> findByCategory(@RequestParam(value="category", defaultValue="")String category) throws SQLException {		
     		ArrayList<Article> articleList = SingletonArticle.getInstance().findByCategory(category);
     		return articleList;
     	}

	  @RequestMapping("/findByName")
	  	public String findByName(@RequestParam(value="name", defaultValue="")String name) throws SQLException {
	  		Article art = SingletonArticle.getInstance().findByName(name);
	  		return "Description: "+art.getDescripcion() +" " +"Price: "+ art.getPrice()+" "+"iD Article: " +art.getArticleId();
	  }
	  




    
	 @RequestMapping("/addArticleToCart")
		public String addArticleToCart(@RequestParam(value="name", defaultValue="") String name, 
								@RequestParam(value="quantity", defaultValue="1")int quantity) throws SQLException {
		
		 	String result = verifyUser(userLoggedIn);
			if (result.equals("Ok")) { 
		     
				if (SingletonArticle.getInstance().findByName(name)==null){
								return "Sorry but the article dont exist";
				}		
				Article art = SingletonArticle.getInstance().findByName(name);
				art.setQuantity(quantity);
				
				billB.addArticle(art);
				if (billB.getId_bill()!=0){
					articlesAdded.add(art);
				}
				billB.setState("Not saved");
				billB.setId_user(userLoggedIn.getId());
				return "New article add";
	 		}

			return result;
		}

		@RequestMapping("/showList")
			public Bill showList(){
				return billB;		
			}
		
		
	    @RequestMapping("/saveBill")
		public String saveBill() throws SQLException {
	    	
	    	
			
			if (billB.getId_bill()!=0){
				SingletonBill.getInstance(). setUpArticle(billB, articlesAdded);
				articlesAdded = new ArrayList<Article>();
				;
			} else {
				billB.setState("Saved");
				SingletonBill.getInstance().saveBill(billB);
			}	

			return "Your cart has been saved";
		}
	    		
		
		@RequestMapping("/buyBill")
		public String buyBill() throws SQLException {
		
			
			if (billB.getId_bill()!=0){
			SingletonBill.getInstance().renoveBill(billB);
			}
			
			billB = new Bill();
		    billB.setId_user(userLoggedIn.getId());
			billB.setState("Bought made"); 
			
			ArrayList<Article> productListToUpdate = billB.getArtList();
			for(Article art : productListToUpdate){
				SingletonArticle.getInstance().updateStock(art.getArticleId(), art.getQuantity());
			}
			return "Succefull Purchase";
			
			
		}
          
		

		private String verifyUser(NewUser u) {
			if (userLoggedIn == null){
				return "You dont logged in";
			} else {
				return "Ok";
			}
		}
	

	}


	

	



	

