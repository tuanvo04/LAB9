package task1;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.management.ValueExp;

public class Faculty {
	private String name;
	private String address;
	private List<Course> course;

	public Faculty(String name, String address, List<Course> course) {
		super();
		this.name = name;
		this.address = address;
		this.course = course;
	}

	public Course getMaxPracticalCourse() {
		Course maxStudent = null;
		int max = -1;
		for (Course c : course) {
			if (c.getType().equals("Thuc hanh")) {
				int number = c.getStudents().size();
				if (number > max) {
					max = number;
					maxStudent = c;

				}
			}
		}
		return maxStudent;
	}

	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> map = new HashMap<>();

		for (Course c : course) {
			for (Student st : c.getStudents()) {
				int year = st.getYear();
				List<Student> value = new ArrayList<>();
				if (!map.containsKey(year)) {
					value.add(st);
					map.put(year, value);

				} else {
					value = map.get(year);
					if (!value.contains(st)) {
						value.add(st);
						map.put(year, value);
					}
				}

			}
		}
		return map;

	}
	public Set<Course> filterCourses(String type){
		 // Tạo một danh sách tạm thời để lưu trữ các khoá học theo loại
        List<Course> filteredList = new ArrayList<>();

        // Lọc các khoá học theo loại
        for (Course c : course) {
            if (c.getType().equals(type)) {
                filteredList.add(c);
            }
        }

        // Sắp xếp danh sách giảm dần theo số lượng sinh viên
        Collections.sort(filteredList, new Comparator<Course>() {
            @Override
            public int compare(Course course1, Course course2) {
                int studentCount1 = course1.getStudents().size();
                int studentCount2 = course2.getStudents().size();

                // Sắp xếp giảm dần theo số lượng sinh viên
                return Integer.compare(studentCount2, studentCount1);
            }
        });

        // Chuyển đổi danh sách đã sắp xếp thành một Set và trả về
        return new HashSet<>(filteredList);
    }

	@Override
	public String toString() {
		return "name: " + name + " address: " + address + " course: " + course +"\n";
	}
}
