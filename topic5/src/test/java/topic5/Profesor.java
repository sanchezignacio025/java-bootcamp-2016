package topic5;

import java.util.Date;
import org.mongodb.morphia.annotations.Entity;

 @Entity
  public class Profesor extends BaseEntity{
	

	private String last_name;
	private String first_name;
	private Date birth;
	

	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	

}