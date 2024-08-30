package com.kh.exception.run;

import com.kh.exception.controller.A_UnchekedException;
import com.kh.exception.controller.B_ChecedException;
import com.kh.exception.controller.C_CustomException;

public class ExceptionRun {
	
	public static void main(String[] args){
		/*
		 * 에러(오류)종류
		 *  - 시스템 에러 => 컴퓨터의 오작동으로 인해 발생. (소스코드로 해결 안됨) 심각한 에러.
		 *  - 컴파일 에러 => 소스코드상의 문법적인 문제로 발생하는 에러. => 소스코드 수정으로 해결
		 *                (빨간줄로 오류를 알려줌) // 집적 해결 하려고 노력해야함
		 *  - 런타임 에러 => 소스코드상으로는 문제없음. 프로그램 실행 도중에 발생하는 에러
		 *                사용자의 잘못된 사용 혹은 개발자의 실수로 인해 발생 // 무조건 개발자 실수다.
		 *  - 논리  에러 => 소스코드상으로 문제 없음 런타임에서도 문제없음. 단,
		 *                프로그램 의도상 맞지 않는 기능이 실행되는 경우들. // 제일 고치기 힘듬 (결과값 없이 오류가 뜸)
		 *                // 고객과 개발자 사이의 기능 구현 차이나, 프로세스, 소통의 차이 때문에 자주 발생.
		 *                
		 *  시스템 에러를 제외한 컴파일, 런타임, 논리 에러와 같은 덜 심각한 에러들을 가지고 작업을 할 예정
		 *  이런것 들을 전부 예외. (Exception)
		 *  
		 *  이러한 예외들이 발생했을 경우, 에러를 "처리" 하는 방법을 정의하는것을 "예외처리"라고함.
		 *  예외 처리를 해야하는 이유 : 예외 발생시 프로그램이 비정상적으로 종료되는것을 막기 위함.
		 *  
		 *                
		 * */
		A_UnchekedException  au = new A_UnchekedException ();
		//au.method3();
		
		B_ChecedException bc = new B_ChecedException ();
		//bc.method1();
		
		int num = 1;
		int num2 = 2;
		
		// 특정상황
		if(num != num2) {
			// 에러객체 생성 후, throw 키워드 사용
			// throw + 에러객체 
			throw new C_CustomException("사용자 정의 에러 발생 !!");
		}
		System.out.println("프로그램 종료...!!!");
		
	}








}