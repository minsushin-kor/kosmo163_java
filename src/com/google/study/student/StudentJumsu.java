package com.google.study.student;

public class StudentJumsu {
	
	//학생의 점수를 전달받아서 총점과 평균을 계산하는 메서드
	
	public void t(Student st) {
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total / 3.0;
	}
	
	public void t2(Student st) {
		st = new Student();
		st.total = 90;
		st.avg=30.0;
	}
}
