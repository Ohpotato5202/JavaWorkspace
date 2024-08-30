package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {

	/*
	 * Switch문은 if문과 동일한 조건문.
	 * 
	 * 
	 * if(조건식) => 조건식 복잡하게 기술가능. Switch 조건식x => 확신한 값만을 기술하여 동등비교만 수행.
	 * 
	 * 
	 * [표현법] Switch(동등비교를 수행할 변수){ case 값1 : 값1과 일치한다면 실행할 코드; break;// 값1과 일치하는 코드를
	 * 실행후 switch문을 빠져나가는 역할
	 * 
	 * ... case 값n : 값n과 일치한다면 실행할 코드; break; default : case들중에 일치하는 값이 없는 경우 실행할
	 * 코드; } if(a == 값1)
	 * 
	 * }else if(a ==값2) {
	 * 
	 * }else if(a ==값n) {
	 * 
	 * }else{
	 * 
	 * }
	 * 
	 * 키보드 입력, 마우스입력 a ,b ,c.., z 입력시간이 다른경우? 이렇게 항상 동일한 연산속도로 결과가 나와야 하는경우 switch문
	 * 사용
	 */
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 1~3사이의 정수값을 입력받아
		// 1인경우 "빨간불 입니다."
		// 2 파랑
		// 3 초록
		// 잘못 입력시 "잘못 입력했습니다."
		// ctrl + shift + o => 자동 import
		
		System.out.print("1~3사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("빨간불입니다. ");
			break;
		case 2 : 
			System.out.println("파란불입니다. ");
			break;
		case 3 : 
			System.out.println("초록불입니다. ");
			break;
		default : 
			System.out.println("잘못입력했습니다.. ");
		
		}
	}
}




