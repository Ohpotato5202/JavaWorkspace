package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	
	public static void main(String[]args) {
		//person 클래스 == 나만의 자료형(여러개의 자료형에 자료형에 여러개의 값들을 보관)
		Person p = new Person(); // 객체 생성 == 인스턴트화
		System.out.println(p.toString()); // 기본값은 들어가있음 (jvm이 자동으로 추가해줌
		
		//값대입
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("김갑생");
		
		System.out.println(p.toString());
		p.setAge(23);
		p.setGender('남');
		p.setEmail("alsrudals@naver.com");
		p.setPhone("010-4121-3393");
		
		System.out.println(p.toString());
	}
	

}
