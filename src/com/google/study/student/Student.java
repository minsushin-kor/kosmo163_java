package com.google.study.student;

public class Student {
	
	// 변수 - 클래스안에서 선언되는 변수를 instance 변수 혹은 멤버 변수, field 라고 부른다.
	// ex) 국어, 영어, 수학 점수를 보유하고 있는 사람을 학생이라고 하자.
	
	// 문법 : 접근지정자 [그외지정자] 데이터타입 변수명 < []는 배열이 아님, 다음에 배울 수 있음 
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	// 메서드 - 클래스안에서 선언되는 메서드를 instance method 혹은 멤버 메서드 라고 부른다.
	// public static void main(String [] args){}
	// 문법 : 접근지정자 [그외지정자] 리턴타입 메서드명(매개변수들 선언){}

	public void info() {
		System.out.println("info");
	}
	
	public void print() {
		System.out.println("print");		
	}
	
}
