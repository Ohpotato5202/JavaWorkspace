package com.kh.Operrator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항연산자 : 3개의 항목을 가지고 연산하는 연산자
	 * 
	 * [표현법] 조건식 ? 조건의 결과가 true인경우 결과값 : false인경우의 결과값
	 */
	
	Scanner sc = new Scanner(System.in); 
	
	public void method1() {
         
		// 사용자가 입력한 정수값이 양수인지 아닌지 판별.
		// 양수라면 : 양수입니다.
		// 음수라면 : 음수입니다.
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "양수입니다 " : "양수가 아닙니다.";
		
		System.out.println(num+"은" +str);
		
}
	public void method2() {
		// 사용자로부터 종료의사 여부를 입력 받은 후 판별해서 출력
		
		// 사용자가 y,Y입력시 -> 계속 진행합니다.
		// 그 외외값을 입력시 -> 프로그램을 종료합니다.
		System.out.print("계속 하시려면 y를 입력해주세요. ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "계속 진행합니다. " : "프로그램을 종료합니다.";
		System.out.println(result);
	}
	
	public void method3() {
		// 사용자가 입력한 값이 양수, 0, 음수인지 정확하게 판별
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수입니다" : (num == 0 ? "0입니다" : "음수입니다");
	    System.out.print(result);
		
	}
	
	public void method4() {
		/*
		 * 두개의 정수값과 + 혹은 -의 문자를 하나 입력받아서
		 * +일경우 덧셈, -일경우 뺄셈 연산한 결과를 출력.
		 * 둘 다 (+,-) 아닌경우 "잘못 입력했습니다."를 출력
		 * */
		 
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine() ; // 개행문자 비우기
		System.out.print("연산자 입력(+ or -) : ");
		char op = sc.nextLine().charAt(0);
		String result =  op == '+' ? ""+(num1+num2) : (op == '-' ? ""+(num1-num2) : "잘못입력");
		
		System.out.println(result);
		// 힌트 : 삼항연산자 중첩, 자동형변환
		// 10 5 + => 15
		// 10 5 - => 5
		// 10 5 * => 잘못 입력했습니다.
		
		
	}
	
}