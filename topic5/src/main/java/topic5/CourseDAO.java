package topic5;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;

  public class CourseDAO extends BasicDAO<Course,String>{

	  protected CourseDAO(MongoClient mongoClient, Morphia morphia, String dbName) {
		  super(mongoClient, morphia, dbName);
		
	}

}