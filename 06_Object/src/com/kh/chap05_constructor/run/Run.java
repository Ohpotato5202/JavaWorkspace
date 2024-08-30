package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {
	

	public static void main(String[]args) {
		//기본생성자 호출
		User u1 = new User();
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("김민욱");
		u1.setAge(26);
		u1.setGender('남');
		
		System.out.println(u1.toString());
		
		//매개변수 3개인 생성자 호출
		
		User u2 = new User("user02", "pass02", "kym" );
		System.out.println(u2.toString());
		
		// 매개변수 5개인 생성자 호출
		User u3 = new User("user03", "pass03", "kym2", 36, 'M' );
		System.out.println(u3);
}
}
