package practica2;

import java.util.Scanner;

public class DeletedFile {
	public Post[] deletedFile(){
		
		Post[] post = PostTest.getPost();
		int deletedFileNumber=-1;
		System.out.println("delete note: ");
		Scanner scan = new Scanner(System.in);
		deletedFileNumber =scan.nextInt();
		
		return post;
		
	}

}
