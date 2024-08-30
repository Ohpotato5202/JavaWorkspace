package com.kh.Operrator;

public class E_Comparison {
	/*
	 * 비교연산자 / 관계연산자(이항연산자)
	 * 두 개의 값을 가지고 비교
	 * 비교 연산한 결과가 참일경우 true / 거짓일경우 flase값을 반환
	 * 즉 , 비교연산자의 반환결과는 항상 논리값임.
	 * if조건식에 자주 활용
	 * 
	 * 크고 작음을 비교
	 * < , > , <= , >=
	 * 
	 * 일치함을 비교(동일성 비교)
	 * a == b : a와 b가 일치합니까?
	 * a != b : a와 b가 일치하지 않습니까?
	 * 
	 * - equals(동등성 비교)
	 * String a - "1234";
	 * String b - "1234";
	 * a == b -> false
	 * */
    public void method1() {
    	int a = 10;
    	int b = 10;
    	
    		
        System.out.println("a > b ? "+ (a>b));
    	// 연산자 우선순위상 산술연산이 비교연산보다 더 높기 때문에
    	// 괄호로 묶어서 우선순위를 높여줘야 한다.
    	
    	boolean result = (a == b);
    	
    				
    	// 산술연산 + 비교연산
    	System.out.println(a - b < 0 ); // true
    	
    	System.out.println(a * 2 > b /5); // true
    				
    	boolean result1 = (a % 2 == 0);	// true	
    	boolean result2 = (a % 2 != 0);	// false
    	boolean result3 = (a % 2 == 0);	// false
    	boolean result4 = (a % 2 == 1);	// false
    	// 짝수, 홀수, 배수를 구할 때 자주 활용되는 방식
    	
    	
    }
	
	
	
	
	
	
	
}
