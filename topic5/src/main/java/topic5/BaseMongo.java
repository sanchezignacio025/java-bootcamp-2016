package topic5;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import com.mongodb.MongoClient;



   public class BaseMongo{
	   
    public static void main( String[] args )
      {
        String dbName = new String("highschoolmongodb");
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        Datastore datastore = morphia.createDatastore(mongo, dbName);     
        morphia.mapPackage("topic5");
               
       
        NoteDAO noteDAO = new NoteDAO(mongo, morphia, dbName);
    	Query<Note> query = datastore.createQuery(Note.class);
        query.and(
        		query.criteria("final_note").greaterThan(4),
        		query.criteria("id_course").equal(new ObjectId("5818897d50830f02e15817dd"))
        		);
        
        QueryResults<Note> noteGreaterThanFour =  noteDAO.find(query); 
       
        StudentDAO studentDAO = new StudentDAO(mongo,morphia,dbName);
            
       
            for (Note notes : noteGreaterThanFour) {
       	
        	  Query<Student> query2 = datastore.createQuery(Student.class);
        	  query2.and(query2.criteria("_id").equal(notes.getStudent()));    
              QueryResults<Student> student = studentDAO.find(query2); 
              System.out.println("First name: " + student.get().getFirst_name() + " Last name: " + student.get().getLast_name() + " Final note: " + notes.getFinal_note());
        } 
    }
}