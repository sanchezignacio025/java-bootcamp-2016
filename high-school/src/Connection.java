import java.sql.Statement;

public class Connection {

  public static void main(String[] args) throws Exception {
	 
	  ConnectionSql dao = new ConnectionSql();
      dao.readDataBase();
     
	 
   }

	public Statement createStatement() {
		return null;
	}
}
