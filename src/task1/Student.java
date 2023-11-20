package task1;

import java.util.List;

public class Student {
private String id;
private String name;
private int year;
public Student(String id, String name, int year) {
	super();
	this.id = id;
	this.name = name;
	this.year = year;
}
public int getYear() {
	return year;
}
public boolean equals(Student student) {
		// TODO Auto-generated method stub
		return this.getYear()==student.getYear();
	}
@Override
	public String toString() {
		return " id: " + id+ " name: "+ name+ " year: "+ year+ "\n";
	}
}


