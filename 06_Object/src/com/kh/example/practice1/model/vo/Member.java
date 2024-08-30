package com.kh.example.practice1.model.vo;

public class Member {
//	실행용 메소드로 기본 생성자와 매개변수 3개인 생성자,
//	매개변수 5개인 생성자들을 통해 각각의 객체 생성 후
//	inform()을 통해 출력

	
	private String  memberId;
	private String memberPwd ;
	private String memberName ;
	private int age ;
	private char gender;
	private String phone;
	private String email;
	private String Member;
	
	public void changeName(String name) {
		memberName = name;
	 
	}	
	public void printName () {
		System.out.println(memberName);
	}
}

	


