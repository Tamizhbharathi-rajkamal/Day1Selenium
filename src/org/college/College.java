/*
QUESTION 8:
------------
     Project   :CollegeInformation
     Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Class     :Student
     Methods   :studentName(),studentDept(),studentId()

     Class     :Hostel
     Methods   :hostelName()

     Class     :Dept
     Methods   :deptName()

Description:
Create an object for all 4 classes  inside the College class and call all classes methods also follow the all coding standards.

*/
package org.college;

public class College {
	private void collegeName() {
		System.out.println("collegeName = Anna University");
	}
	private void collegeCode() {
		System.out.println("collegeCode = 121");
	}
	private void collegeRank() {
		System.out.println("collegeRank = 12");
	}
	
	public static void main(String[] args) {
		College coll = new College();
		coll.collegeName();
		coll.collegeCode();
		coll.collegeRank();
		
		Student stud = new Student();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
		
		Hostel hostel = new Hostel();
		hostel.hostelName();
		
		Dept dept = new Dept();
		dept.deptName();
	} 

}
