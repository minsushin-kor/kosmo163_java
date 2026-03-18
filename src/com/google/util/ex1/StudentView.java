package com.google.util.ex1;

import java.util.ArrayList;

public class StudentView {

	public void view(ArrayList<StudentDTO> students) {
		for (int i = 0; i < students.size(); i++) {
			this.view(students.get(i));
		}
	}

	// 학생이 정보를 출력하는 역할
	public void view(StudentDTO studentDTO) {

		System.out.println("이름 : " + studentDTO.getName());
		System.out.println("국어 : " + studentDTO.getKor());
		System.out.println("영어 : " + studentDTO.getEng());
		System.out.println("수학 : " + studentDTO.getMath());
		System.out.println("======================");
	}

}
