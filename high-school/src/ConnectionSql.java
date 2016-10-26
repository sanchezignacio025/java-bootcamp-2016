import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectionSql {
  private Connection connect = null;
  private Statement statement = null;
  private ResultSet resultSet = null;
    
  public ConnectionSql() throws SQLException{
   try {
    Class.forName("com.mysql.jdbc.Driver");
    connect = DriverManager.getConnection("jdbc:mysql://localhost/highschool","root","Globant2016");
    statement = connect.createStatement();
    resultSet = statement.executeQuery("SELECT last_name, firts_name, schedule_time.day, start_time, finish_time, name"
                    	 +" FROM profesor  INNER JOIN course  on profesor.id_teacher=course.id_teacher"
                    	 +" INNER JOIN schedule_time  ON schedule_time.id_course=course.id_course"
                      +" ORDER BY schedule_time.day, course.name ");
      writeResultSet(resultSet);
   } 
   catch (ClassNotFoundException e) {
    e.printStackTrace();
   }   
}

  private void writeResultSet(ResultSet resultSet) throws SQLException {
	   	 resultSet.next();
	   	 String profesorLastName = resultSet.getString("profesor.last_name");
	     String profesorName = resultSet.getString("profesor.firts_name");
	     System.out.println("Profesor: " + profesorLastName + ", " + profesorName);
	     System.out.println("Schedule: ");
	       while (resultSet.next()) {           
	          int day = resultSet.getInt("day");
	          //Date day = resultSet.getDate("day");
	          //Time startTime = resultSet.getTime("start_time");
	          int startTime = resultSet.getInt("start_time");
	          //Time finishTime = resultSet.getTime("finish_time");
	          String courseName = resultSet.getString("name");
	          int finishTime = resultSet.getInt("finish_time");
	          System.out.println(day + " " + startTime + " " + finishTime +" " + courseName);
	       }
  }

  public void readDataBase() {
			
	}
} 