package com.kh.chap06.method.controller;

public class MethodController1 {
	/*
	 * 메소드
	 * 
	 * 접근제한자 [예약어] 반환형 메소드형 ([매개변수]){
	 *    수행할 코드;
	 *    
	 *    [return 반환할값;] // 반황형이 void일 경우 생략 가능.
	 * }
	 * */
	// 1. 매개변수와 반환값이 둘 다 없는 메소드
	public void method1() {
	
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
		sum(10);
		//return // jvm이 자돟으로 생성해서 넣어줌	
		//return이 모든 파일엔 다 들어가 있음 void 제외		
	}
	
	// 2. 매개변수는 없고 반환값는 있는 메소드
	public int random() {
		System.out.println("매개변수는 없고, 반환값은 있는 메소드");
		
		return (int)(Math.random()*100+1);
		
	}
	
	// 3. 매개변수는 있고 , 반환값은 없는 메소드
	public void sum(int num) {
		
		// 1~10까지 총 합계 구하기
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			
		}
		System.out.print("1부터 " +num+"까지 ");
		System.out.println("총 합계 : " +sum);
	}
	// 4. 매개변수 있고, 반환형도 있는 메소드
	public int multply(int a, int b) {
		System.out.println("매개변수도 있고, 반환형도 있는 메소드");
		return a * b;
	}

	
	
	
	
	
	
	
	
	
	
	
}
