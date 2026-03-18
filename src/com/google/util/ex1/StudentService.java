package com.google.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	
	private String data;
	private Scanner sc;
	
	public StudentService() {
		// 이름, 국어, 영어, 수학 
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
		this.sc = new Scanner(System.in);
	}
	
	//학생 정보를 초기화 하는 메서드
//	public StudentDTO [] init() {
//		// data에 있는 정보들을 파싱(parsing) 작업을 진행
//		// 사람 간의 구별을 위해 "======================" 출력하기
//		StringTokenizer st = new StringTokenizer(this.data, "-");
//
//		// 아래 코드 중 setter를 통해 DTO에 저장한 정보는 지역 변수이기 때문에 학생 정보가 달라질 때 새로운 학생 정보로 바뀌게 된다.
//		// 학생 정보들을 받을 수 있는 배열을 생성
//		
//		StudentDTO [] ar = new StudentDTO[3];
//		int index = 0;
//		
//		while(st.hasMoreTokens()) {
//			StudentDTO dto = new StudentDTO(); // 학생 수 만큼 studentDTO 객체 생성
//			
//			String s1 = st.nextToken();
//			dto.setName(s1); // DTO 값에 학생 정보를 입력하기 위해 setter 함수를 사용
//			
//			String s2 = st.nextToken();
//			dto.setKor(Integer.parseInt(s2));
//			
//			String s3 = st.nextToken();
//			dto.setEng(Integer.parseInt(s3));
//			
//			String s4 = st.nextToken();
//			dto.setMath(Integer.parseInt(s4));
//			
//			ar[index] = dto;
//			index++;			
//		}
//		
//		return ar;
//	}
	
	//학생 정보를 초기화 하는 메서드를 ArrayList로 바꿔보기
	public ArrayList<StudentDTO> init() {
		StringTokenizer st = new StringTokenizer(this.data, "-");
		
		ArrayList<StudentDTO> studentList = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			StudentDTO dto = new StudentDTO(); // 학생 수 만큼 studentDTO 객체 생성
			
			String s1 = st.nextToken();
			dto.setName(s1); // DTO 값에 학생 정보를 입력하기 위해 setter 함수를 사용
			
			String s2 = st.nextToken();
			dto.setKor(Integer.parseInt(s2));
			
			String s3 = st.nextToken();
			dto.setEng(Integer.parseInt(s3));
			
			String s4 = st.nextToken();
			dto.setMath(Integer.parseInt(s4));
			
			studentList.add(dto);	
		}
		
		return studentList;
	}
	
	//학생을 검색하는 메서드(내가 한것)
	public void search2() {
		//StudentDTO [] ar = new StudentDTO[3];
		ArrayList<StudentDTO> ar = new ArrayList<StudentDTO>();
		ar = this.init();
				
		StudentView sv = new StudentView();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생이름을 입력해 주세요.");
		
		String checkName = sc.next();
		
		// studentDTO에서 학생들의 정보를 받아오기
		for(int i = 0;i<ar.size();i++) {
			String studentName = ar.get(i).getName();
			
			if(checkName.equals(studentName))
			{
				sv.view(ar.get(i));
				break;
			}
		}
	}
	
	// 학생 검색 메서드(강사님 코드)
	public StudentDTO search(ArrayList<StudentDTO> ar) {
		System.out.println("학생 이름을 입력");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		for(int i = 0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				return ar.get(i);
			}
		}
		return null;	// 왜 return null?인지
	}
	
	// 학생을 추가하는 메서드(내가 한것)
	public ArrayList<StudentDTO> add(ArrayList<StudentDTO> studentList) {
		Scanner sc = new Scanner(System.in);
		StudentDTO dto = new StudentDTO();
				
		System.out.println("학생 이름은?");
		dto.setName(sc.next());

		System.out.println("국어점수는?");
		dto.setKor(sc.nextInt());
		
		System.out.println("영어점수는?");
		dto.setEng(sc.nextInt());
		
		System.out.println("수학 점수는?");
		dto.setMath(sc.nextInt());
		
		studentList.add(dto);
		
		return studentList;
	}
	
	// 학생을 추가하는 메서드(강사님이 한것)
	public void add2(ArrayList<StudentDTO> ar) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력");
		String name = sc.next();

		System.out.println("국어 입력");
		int kor = sc.nextInt();
		
		System.out.println("영어 입력");
		int eng = sc.nextInt();
		
		System.out.println("수학 입력?");
		int math = sc.nextInt();
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(name);
		studentDTO.setKor(kor);
		studentDTO.setEng(eng);
		studentDTO.setMath(math);
		ar.add(studentDTO);
	}
	
	
}
