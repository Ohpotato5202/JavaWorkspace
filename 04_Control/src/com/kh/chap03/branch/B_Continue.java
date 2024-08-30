package com.kh.chap03.branch;

/*
 * continue; : 반복문안에서 사용하는 구문
 *             continue를 만나게 되면 그 뒤쪽에 어떤코드가 있던 실행하지 않고
 *             가장 가까운 반복문으로 돌아간다.
 *
 * */

public class B_Continue {

	public void method1() {
		// 1 3 5 7 9 (홀수만 출력)
		// 방법 1) 증감식을 2씩 증가하게 설정
		// 방법 2) 반복문을 1~10까지 순차적으로 돌리고 홀수인 경우만 출력하도록 설정
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 0) continue; // 짝수일경우 뒷쪽의 내용은 무시하고 다음 증감식으로 넘어가라
			System.out.print(i+" "); // 1 2 3 4 5 6 7...
		}
	}

	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 더해보기.
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			
			if(i % 6 == 0) continue;
			sum+=1;
		System.out.println("총 합계 ? "+sum);
		}
	}

	public void method3() {
		/*
		 * 2단 ~ 9단 출력하긴 하되'
		 * 
		 * 4의 배수단은 빼고 출력하시오.*
		 * 
		 * --- 2단 --- 2 x 1 = 2  2 x 2 = 4 ...
		 * 
		 * --- 9단 --- 9 x 1 = 9 ... 9 x 9 = 81
		 */
		
		for (int i = 2; i <= 9; i++) {
			
			if(i % 4 == 0) continue; // 4의 배수단은 건너뛰기.
			
			System.out.printf("--- %d단 --- \n", i );
			for (int j = 1; j <= 9; j++) { // 1 ~ 9, , 9번 반복
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}
		System.out.println("----------------------------------------");

	}
}
