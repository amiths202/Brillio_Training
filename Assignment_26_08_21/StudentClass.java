package Assignment_26_08_21;

import java.util.Collections;
import java.util.List;

public class StudentClass implements Comparable<StudentClass>{
	
	String name;
	int usn;
	
	public StudentClass(String name, int usn) {
		this.name = name;
		this.usn = usn;
	}
	
	@Override
	public int compareTo(StudentClass o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return "\nName:" + name + "\nUSN:" + usn;
	}
	
	public static void displayStudents(List<StudentClass> students) {
		Collections.sort(students);
		System.out.println(students);
		
	}
	
	

}
