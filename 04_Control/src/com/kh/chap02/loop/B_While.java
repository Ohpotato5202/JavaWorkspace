package com.kh.chap02.loop;

public class B_While {

	/*
	 * While문
	 * [표현법]
	 * 
	 * [초기식] // 필수가 아님
	 * While(조건식){ // 조건식이 true일경우 While문 내부의 내용이 실행된다e
	 * 반복실행 할 코드
	 * [증감식] //필수가 아님
	 * }
	 * */
	public void method1() {
		// for문을 While문으로, While문을 랙문으로 표현할 수 있음.
		
		//초기식
		int i = 0;
		while(i<5) {
			System.out.println("안녕하세요");
			// 증감식
			i++;
		}
		
		System.out.println(i); // 5
	}
	public void method2() {
		// 1 2 3 4 5 
		int i = 1;
		while (i<=5) {
			System.out.println(i ++ + " "); 
	}
	}
	public void method3() {
		// 1~8개의 \
		// While문의로 출력
		
		int i = 1;
		while (i< 10) {
			if(i % 2 == 1);
			System.out.print(1); 
		}
		i++;
	
	 System.out.println(" ");
	 i = 1;
	 while (i < 10) {
		 System.out.print(1);
		 i +=2;
	       }
	    }
	
    public void method4() {
    	// 1 부터 랜덤값 까지의 총 합계
    	// 랜덤값의 범위 : 1 ~ 100
    	
    	// while문 형식으로 만들기.
    	// 1) random값 구하기
    	int random = (int)(Math.random() *100 + 1);
    	// 2) sum변수 선언
    	int sum = 0;
    	// 3) 1~random값까지의 숫자를 더하기
    	int i = 1;
    	while (i <= random) {
    		sum += i;
    		i++;
    		
    	}
    	System.out.print("1 부터" +random+"까지의 총 합계 : "+sum);
}
    /*
     * do-while문
     * [표현법]
     * do{ // 별도의 조건검사 없이 최초 1번은 무조건 실행.
     *  실행할 코드
     * } while(조건식) // 조건검사후 true면 반복실행
     * }             // 조건검사후 false면 반복종료
     * */
    
    public void method5() {
    	int num = 1;
    	
    	do {
    		System.out.println("ㅎㅇ");
    	}while(num == 0);
    	}
    
	
    }
