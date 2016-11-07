package topic5;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import com.mongodb.MongoClient;
import com.mongodb.connection.QueryResult;



   public class BaseMongo{
	   
    public static void main( String[] args )
      {
     String dbName = new String("highschool");
      MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
       Datastore datastore = morphia.createDatastore(mongo, dbName);     
      morphia.mapPackage("topic5");
               
       
       NoteDAO noteDAO = new NoteDAO(mongo, morphia, dbName);
       Query<Note> query = datastore.createQuery(Note.class);
	     query.or(       
	       query.criteria("final_note").greaterThan(4),     
	      query.criteria("id_course").equal(new ObjectId("5818897d50830f02e15817dd"))
    		);
	    
	     QueryResults<Note> retrievedNotes = noteDAO.find(query);
	     
        for (Note retrievedNote: retrievedNotes ) {
	    	Query<Student> student = datastore.createQuery(Student.class);
	    	student.filter("_id", retrievedNote.getStudent());
	    	Student gotStudent = student.get();
        	System.out.println("Student: "+ gotStudent.getFirst_name() + " "+ gotStudent.getLast_name() );
              System.out.println("Note: "+retrievedNote.getFinal_note() );      
	     }
	}

}
   