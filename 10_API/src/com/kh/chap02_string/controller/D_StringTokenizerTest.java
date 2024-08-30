package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class D_StringTokenizerTest {

	public void method() {

		String str = "Jave , Oracle, JDBC, HTML, CSS, JS";

		// 문자열을 구분자를 기준으로 분리
		// 방법1. 분리된 문자열들을 String[]배열에 담아주기 위한 방법으로
		// 문자열.split(구분자) : String[]

		String[] arr = str.split(", ");

		for (String s : arr) {
			System.out.println(s);

		}

		System.out.println("===============================");

		// 방법2. 분리된 각각의 문자열들을 토큰으로 취급하는 방법.
		// new StringTokenizer(분리하고자 하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ", ");

		System.out.println("분리된 문자열의 갯수 ? " + stn.countTokens());

		while (stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
			// 함수 호출할때마다 position값을 증가시켜서 문자열을 잘라옴 substring(strart, position)
		}

		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		// currentToken = null;
		// class Token{
		// String str;
		// Token next;
		// setNext(Token next)
		// }
		// Token currentToken = t;
		// currentToken = t.t;

		// Token t = new Token("Java" , null);
		// Token t2 = new Token("oracle", null);
		// t,setT(t2);
		// Token t6 = new Token("JS", null): // 다음 토큰 없음
		// 현재 남은 토큰 갯수의 범위를 벗어날 경우 오류 발생.

	}

}
