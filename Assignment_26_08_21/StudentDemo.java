package Assignment_26_08_21;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		List<StudentClass> students = new ArrayList<>();
		students.add(new StudentClass("Amit", 66));
		students.add(new StudentClass("Faizal", 65));
		students.add(new StudentClass("Bhavesh", 64));
		students.add(new StudentClass("Zayn", 63));
		students.add(new StudentClass("Jon", 62));
		students.add(new StudentClass("Doe", 61));
		students.add(new StudentClass("Obama", 60));
		students.add(new StudentClass("Amulya", 67));
		students.add(new StudentClass("Monica", 68));
		students.add(new StudentClass("Jordan", 69));
		
		StudentClass.displayStudents(students);
	}
}
