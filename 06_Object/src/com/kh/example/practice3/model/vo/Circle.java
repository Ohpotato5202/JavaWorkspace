package com.kh.example.practice3.model.vo;

public class Circle {

	private static final double PI = 3.14;
	// 밑줄 =static, 대문자변수 = final
	private static int radius = 1;
	
	public void incrementRadius() {
		radius++;
		
	}
	// 넓이 (pi * raduis * raduis)
	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : " + (PI * radius * radius));
		
	}
	// 둘레 (pi * raduis * 2)
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : " + (PI * radius *2));
		
	}
	
}
