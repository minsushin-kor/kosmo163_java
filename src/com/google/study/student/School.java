package com.google.study.student;

public class School {
	public static void main(String[] args) {
//		TestJumsu tj = new TestJumsu(); // TestJumsu를 사용하기 위해 객체 생성
//		StudenView view = new StudenView(); // StudenView를 사용하기 위해 객체 생성
//		StudentInput si = new StudentInput();
//		Student st = new Student(); // 새로운 객체를 생성하는 방법
//		
//		st.name = "winter";
//		st.kor = 80;
//		st.eng = 90;
//		st.math = 80;
//		
//		si.input(st);
//		tj.t(st);
//		view.view(st);
		
		// StudentController start 메서드 호출
		
		StudentController sc = new StudentController();
		
		sc.start();
	}
}
