package com.google.study;

public class Salary {
	public void test1(int s) {
		s = 0;
	}
	
	public void test2(int [] nums) {
		nums = new int[2];
		nums[0] = 9;
	}
	
	
	
	// 급여계산을 하려한다.
	// 급여계산 방법 :
	// 정규직 - 의료: 0.03, 고용: 0.02, 국민: 0.01, 산재: 0.01
	// 프리랜서 - 0.033
	// make라는 메서드를 선언
		
	public void make(int s, boolean check) {
		System.out.println("급여 계산");
		
		if(check) {
			double t1 = s*0.03;
			double t2 = s*0.02;
			double t3 = s*0.01;
			double t4 = s*0.01;
			double result = s-t1-t2-t3-t4;
			System.out.println("실 급여" + result);
		}
		
		else {
			double result = s - s * 0.033;
			System.out.println("실 급여" + result);
		}
		
		s= 0;
	}
	
}
