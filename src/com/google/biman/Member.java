package com.google.biman;

public class Member {
	
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}
	
	// 싱글톤 패턴(Singleton) : 클래스의 인스턴스가 하나만 생성되고, 그 인스턴스에 접근할 수 있는 전역적인 접근점을 제공하는 디자인 패턴
	private static Member member;
	
	public static Member getInstance() {
		if (member == null) {
			member = new Member();
		}
		return new Member();
	}
}
