package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	
	public static void main(String[]args) {
		//기본생성자 호출
		Book bk = new Book();
		bk.inform();
		//매개변수 3개인 생성자 호출
		
		Book bk2 = new Book("자바프로그래밍" , "이지스퍼블리싱" , "박은종");
		bk2.inform();
		
		// 매개변수 5개인 생성자 호출
		Book bk3 = new Book("박은종" , "이지스퍼블리싱" , "자바프로그래밍", 25000, 1.0);
		bk3.inform();
	}
}
