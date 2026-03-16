package com.google.lang.ex1;

import java.util.Scanner;

public class StringEx2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요.");		
		String fileName = sc.next();
	
		// 파일명 -> 이름 + 확장자
		// 입력한 파일이 이미지 파일인지 체크하는 코드
		// .jpg, .png, .gif, .jpeg
		// abc,png, test.pdf, hello.PNG
		
		// 1. "." 의 인덱스 번호를 알아내기
		int find_index = fileName.indexOf(".");
		
		// 2. "." 이후의 문자열을 꺼내오기
		
		String isImage = fileName.substring(find_index+1);
		
		// 3. 이미지 파일인지 체크하기 
		
		if(isImage.equalsIgnoreCase("jpg")|| isImage.equalsIgnoreCase("png") || isImage.equalsIgnoreCase("gif") || isImage.equalsIgnoreCase("jpeg"))
		{
			System.out.println("이미지 파일입니다.");
		}
		
		else
		{
			System.out.println("이미지 파일이 아닙니다.");
		}
		
		//--------------------------------------------
		
		String [] files = {"jpg", "png", "gif", "jpeg"};
		
		String result = "이미지 파일이 아니다.";
		for(int i = 0;i<files.length;i++)
		{
			if(isImage.equalsIgnoreCase(files[i])) {
				result = "이미지 파일 입니다.";
				break;
			}
		}
		System.out.println(result);
		
	}

}
