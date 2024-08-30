package com.kh.Variable;

public class D_Printf {
	/*
	 * System.out.println(출력할값) => 값 출력후 개행 처리
	 * System.out.print(출력할값) => 값만 출력
	 * 
	 * Sustem.out.printf("출력하고자 하는 형식" , 출력하고자 하는 값)
	 * => f는 fomat(형식)을 의미
	 * => 형식에 맞춰서 값들을 출력하고 끝.(개행X)
	 * 형식
	 *  %d : 정수
	 *  %f : 실수
	 *  %c : 문자
	 *  %s : 문자열
	 * */

	public void prinfTest() {
		int iNum1 = 10;
		int iNum2 = 20;
		
		
		// iNum1 : xx , iNum2 : xx
	    System.out.println("iNum1 : "+iNum1+", iNum2 : "+iNum2);
	    System.out.printf(" inum1 : %d , iNum2 : %d\n" , iNum1, iNum2);
	    
		// 10 + 20 = 30
	    // %d + %d = %d
	    System.out.printf("%d + %d = %d", iNum1, iNum2, (iNum1 + iNum2));
		
		System.out.printf("%5d\n", iNum1); // 5칸의 공간 확보후 오른쪽정렬
		System.out.printf("%-5d\n", iNum1); // 5칸의 공간 확보후 왼쪽정렬
		
		//실수형식
		double dNum = 4.27546789;
		System.out.printf("dNum : %f \n", dNum);
		// %d : 소수점아래 7번째 줄에서 반올림 처리되어 6째 까지만 출력
		
		System.out.printf("dNum : %.1f \n", dNum);
		// %.1f : 소수점 아래 2번째 자리에서 반올림되어 소숫점 아래 1번째 까지만 출력
		
		// 문자와 문자열 형식
		char ch = 'a';
		String str = "hello";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%c %s \n", ch, str);
		//주의점
		//지정한 포맷의 갯수와 종류, 뒤따라오는 변수의 갯수와 종류가 정확히 일치해야함
		// ctrl+shift+f : 자동정렬
	}
}
