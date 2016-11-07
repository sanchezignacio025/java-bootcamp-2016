package topic5;

import org.mongodb.morphia.annotations.Embedded;

public class Course extends BaseEntity {
	
	private String name;
 	
	@Embedded
 	
	private Profesor id_;
 	private Integer hours;
 

 	public String getCourse_Name() {
 		return name;
 	}
 	public void setCourse_Name(String name) {
		this.name = name;
 	}
 	public Profesor getId_Profesor() {
 		return id_;
 	}
 	public void setId_profesor(Profesor id_) {
 		this.id_= id_;
 	}
 	public String getCourse_name() {
 		return name;
 	}
 	public void setCourse_name(String name) {
 		this.name = name;
 	}
 	public Integer getHours() {
 		return hours;
 	}
 	public void setHours_by_week(Integer hours) {
 		this.hours = hours;
 	}
 	
 	
 }


