package studentdatabaseapp;

import studentdatabaseapp.Student;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.toString());
		
		Student stu2 = new Student();
		stu2.enroll();
		stu2.payTuition();
		System.out.println(stu2.toString());
		
		Student stu3 = new Student();
		stu3.enroll();
		stu3.payTuition();
		System.out.println(stu3.toString());
		
		Student stu4 = new Student();
		stu4.enroll();
		stu4.payTuition();
		System.out.println(stu4.toString());
	}
}