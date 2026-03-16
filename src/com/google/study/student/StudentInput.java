package com.google.study.student;

import java.util.Scanner;

public class StudentInput {
	public void input(Student st)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		st.name = sc.next();
		
		System.out.println("국어점수를 입력하세요.");
		st.kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요.");
		st.eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요.");
		st.math = sc.nextInt();		
	}
}
