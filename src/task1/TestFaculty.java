package task1;

import java.util.ArrayList;
import java.util.List;

public class TestFaculty {
	public static void main(String[] args) {

		// Tạo danh sách các sinh viên và khóa học để kiểm thử
		List<Student> students = new ArrayList<>();
		students.add(new Student("1", "Student 1", 2022));
		students.add(new Student("2", "Student 2", 2022));
		students.add(new Student("3", "Student 3", 2022));
		students.add(new Student("4", "Student 4", 2022));
		students.add(new Student("5", "Student 5", 2022));
		List<Student> studentsAdd = new ArrayList<>(students);
		studentsAdd.add(new Student("6", "student6", 2022));

		List<Course> courses = new ArrayList<>();
		courses.add(new Course("C1", "Course 1", "Thuc hanh", students, "Nguyen Van A"));
		courses.add(new Course("C2", "Course 2", "Thuc hanh", studentsAdd, "Nguyen Van A"));
		courses.add(new Course("C3", "Course 3", "Ly thuyet", students, "Nguyen Van B"));

		// Tạo đối tượng faculty cho kiểm thử
		Faculty f1 = new Faculty("CNTT", "IT", courses);
		System.out.println("Cousre thực hành có nhiều sinh viên đăng kí nhất: "+"\n" + f1.getMaxPracticalCourse());
		System.out.println();
		
		
		System.out.println("Danh sách sinh viên theo năm 2022: "+ f1.groupStudentsByYear());
		
		
		System.out.println(f1.filterCourses("Thuc hanh"));
		
		
	}
}