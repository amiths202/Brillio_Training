package Assignment_24_08_21;
/*
w.program for school admission ( menu driven 1 enroll 2 print 3 exit
           id fname, dob,
           create a user defined exception for dob validation 
           // child age > 5 years should be allowed to enroll.
           finally print all the students who have enrolled
           
 */

import java.util.Date;

public class studentClass {
	
	int id;
	String fname;
	Date dob;
	
	public studentClass(int id, String fname, Date dob) {
		this.id = id;
		this.fname = fname;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "ID=" + id + ", Name=" + fname + ", DOB=" + dob + "\n";
	}
	

}
