package com.kh.Practice2.func;

import java.util.Scanner;

public class VariablePractice2 {
	
   public void inputTest2() {
	   
	   try (Scanner sc = new Scanner(System.in)) {
		    System.out.print("첫번째 정수 : ");
			int q  = sc.nextInt();
			
			System.out.print("두번째 정수 : ");
			int w = sc.nextInt();

			sc.nextLine();
			
			System.out.print("더하기 결과 : " + (q + w));
			sc.nextLine();
			System.out.print("빼기 결과 : " + (q - w));
			sc.nextLine();
			System.out.print("곱하기 결과 : " + (q * w));
			sc.nextLine();
			System.out.print("나누기 결과 : " + (q / w));
			
			/* (Scanner sc = new Scanner(System.in)) {
		    System.out.print("첫번째 정수 : ");
			int num1  = sc.nextInt();
			
			System.out.print("두번째 정수 : ");
			int num2 = sc.nextInt();

            int sum = num1+num2;
            
			System.out.print("더하기 결과 : " + (sum));
			
			System.out.print("빼기 결과 : " + (num1 - num2));
			
			System.out.print("곱하기 결과 : " + (num1* num2));
			sc.nextLine();
			System.out.print("나누기 결과 : " + (num1 / num2));
			**/
	   }
	   
   }
}
  
