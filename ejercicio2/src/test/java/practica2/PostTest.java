package practica2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PostTest {
	static Post post[] = new Post[10];
	@Before
	public static void init() {
		post[0] = new Post("note 1");
		post[1] = new Post("note 2");
		post[2] = new Post("note 3");
		post[3] = new Post("note 4");
		post[4] = new Post("note 5");
		post[5] = new Post("note 6");
		post[6] = new Post("note 7");
		post[7] = new Post("note 8");
		post[8] = new Post("note 9");
		post[9] = new Post("note 10");
		for (int i = 0; i <= 9; i++){
			post[i] = new Post(null);
		}

	}
   
	
	@Test
    public void addNewPostTest(){
		
		AddPost addpost = new AddPost();
		addpost.addNewPost();
		
		     for (int i = 0; i <= 10; i++) {
		    	 System.out.println("the note is :" + post[i].note);
		}	
		
		
   @Test
	public void deleteAFile(){
		DeletedFile deletedFile = new DeletedFile(); 
		deletedFile.deletedFile();
	
			for (int i = 0; i <= 10; i++) {
				System.out.println("the note is :" + post[i].note);
						
			}
		}
	@Test
	public void ShowRecentEntries(){
			
			for (int i = 0; i <= 10; i++) {
				System.out.println("the note is :" + post[i].note);
						
			}
		}
			
	
	public static Post[] getPost() {
		return post;
	}
	public static void setPost(Post[] post) {
		PostTest.post = post;
	}
	}