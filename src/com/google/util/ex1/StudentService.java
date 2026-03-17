package com.google.util.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	
	private String data;
	
	public StudentService() {
		// 이름, 국어, 영어, 수학 
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
	}
	
	//학생 정보를 초기화 하는 메서드
	public studentDTO [] init() {
		// data에 있는 정보들을 파싱(parsing) 작업을 진행
		// 사람 간의 구별을 위해 "======================" 출력하기
		StringTokenizer st = new StringTokenizer(this.data, "-");

		// 아래 코드 중 setter를 통해 DTO에 저장한 정보는 지역 변수이기 때문에 학생 정보가 달라질 때 새로운 학생 정보로 바뀌게 된다.
		// 학생 정보들을 받을 수 있는 배열을 생성
		
		studentDTO [] ar = new studentDTO[3];
		int index = 0;
		
		while(st.hasMoreTokens()) {
			studentDTO dto = new studentDTO(); // 학생 수 만큼 studentDTO 객체 생성
			
			String s1 = st.nextToken();
			dto.setName(s1); // DTO 값에 학생 정보를 입력하기 위해 setter 함수를 사용
			
			String s2 = st.nextToken();
			dto.setKor(Integer.parseInt(s2));
			
			String s3 = st.nextToken();
			dto.setEng(Integer.parseInt(s3));
			
			String s4 = st.nextToken();
			dto.setMath(Integer.parseInt(s4));
			
			ar[index] = dto;
			index++;			
		}
		
		return ar;
	}
	
	//학생을 검색하는 메서드
	public void search() {
		studentDTO [] ar = new studentDTO[3];
		ar = this.init();
				
		StudentView sv = new StudentView();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생이름을 입력해 주세요.");
		
		String checkName = sc.next();
		
		// studentDTO에서 학생들의 정보를 받아오기
		for(int i = 0;i<ar.length;i++) {
			String studentName = ar[i].getName();
			
			if(checkName.equals(studentName))
			{
				sv.view(ar[i]);
				break;
			}
		}
	}
	
}
