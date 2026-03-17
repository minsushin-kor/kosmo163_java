package com.google.util.ex1;

public class StudentMain {

	public static void main(String[] args) {

//		StudentService stu = new StudentService();
//		StudentView sv = new StudentView();
//
//		studentDTO [] ar = stu.init();
//		sv.view(ar);
		
		StudentController sc = new StudentController();
		sc.start();
	}

}
