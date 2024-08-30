package com.kh.practice.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {

		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		System.out.print("메뉴번호 : ");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			tokenMenu();
			break;
		case 2:
			inputMenu();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("다시 입력해주세요");
		}
		mainMenu();

	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 개수 : "+str.length());

		// TokenController의 afterToken함수 호츌후 반환값을 가지고
		String result = tc.afterToken(str);

		// 토큰 처리 후 글자, 토큰 처리 후 개수
		System.out.println("토큰 처리 후 글자 : "+result);
		System.out.println("토큰 처리 후 개수 : "+result.length());

		// 모든 글자를 대문자로 변환한 것을 출력
		System.out.println("모두 대문자로 변환 : "+result.toUpperCase());
	}

	public void inputMenu() {
		
		System.out.println("문자열을 입력하세요 :");
		String str = sc.nextLine();
		System.out.println(tc.firstCap(str));

		System.out.println("찾을 문자를 하나 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch+"문자가 들어갈 개수"+tc.findChar(str, ch));
		
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력 찾을 문자를 하나 입력하세요 :

		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		// 반환 값 출력

	}

}
