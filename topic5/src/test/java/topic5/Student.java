package topic5;

import java.sql.Date;

public class Student extends BaseEntity{
		private String first_name, last_name;
	 	private Date birth;
	 	private int registration_number;
	
		
	 	public String getFirst_name() {
	 		return first_name;
		}
	 	public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
	 	public String getLast_name() {
			return last_name;
	 	}
	 	public void setLast_name(String last_name) {
	 		this.last_name = last_name;
	 	}
	 	public Date getBirthDate() {
	 		return birth;
		}
	 	public void setBirthDate(Date birth) {
	 		this.birth = birth;
	 	}
	 	
	 	public int getRegistrationNumber() {
	 		return registration_number;
	 	}	
	 	
	 	public void setRegistrationNumber(int registration_number) {
	 		this.registration_number = registration_number;
	 	}
	 }