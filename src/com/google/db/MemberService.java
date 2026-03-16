package com.google.db;

public class MemberService {
	public static void main(String[] args) {
		String id = "Winter";
		String pw = "1234";
		String name = "김윈터";
		
		Member member = new Member();
		member.id = id;
		member.pw = pw;
		member.name = name;
		
		MemberDAO dao = new MemberDAO();
		dao.addMember(member);
	}
}
