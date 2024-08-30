package com.kh.first; // 패키지 선언부
// 패키지 작성시 2단계까지는 도메인의 역순으로 작성한다.(관례)

public class HelloWorld { // 클래스 영역 시작부분
    /*
     * /* 주석 여러줄 만들 떄 사용
     * 
     * 메인 메서드는 자바 애플리케이션을 실행하는 역할을 함.
     * (entry point).
     * 
     * main메서드는 반드시 아래와 같은 구조로 이루어져있다.
     * public static void main (string args[])
     * 
     */
	public static void main(String args[]) {
		// 메서드 영역
	    // 출력문. 콘솔창에 ()안에 들어간 문자열을 출력해줌.
		System.out.print("HelloWorld");
	}
}
