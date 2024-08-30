package com.kh.chap06.method.controller;

public class MethodController2 {
	static int count = 0;
	int count2 = 0;
	/*
	 * static 메소드
	 * 
	 * 접근제한 static [예약어] 반황형 메소드명 ([매개변수]){
	 *   수행내용
	 *   [return 반환값]
	 * }
	 * 
	 * 
	 * - 호출시 객체 생성할 필요가 없음
	 * - 클래스명,메서드명(전달값); 으로 호출
	 * - 프로그램 시작시, static메모리 영역에 메소드가 할당되기 떄문.
	 * - 예약어, 매개변수, return등은 상황에 따라 생략가능(일반 메서드와 동일)
	 * */
	
	private static int multiply(int num1, int num2) {
		System.out.println("static 메소드");
		
		// 매개변수 2개로 연산시 문제없다.
		//return num1 * num2;
		
		// 같은 범위에서 연산가능
		// count는 프로그램 시작과 동시에 저장공간 할당
		// num1은 multiply함수 호출시 할당
		// return count * num1;
		
		// count2는 현재객체 생성 전 까지는 메모리 영역에 값을 할당 받지 못함.
		// multiply함수는 현재객체를 생성하지 않아도, 호출이 가능함.
		return num1 * num2;

	}

}
