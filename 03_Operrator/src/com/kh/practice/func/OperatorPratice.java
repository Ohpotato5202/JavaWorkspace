package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPratice {
	Scanner sc = new Scanner(System.in);

	public void pratice1() {
		//모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
		
		System.out.print("인원 수 : ");
		int personCount = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candys = sc.nextInt();
		// 100 / 10 
		System.out.println("1인당 사탕 개수 : " + candys / personCount);
		System.out.println("남는 사탕 개수 : " + candys % personCount);
		
		
		
	}
	public void pratice2() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classes = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리 까지) : ");
		double score = sc.nextDouble();
		
	
		System.out.print(grade + "학년 " + classes +"반 " + number + "번" + name + "" + gender + "학생의 "+ "성적은 " + score +"이다." );
		//System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.)"
		//		+ ,grade,classes,number,name,gender,score
		
		
		
	}
	public void pratice3() {
		
        System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이"	:
			age <= 19 ? "청소년" : "성인";
		System.out.print(result);
	}
	
	public void pratice4() {
		
		System.out.print("국어 : ");
		int kor  = sc .nextInt();
	
		
		System.out.print("영어 : ");
		int eng = sc .nextInt();
	
		
		System.out.print("수학 : ");
		int math = sc .nextInt();
	

		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		String pass = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)? "합격" : "불합격";
		         
		System.out.print("합계 : " + sum);
		System.out.print("평균 : " + avg);
		System.out.println(pass);	
	}
	
	private void pratice5() {
		
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		// 123456-1235467
		String res = sc.nextLine();
		char gender = res.charAt(7); // 1,2,3,4
		
		String result = (gender == '1' || gender == '3')? "남자": "여자";
		System.out.println(result);
		
	}
	private void pratice6() {
		 
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력 : ");
		int num3= sc.nextInt();
		
		boolean result = num3 <= num1 || num3 > num2;
		System.out.print(result);
		
	}
	private void pratice7() {
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int num3= sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		System.out.print(result);
		
		
		

	}
	private void pratice8() {
		
		System.out.print("A사원의 연봉 : ");
		int salaryA = sc.nextInt();
		double salaryPlusInA = salaryA * 1.4;
		
		System.out.print("b사원의 연봉 : ");
		int salaryB = sc.nextInt();
		double salaryPlusInB = salaryB * 1.0;
		
		System.out.print("c사원의 연봉 : ");
		int salaryC = sc.nextInt();
		double salaryPlusInC = salaryC * 1.15;
		
		System.out.printf("A사원 연봉/연봉+a : %d/%.1f\n", salaryA, salaryPlusInA);
		System.out.println("3000 " + (salaryPlusInA >= 3000 ? "이상" : "미만"));
				
		System.out.printf("B사원 연봉/연봉+a : %d/%.1f\n", salaryB, salaryPlusInB);
		System.out.println("3000 " + (salaryPlusInA >= 3000 ? "이상" : "미만"));
				
		System.out.printf("C사원 연봉/연봉+a : %d/%.1f\n", salaryC, salaryPlusInC);
		System.out.println("3000 " + (salaryPlusInA >= 3000 ? "이상" : "미만"));
				
	}
}
