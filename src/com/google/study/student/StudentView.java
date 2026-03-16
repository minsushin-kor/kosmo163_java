package com.google.study.student;

public class StudentView {
	
	// view라는 메서드를 선언
	// view는 학생의 정보를 출력
	// 학생의 정보 : 이름, 국어, 영어, 수학, 총점, 평균
	
	public void view(Student st){
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균" + st.name);
		System.out.print(st.name+ "\t");
		System.out.print(st.kor+ "\t");
		System.out.print(st.eng+ "\t");
		System.out.print(st.math+ "\t");
		System.out.print(st.total+ "\t");
		System.out.println(st.avg);
	}
}

