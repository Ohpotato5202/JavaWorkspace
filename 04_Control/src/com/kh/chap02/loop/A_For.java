package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문중 하나, 어떤 실행코드를 "반복"적으로 수행시켜준다.
	 * 
	 * 반복문 : for /while
	 * 
	 * [표현법]
	 * for(초기식 조건식 증감식){
	 *   반복적으로 실행시키고자 하는 코드
	 * }
	 * 
	 * - 초기식 : 반복문이 시작될 때 "초기에 한번만 실행"되는 구문
	 *           반복문에서 사용할 변수를 선언 및 초기화 시키는 역할을 함.
	 *           ex) int i = 0;
	 *           
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문         
	 *           조건식이 true일 경우 반복문 실행
	 *           조건식이 false가 되는 순간 반복문을 멈추고 빠져나옴
	 *           보통 초기식에 선언한 변수를 가지고 조건식을 작성함
	 *           ex) i < 10;
	 *           
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 *           초기식에 제시된 변수를 가지고 증감식을 작성함
	 *           ex) i++, i--, i+=2 등등
	 * 
	 * */
    
	public void method1() {
		
//		// 1000번 반복하고 싶은경우?
//		for(int i = 0; i < 1000; i++ ) {
//			System.out.print("안녕하세요");
//		}
		
		// i값을 1~5 증가시키면서 출력
		for(int i = 1; i<=5; i++) { // 5회
			System.out.print(i);
		}
		
		for(int i = 1; i<=6; i++) { // 5회
			System.out.print(i);
		
		}
		
		for(int i = 0; i<=6; i++) { // 5회
			System.out.print(i++);
		}
		
		int i = 1;
		for(;;) {// 5회
			System.out.print(i++);
			if ( i < 6) break; //분기문
		}
	}
 		
		public void method2() {
		
			for(int i = 1; i<=5; i++) { // 5회
				System.out.print(i+ " ");
			}
				
			for(int i = 5; i > 0; i--) {
				System.out.print(1+" ");
			}
				
			for(int i = 1; i <=10; i++) {
				
				if(i % 2 == 1) {
					System.out.print(1+" ");
				}
	         }
			for(int i =1; i<10; i+=2) {
				System.out.print(i+" ");
			}
			System.out.println();
		
			
			for(int i = 1; i<11; i+=1) {
				System.out.print(i+" ");
			}
		}
			
	    public void method3() {
	    	// 반복문을 활용해서 1부터 10까지의 총 합을 구하기
	    	
	    	// int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
	    	
	    	int sum =0;
//	    	    sum+=10;
	    	for(int i =1; i<=10; i++ ) { // 1,2,3,4,5,6,7,8,9,10
	    		sum +=i; // sum += 1; sum += 2; sum += 3; ... sum += 10;
	    	}
	    	System.out.println("1에서부터 10까지의 총 합 : " +sum);
	    }
	    public void method4() {
	    	
	    	Scanner sc = new Scanner(System.in);

	    	// 입력받은 수가 양수인 경우, 1~ num까지의 총합을 구한후 출력
	    	// 출력형식 : 1에서부터 num 까지의 총 합계 : xx
	    	
	    	// 입력받은 수가 양수가 아닌경우 : 잘못입력했습니다.
	    	
	    	System.out.print("양수입력 : ");
	    	int num = sc.nextInt();
	    	
	    	
	    	if(num > 0 ) {
	    		int sum = 0;
	    		
	    		for(int i = 1; i<=num; i++) { // 1 2 3 4 5 
	    			sum += i;
	    			
	    		}
	    		
	    		System.out.printf("1에서부터 %d까지의 총 합계 : %d", num, sum);
	    		
	    		
	    	}else { 
	    		System.out.println("잘못입력했습니다.");
	    	}
	    }
	    	
	    public void method5() {
	       // 1에서부터 랜덤값(1~10사이의 랜덤한 정수) 까지의 총 합계
	    	/*
	    	 * java.lang.MAth 클라스에 정의되어있는 random()메소드를 호출하여
	    	 * 매번 다른 랜덤값을 얻어올 수 있음
	    	 * 
	    	 * 
	    	 * 0.0 ~ 0.999999999 사이의 랜덤값 발생
	    	 * 0.0 <= 랜덤값 < 1
	    	 * 1.0 <= 랜덤값 < 45.0
	    	 * 1.0 <= 랜덤값 < 46.0
	    	 * ? <= 랜덤값 < ?
	    	 * 
	    	 * [표현법]
	    	 * (int)(Math.random() * 출력하고자 하는 갯수 + 시작수)
	    	 * 시작수 + ~ (시작수 + 갯수)
	    	 * 
	    	 * 
	    	 * */
	    	
	    	//double random = Math.random();
	    	int random = (int)(Math.random() *10 + 1);
	    	System.out.println(random);
	    	
	    	int sum = 0;
	    	
	    	for(int i=1; i < random; i++) {
	    		sum += 1;
	    	}
	    	System.out.println("random ? " + random);
	    	System.out.println("랜덤값까지의 총 합계 : " +sum);
	    	
	    }	    	
	    
	    public void method6() {
	    	String str = "hello";
	    	
	    	/*
	    	 * h -> str.charAt(0)
	    	 * e -> str.charAt(1)
	    	 * l -> str.charAt(2)
	    	 * l -> str.charAt(3)
	    	 * 
	    	 * 문자열의 마지막 문자의 인덱스 위치는 문자열의 길이 -1과 항상 일치한다.
	    	 * 
	    	 * 
	    	 * o -> str.charAt(4)
	    	 * */
	    	// 문자열.ㅣ둫소(); 문자열의 길이를 반환해주는 함수
	    	// "hello" length(); 정수 
	    	
	    	
	    	for(int i =0; i<5; i++) {
	    		System.out.print(str.charAt(i)+ "  ");
	    	
	    	
	    	}
	    }
	    	public void method7() {
	    	    
	    	   /*
	    		*구구단 2단
	    		*2 X 1 = 2
	    	    *2 X 2 = 4
	    	    *2 X 3 = 6
	    	    *....
	         	*2 X 9 = 18
	    		**/
	    		
	    	for(int i =0; i<5; i++) { // 1 ~ 9, , 9번 반복
	    		System.out.printf("2 X %d = %d\n, i , 2 * 1 ");
	    	}
	    } 
	    	public void method8() {
	    		// 2~9단 모두 출력
	    		// hint) 중첩 반복문
	    		// 2단과 3단 4단 만든 후 차이점, 공통점 증가

	    	for(int i=2; i<=9; i++) {
	    		for(int j= 1; j <=9; j++) { // 1 ~ 9, , 9번 반복 
		    		System.out.printf("%d X %d = %d\n", i , j , i * j );
	   	}
	    		System.out.println("----------------------------------------");
	    	}
	   }
	    	public void method9() {
	    		/*
	    		 * 1 2 3 4 5
	    		 * 1 2 3 4 5
	    		 * 1 2 3 4 5
	    		 * 1 2 3 4 5
	    		 * 
	    		 * */
	    		
//	    		for(int i = ; i <=5; i++) {
//		    		System.out.print(i + " ");
//	    			}
//	    	
	    	
	    	
	    		/*
	    		 * 1 * * * *
	    		 * * 2 * * *
	    		 * * * 3 * *
	    		 * * * * 4 *
	    		 * * * * * 5
	    		 * 
	    		 * */
	    	
	    		for(int i= 1; i <=4; i++) {
	    			if( i== 1) {
		    		System.out.print(i + " ");
	    		}else {
	    			System.out.print("* ");
	    		}
	    }
	    			System.out.println("* ");
	    			//* 2 * * *
	    			
	    			for(int i = 1; i <=5; i++) {
		    			if( i== 2) {
			    		System.out.print(i + " ");
		    		}else {
		    			System.out.print("* ");
	    			
	    		}
	    	}
	    	        System.out.println("* ");
	    			//* 2 * * *
	    			
	    			for(int i = 1; i <=5; i++) {
		    			if( i== 3) {
			    		System.out.print(i + " ");
		    		}else {
		    			System.out.print("* ");
	    	
	    	
		    		}
	    	
	    	}    	
	    			System.out.println("* ");
	    			//* 2 * * *
	    			
	    			for(int i = 1; i <=5; i++) {
		    			if( i== 4) {
			    		System.out.print(i + " ");
		    		}else {
		    			System.out.print("* ");
		    		}
	    	
		    		}
		    			System.out.println("* ");
		    			//* 2 * * *
		    			
		    			for(int i = 1; i <=5; i++) {
			    			if( i== 5) {
				    		System.out.print(i + " ");
			    		}else {
			    			System.out.print("* ");
		    	
			    		}
			    	}
	    		}    	
               
	    	
}
	    	
	     

	
	    

	
	
		

