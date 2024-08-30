package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
   public void inputTest1() {
		
		try (Scanner va = new Scanner(System.in)) {
			System.out.print("이릅을 입력하세요 ");
			String 이름 = va.next();
			
			System.out.print("성별을 입력하세요(남/여) ");
			String 성별 = va.next();
			//char 성별 .nextLine Char(0);
			
			System.out.print("나이를 입력하세요 ");
			int 나이 = va.nextInt();
			
			System.out.print("키를 입력하세요(cm) ");
			double 키 = va.nextDouble();

			
			va.nextLine();
			
			System.out.println("키 "+ 키 +"cm인 " + 나이 + "살 " + 성별 + "자 "+ 이름 +"님 반갑습니다^^" );
		}
	}
	
	
}

