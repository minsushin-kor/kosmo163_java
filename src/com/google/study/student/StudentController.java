package com.google.study.student;

import java.util.Scanner;

public class StudentController {
	
	// start
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		boolean is_check = false;
		
		Student s1 = new Student();
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		StudentJumsu sj = new StudentJumsu();
		
		
		while(!is_check)
		{
			System.out.println("번호를 입력하세요.");
			int input = sc.nextInt();
			
			//1. 학생 정보 입력
			if(input==1)
			{
				System.out.println("1번");
				si.input(s1);
				sj.t(s1);
			}
			
			//2. 학생 정보 출력
			else if(input==2)
			{
				System.out.println("2번");
				sv.view(s1);
			}
			
			//3. 프로그램 종료
			else if(input==3)
			{
				System.out.println("프로그램을 종료합니다.");
				is_check = true;
			}
			else
			{
				System.out.println("잘못된 값을 입력했습니다. 다시 입력해 주세요.");
			}
		}			
	}
	
}
