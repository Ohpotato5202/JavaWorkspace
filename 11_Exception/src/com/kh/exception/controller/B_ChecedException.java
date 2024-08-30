package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_ChecedException {
	/*
	 * ChecedException은 반드시 예외처리를 해줘야 되는 예외들을 의미
	 * (즉, 예측 불가능한 곳에서 에러가 발생할 가능성이 있는 에러들)
	 * => 따라서 예외처리가 필수이며, 주로 알수 없는 외부매체와의 입출력시 발생.
	 * */

	public void method1() {
		try {
		    method2();
		}catch(IOException e) {
			
		}
	}
	
	public void method2() throws IOException {
		
		// Scanner sc = new Scanner(System.in); // 코테에서 안 좋음
		
		// Scanner와 같이 키보드로 값을 입력 받을 수 있는 객체(성능 빠름)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 기본생성자가 없음, 단독으로 사용불가
			
		System.out.println("아무 문자열이나 입력해주십죠.");
//		try {
//		    String str= br.readLine(); 
//		    // 이 메소드를 호출할거라면, 반드시 IOException에 대한 에러를 핸들링 하라고, 컴파일 단계에서 알려줌.
//		    
//		    System.out.println("문자열의 길이 : "+str.length());
//		    
//		    
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		// 예외처리방법 1. try ~ catch() => 발생한 예외를 직접 처리.
		
		// 예외처리방법 2. throws : 발생한 예외를 그 자리에서 해결하지 않고, 
		//                       현재 메소드를 호출한곳으로 예외를 넘기는 방법.
		
		String str = br.readLine();
		
		System.out.println("문자열의 길이 : "+str.length());
		
	}
	
	/*                  예외 발생 시점                            예외처리
	 * RuntimeException 프로그램 실행도중 => 런타임에러(컴파일 에러 x)   필수가 아님.(조건식으로 처리)
	 * IOException      그 외 => 컴파일 에러                       필수(반드시 예외처리 해야함)
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
