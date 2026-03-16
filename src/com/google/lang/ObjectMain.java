package com.google.lang;

public class ObjectMain {

	public static void main(String[] args) {
		// 모든 클래스의 상속 root는 Object이다. 
		// >> 모든 클래스는 Object type이다. 
		
		Object obj = new Object();
		
		boolean check = obj.equals(obj);
		System.out.println(check);
			
		String str = obj.toString();
		System.out.println(str);
		
		String name = "Winter";
		
		Object obj1 = name;
	}
}
