package com.google.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean isExit = true;
		
		StudentService studentServ = new StudentService();
		StudentView studentView = new StudentView();
		//StudentDTO [] ar = null;
		ArrayList<StudentDTO> ar = null;
		
		System.out.println("1. 학생정보 초기화");
		System.out.println("2. 학생정보 출력");
		System.out.println("3. 학생정보 검색");
		System.out.println("4. 학생 정보를 추가");
		System.out.println("5. 프로그램 종료");
		
		while(isExit) {
			int startSc = sc.nextInt();

			if(startSc == 1) {
				ar = studentServ.init();
				
			}
			else if (startSc == 2) {
				studentView.view(ar);	// 여기부분 학습 필요(왜 ar만 적어도 결과가 출력되는지 모르겠음)
				
			}
			
			else if (startSc == 3) {
				StudentDTO studentDTO = studentServ.search(ar);
				if(studentDTO != null) {
					studentView.view(studentDTO);
				}
				else {
					System.out.println("찾는 정보가 없습니다.");
				}
				
			}
			
			else if (startSc == 4) {
				studentServ.add2(ar);
				
			}
			
			else {
				
				isExit = false;
			}
		}
		
	}
}
