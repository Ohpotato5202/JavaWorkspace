package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnchekedException {
	/*
	 * RuntimeException
	 * - 프로그램 실행중 발생되는 예외들
	 * 
	 * RuntimeException
	 * - NullPointerException : 참조변수가 null인 상태에서 어딘가에 접근하려고 할때.
	 * - ArrayIndexOutOfBoundException : 존재하지 않는 인덱스에 접근시.
	 * - ClassCastException : 허용할수 없는 자료형의 변환시 발생되는 오류 //다운캐스팅 하다가 자주 발생
	 * - ArithmeticException : 나누기( / , %  ) 연산시 0으로 나눌때 발생.
	 * - NegativeArraySizeException : 배열의 크기를 음수로 지정시 발생
	 * ...
	 * => 이러한 RuntimeException과 관련한 예외들을 "예측이 가능"하기 때문에 
	 *    예외 자체가 발생이 안되게끔 조건식을 걸어서 해결할 수 있다.
	 *    따라서 굳이 예외 처리가 할 필요가 없음.
	 *    예외 처리(예외가 발생했을때 실행할 내용을 정의해두는것)
	 * 
	 * */

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException
		
		// 사용자에게 두개의 정수값을 입력받아 나누는 프로그램 생성
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 정수(0제외) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		// 해결방법 1. 조건문으로 처리하기.
		// 예외가 발생할 가능성을 차단.
//		if(num2 != 0) {
//			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
//		}else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		// 해결방법 2. 예외처리 구문으로 해결
		// 예외가 발생할 경우의수를 열어두고, 예외(에러) 발생시 대신 실행할 구문을 정의함.
		/*
		 * try ~ catch문
		 * [표현법]
		 * try {
		 *     // 예외가 발생될수 있는 코드
		 * } catch(발생할 예외 클래스명 변수명) {
		 *     // 예외 발생시 대신 실행 구문.
		 * }
		 * */
		try {
			System.out.println("나눗셈 연산 결과 : " + (num1 /num2));
		}catch (ArithmeticException e) {// 발생된 에러를 저장할 매개변수
			System.out.println("0으로 나눌수 없습니다.");
			e.printStackTrace(); // 오류를 추적할수 있는 출력문
		}
		
         System.out.println("프로그램 종료");		
	}
	
	public void method2() {

		System.out.print("정수 입력(0제외) : ");

		try {
			int num = sc.nextInt(); // 첫 번째 에러발생 부분 (InputMismatchException)

			System.out.println("나눗셈 연산 결과 : " + (10 / num)); // 두 번째 에러발생 부분

		} catch (InputMismatchException e) {
			System.out.println("정수를 똑바로 입력하세요. ");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} // 다중 catch블럭 : 예외가 여러개 발생할 가능성이 있는 경우 사용.

		System.out.println("프로그램 종..료..");
	}
	
	public void method3() {
		// ArrayIndexOutOfBoundException :
		// NegativeArraySizeException :
		// 두 예외에 대한 처리를 구현한 코드작성
		
		System.out.print("배열의 크기를 입력 .. : ");
		
		try {
			int size = sc.nextInt();
			if(size > 0) {
				
			}
			// NegativeArraySizeException 발생할수 있음.
		    int [] arr = new int[size];
		    
		    if(size > 100) {
		    	
		    }
		    // ArrayIndexOutOfBoundException 발생할수 있음.
		    System.out.println("100번 인덱스의 값 : "+ arr[100]);
		} catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기를 음수로 제시할 수 없습니다. ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스 입니다.");
		} catch(RuntimeException e) { // 상위 클래스, 다형성을 이용하여 자식객체 에러 받아줌
			System.out.println("뭔지 모르겠지만 일단 한잔해");
		}
		// 예외발생시 대신 실행할 코드
		// 1) System.out.println("배열의 크기를 음수로 제시할 수 없습니다. ");
		// 2) System.out.println("부적절한 인덱스 입니다.");
		
		// try ~ catch블럭으로 예외처리 하기.
	}
	
	/*
	 * RuntimeException 관련된 예외들은
	 * - 조건문으로 해결 가능함. => 예외자체가 발생하지 않게 개발자가 소스코드로 핸들링 가능.
	 *                        (예외 원천 차단 가능)
	 * - 예외처리구문으로 해결가능 => 예외가 발생했을 때를 대비해서, 에러 발생시 대신 실행할 내용을
	 *                         기술하는 것                      
	 *   예외에 대한 예측이 가능한 상황에서는 항상 "조건문"으로 해결하는 것을 권장한다.
	 *   RuntimeException계열들은 예측이 가능한 상황들이기 때문에, 예외처리가 필수가 아니다.
	 *   => 필수가 아닌 예외처리들은 UnchekedException이라고함
	 * 
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
}
