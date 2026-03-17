package com.google.lang.ex3;

import java.util.Scanner;

import com.google.lang.ex1.StirngEx1Main;

public class WrapperService {
	
	// 생년월일을 통해 나이를 계산하는 코드
	public void ageCount(Scanner sc) {
		System.out.println("생년월일을 입력 : xxxx-xx-xx");
		String data = sc.next(); // 생년월일을 문자열로 받는 이유? 양식이 -이기 때문에 계산되지 않도록 문자열로 받음
		
		int year = 2026;
		
		// subString 활용
		// 1. 생년월일에서 앞자리 4자리만 가져오기
		String yearPart = data.substring(0, 4);
		int birthYear = Integer.parseInt(yearPart);
						
		// 2. 분리한 숫자와 현재 년도와 차이를 구함
		int age = year - birthYear;
				
		// 3. 나이 출력
		System.out.println("현재나이는 : " + age + "입니다.");
		
		//------------------------------------
		// Split 활용
		String [] yearPart2  = data.split("-");
		int birthYear2 = Integer.parseInt(yearPart2[0]);
		
		int age2 = year - birthYear2;
		System.out.println("현재나이는 : " + age2 + "입니다.");
	}

	// 생년월일을 주민번호로 받을 경우 계산하는 코드 (본인 코드)
	public void ageCount2(Scanner sc) {

		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		
		int year = 2026;
		int age = 0;
		int birthYear = 0;
		// 뒷자리의 첫째자리가 1,2 이면 19xx 년도
		// 뒷자리의 첫째자리가 3,4 이면 20xx 년도
		
		String [] data1 =  data.split("-");

		
 		// 뒷자리 분류
		String genData = data1[1].substring(0,1); 
		int genPart = Integer.parseInt(genData);
 		
		if(genPart==1 || genPart==2) {
			String birthData = "19" + data1[0].substring(0, 2);
			birthYear = Integer.parseInt(birthData);
		}
		else if(genPart==3 || genPart==4){
			String birthData = "20" + data1[0].substring(0, 2);
			birthYear = Integer.parseInt(birthData);
		}
		age = year - birthYear;
		System.out.println("현재 나이는 : " + age + "입니다.");
	}
	
	// 생년월일을 주민번호로 받을 경우 계산하는 코드 (강사님 코드)
	public void ageCount3(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		
		String s = data.substring(0, 2);
		int n = Integer.parseInt(data.substring(0, 2));
		
		int year = 2026;
		int c = Integer.parseInt(data.substring(7, 8));
		
		if(c <3) {
			n = 1900 + n;
		}
		else {
			n = 2000 + n;
		}
		
		year = year - n;
		System.out.println(year);
	}
	
	// 올바른 주민등록번호인지 확인하는 방법 (본인 코드)
	public void juminCheck1(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		
		System.out.println(data.length());
		
		// boolean
		boolean isTrue = false;
		
		// 확인용 숫자
		int checkNum = Integer.parseInt(data.substring(13,14)); 
			
		// 주민번호 문자열을 - 부분만 제외하고 숫자의 배열로 바꾸는 과정
		
		String s = data.replace("-", "");
		String [] sAr = new String[s.length()];
		int [] regisNum = new int[s.length()];
		int [] multiNum = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 0};
		int checkRes = 0;
		
		for(int i = 0;i<s.length();i++) {
			sAr[i] = s.substring(i, i+1);
			regisNum[i] = Integer.parseInt(sAr[i]);
			checkRes = checkRes + regisNum[i] * multiNum[i];
		}
		
		checkRes = checkRes % 11;
		checkRes = 11 - checkRes;
		
		if(checkRes<10) {
			if(checkNum == checkRes) {
				isTrue = true;
			}
			else {
				isTrue = false;
			}	
		}
		else {
			checkRes = checkRes % 10;
			if(checkNum == checkRes) {
				isTrue = true;
			}
			else {
				isTrue = false;
			}	
		}
		
		System.out.println(isTrue ? "올바른 주민등록번호입니다." : "잘못된 주민등록번호입니다.");
	}
	
	// 올바른 주민등록번호인지 확인하는 방법 (강사님 코드)
	public void juminCheck2(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		int num = 2;
		int sum = 0;
		
		for(int i = 0;i<data.length()-1;i++) {
			
//			if(i == 6) {
//				continue;
//			}
			String s = data.substring(i, i+1);
			
			if(s.equals("-")) {
				continue;
			}
			
			int c = Integer.parseInt(s);
			sum = sum + c * num;
			num++;
			
			if(num == 10) {
				num = 2;
			}
		}
		
		System.out.println(sum);
		sum = sum %11;
		sum = 11 - sum;
		
		if(sum > 9) {
			sum = sum % 10;
		}
		
		int check = Integer.parseInt(data.substring(data.length()-1));
		
		if(sum == check) {
			System.out.println("올바른 번호다.");
		}
		else {
			System.out.println("틀린 번호다.");
		}
	}
	
	// 올바른 주민등록번호인지 확인하는 방법 (강사님 코드 2)
	public void juminCheck3(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-1234567");
		String data = sc.next();
		
		for(int i = 0; i<data.length()-1;i++) {
			char ch = data.charAt(i);
			
			Integer.parseInt(String.valueOf(ch)); // valueof를 사용하여 형변환
			Integer.parseInt(ch+""); // 의미없는 ""문자열을 더해 형변환
		}
	}
}
