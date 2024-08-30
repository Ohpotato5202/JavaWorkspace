package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {

	
	/*
	 * 선택적으로 특정코드만 실행시키고자 할떼 => 제어문
	 * 특정코드만 반복시키고 싶을때 => 제어문(반복문)
	 * 반복문 내부에서 흐름을 제어할때 => 분기문
	 * */
	
	Scanner sc = new Scanner(System.in);
	// 삼항 연산자를  조건문형식으로 변경
	public void method1() {
		
	    /*
	     * 단독 if문
	     * 
	     * if(조건식){
	     *    조건식의 결과가 true일 경우 실행되는 코드
	     * }
	     * 
	     * */
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// string result = num > 0 ? "양수입니다." : "양수가 아닙니다".;
		
		String result = "양수입니다.";
		
		if(num < 0) {
			result = "양수가 아닙니다..";
		
//		if(num > 0) {
//			result = "양수입니다."	;		
		}
		
		
		System.out.println(result);
		}
		
	public void method2() {
		/*
		 * if ~ else
		 * 
		 * if(조건식){
		 * ..실행코드1.. // 조건식이 true인 경우 실행.
		 * } else {
		 * ..실행코드2.. // 조건식이 false인 경우 실행.
		 * }
		 * */
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		} else { 
			System.out.println("양수아니다");
		}
		
		// num > 0 ? "양수다" : "양수아니다"
		
//		String result = "양수가 아니다";
		
//		if(num > 0) {
//			result = "양수다";
		}
				
				
//		if(num > 0) {
//			System.out.println("양수다");
//		}
//		if(num <= 0) {
//			System.out.println("양수아니다");
//		}
		
		
     public void method3() {
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		/*
		 * if ~ else if
		 * 같은 비교대상으로 여러개의 조건을 제시해야하는 경우 사용
		 * 
		 * if(조건식 1){
		 *  .. 조건식1이 true인 경우 실행할 코드..
		 *  }
		 * } else if(조건식 2){
		 *  .. 조건식1이 false이면서 조건식2가 true인경우 실행
		 * } else if(조건식 3){
		 *  .. 조건식1이 2가 false이면서 조건식3가 true인경우 실행
		 *  }
		 * ...
		 * [ else{ // 생략가능.
		 *   ..모든조건식이 false인 경우 자동 실행
		 * }]
		 * */
		if(num > 0 ) {
			System.out.println("양수다");
		}else if (num > 1 ) {
			System.out.println("??");
		}else { 
			System.out.println("음수다");
		}
     
			
		if(num > 0 ) {
			System.out.println("양수다");
		}else if(num == 0 ) {
			System.out.println("0이다");
        }else {
        	System.out.println("음수다");
        	
		}
	}
     
     public void method4() {
    	 
    	 // 사용자가 입력한 나이값을 가지고 어린이/청소년/성인
    	 // if ~ else if
    	 
    	 System.out.println("나이 입력 : ");
    	 int age = sc.nextInt();
    	 
    	 //age가 13세 이하라면 어린이
    	 //age가 113세 초과 19세 이하라면 청소년
    	 //19세 초과라면 성인을 출력.
         //string result = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
    	 if(age <= 13) {
    		 System.out.println("어린이");
    	 }else if(/*age > 13 && */ age <= 19) { 
    		 System.out.println("청소년");
    	 }else{
    	 }
    		 System.out.println("성인"); 
     }
    		 
     public void method5() {
      
    	 System.out.print("이름 : ");
    	  String name = sc.nextLine();
     
    	 System.out.print("성 (M/F) :");
    	 char gender = sc.nextLine().charAt(0);
    	 
    	 String result; //= ""; // 2) 애초에 초기화시키기
    	 
    	 if(gender == 'M') {
    		 result = "남학생";
     }
    	 else if (gender == 'F') {
    		 result = "여학생";
    	 
    	 }else { 
    		 //result =""; // 1) else에도 무의미한 값 추가하기
    		 System.out.println("성별을 잘못 입력하셨습니다.");
    		 return; // 메서드 종료(호출한곳으로 이동)
    	 }
    	 System.out.printf("%s님은 %s이다", name , result);
    	 
    }
    		 
   public void method6() {	 
    	
	   // 문자열간의 동등비교
	   System.out.print("이름 : "); 
	   String name = sc.nextLine();
	   String b = name;
	   // Steing은 참조자료형
	   System.out.print(name);//name에 저장된 값은 주소값
	   if(name.equals("김민욱")) {
		   System.out.println("김민욱님 반갑습니다.");
	   }else {
		   System.out.println("누구데요?.");
	   }
	   /*
	    * 기본자료형 : boolean , byte , short , int , long , float , double ,char
	    * 참조자료형 : Sting // 특이한 녀석
	    * 
	    * 기본자료형간에 비교시 != , == 사용가능함.
	    * 단, 기본자료형이 아닌 참조자료형은 동등비교시 equals 함수를 씀.
	    * 따라서 문자열과 문자열간에 동등 비교시에는
	    * 
	    * A문자열. equals(B문자열) _> A문자열과 B문자열이 같은지 검사후, 같다면 True 다르다면 false
	    * 다르다면 false값을 반환
	    * */
	   
} 
   public void method7() {	 
	   
	   // 양수를 입력받고, 입력받은 값이 짝수인지 홀수인지 판별하는 프로그램
	   // 만약 양수가 아닌경우, 양수가 아닙니다를 출력
	   
	   System.out.print("정수 (양수) 입력 : ");
	   int num = sc.nextInt();
	   
	   if(num > 0) { // 양수인경우
		   if(num % 2 == 0 ) { // 양수인 경우면서 짝수인경우
			   System.out.println("짝수입니다.");
		   }else { // 양수인 경우면서 홀수인경우
			   System.out.println("홀수입니다.");
		   }
        }else { // 양수가 아닌경우
        	System.out.println("양수가 아닙니다.");
        }
		// 짝수입니다, 홀수입니다, 양수가 아닙니다.
        }
}
     
     


