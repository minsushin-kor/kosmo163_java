package com.google.util.ex1;

import java.util.Scanner;

public class StudentController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean isExit = true;
		
		StudentService studentServ = new StudentService();
		StudentView studentView = new StudentView();
		studentDTO [] ar = null;
		
		System.out.println("1. 학생정보 초기화, 2. 학생정보 출력, 3. 학생정보 검색, 4. 프로그램 종료");
		
		while(isExit) {
			int startSc = sc.nextInt();

			if(startSc == 1) {
				ar = studentServ.init();
				
			}
			else if (startSc == 2) {
				studentView.view(ar);	// 여기부분 학습 필요(왜 ar만 적어도 결과가 출력되는지 모르겠음)
				
			}
			
			else if (startSc == 3) {
				studentServ.search();
				
			}
			
			else {
				
				isExit = false;
			}
		}
		
	}
}
