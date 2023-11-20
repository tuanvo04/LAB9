package task1;

import java.util.List;

public class Course {
private String id;
private String title;
private String type;
private List<Student> students;
private String  lecture;

public Course(String id, String title, String type, List<Student> students, String lecture) {
	super();
	this.id = id;
	this.title = title;
	this.type = type;
	this.students = students;
	this.lecture = lecture;
}

public String getType() {
	return type;
	
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
@Override
	public String toString() {
		return " id: "+ id+ " title: "+ title+ " type: "+ type +   " student: "+ students+" lecture: "+ lecture; 
	}
}
