package com.kh.Operrator;

public class C_Compound {

	/*
	 * 복합대입연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * += , -= , *= , /= , %=
	 * a = a + 3; => a += 3;
	 * a = a * 9; => a *= 9;
	 * 
	 * 기존의 값에 +-*n을 계산해서 다시 a에 대입해주겠다
	 * */
	public void method() {
		
		int num = 12;
		
		num += 3; // num = 15;
		
		num -= 5; // num = 10;
		
		num *= 6; // num = 30;
		
		num /= 2; // num = 
		
		num %= 4; // num = 2
		
		// += 의 경우 문자열 접합도 가능함
		String str = "Hello " ;
		str += "world"; // Hello world;
	}
	
}
