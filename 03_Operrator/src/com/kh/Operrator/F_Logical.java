package com.kh.Operrator;

import java.util.Scanner;

public class F_Logical {
    /*
     * 논리 연산자 : 논리값 두개를 비교하는 연산자
     * 
     * AND &&: A && B
     *         A와 B가 모두 true인 경우 true, 둘중 하나라도 false값이 들어간경우
     *         false를 반환
     *         
     * OR || : A || B
     *         A와 B중 하나라도 true인 경우 true, 둘 다 false인 경우가 false값을 반환
     * */
	
	Scanner sc = new Scanner(System.in);
	
	
	public void method1() {
		
		System.out.println("정수값을 입력해주세요 : ");
		int num = sc.nextInt();
		
		// 사용자가 입력한 값이 양수이면서 짝수인지 판단
		// num > 0 && num % 2 == 0
		
		boolean result = (num > 0) && (num % 2 == 0);
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? " +result);
		
	}
	
	public void method2() {
	   
		System.out.println("정수값을 입력해주세요 : ");
		int num = sc.nextInt();
		
		// 정수값이 1에서부터 100 사이의 값인지 확인
		// 1 <= num <= 100 xx
		// num <= 100
		boolean result = 1 <= num && num <= 100;
		
		System.out.println("사용자가 입력한 값이 1이상 100이하의 값입니까? " +result);
		
	}
	
	public void method3 () {
		System.out.println("A~Z까지의 문자를 입력해주세요");
		char ch = sc.nextLine() .charAt(0);
				
		// 사용자가 제대로 A~Z까지의 값을 입력했는지 확인
		// (int) ch => 65
        // ch == 'A' || ch = 'B' XX
		// ch >= 'A' && ch <= 'Z'
	    // 힌트) 아스키 코드표. 자동형변환
				
	    boolean result = ch >= 65 && ch <= 90;
	    //boolean result = ch >= 'A' && ch <= 'Z';
	    
		System.out.println("사용자가 입력한 값이 영어 대문자 입니까? " +result);
	}
	
	public void method4() {
		
		System.out.println("계속하려면 y를 입력하세요. ");
		char ch = sc.nextLine().charAt(0);
		
		
		// y Y
		// 사용자가 입력한 값이 소문자 Y 이거나 /혹은 /또는 대문자 Y인지 확인
		boolean result = ch == 'y' || ch == 'Y';
		
		System.out.println("사용자가 입력한값이 y이거나 Y입니까? " +result);
	}
	
	public void method5() {
		int num1 = 10;
		
		boolean result1 = (num1 < 5 ) && (++num1 > 0);
		
		// result1 ? false 
		// num1 ? 10 , 11
		System.out.println("result1 ? " + result1);
		System.out.println("num1 ? " + num1);
		
		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 > 0);
		// or -> 둘중 하나라도 true면 true반환\
		// result2 ? true
		// num2 ? 11 , 10
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		
		//boolean result3 = t || (num1 > 0);
		//boolean result3 = false && (num1 > 0);
	}
}
