package com.kh.practice.loop.chap01;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력");
			break;
		case 2:
			System.out.println("수정");
			break;
		case 3:
			System.out.println("조회");
			System.out.println("조회된 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제");
			break;
		case 7:
			System.out.println("종료");
			System.out.println("프로그램이 종료됩니다.");
			break;
		}

	}

	public void practice2() {
		// 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		// 짝수가 아니면 “홀수다“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		System.out.print("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else  {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}

	}

	Scanner sc1 = new Scanner(System.in);

	public void practice3() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int eng = sc.nextInt();

		System.out.print("영어점수 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.printf("국어 : %d \n수학 : %d \n영어 : %d\n합계 : %d\n평균 : %1f\n 축하합니다, 합격입니다!", kor, eng, math, sum,
					avg);

		} else {
			System.out.printf("불합격입니다.");
		/* else 안쓰고 코드 짜면 if 바로 아래에 리턴 넣기
		 * System.out.println("불합격입니다.");
		 * return;
		 * */
		}

	}

	public void practice4() {

		System.out.print("1~12 사이의 정수 입력  : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: case 2: case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(month+ "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
		    System.out.println(month+ "월은 여름입니다");
			break;
		case 9: case 10: case 11:
		    System.out.println(month+ "월은 가을입니다.");
			break;

		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}

	public void practice5() {
		String id = "ohpotato";
		String pwd = "ohpotato1";
		
		System.out.print("아이디  : ");
		String inputid = sc.nextLine();
		
		System.out.print("비밀번호  : ");
		String inputpwd = sc.nextLine();
		
		if(id.equals(inputid)) {
		if(pwd.equals(inputpwd)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("비밀번호가 틀렸습니다. ");
		}
		}else {
			System.out.println("아이디가 틀렸습니다. ");
			
		
		}
	}
		
	

	public void practice6() {

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String role = sc.nextLine();
		
		switch(role) { 
		case "관리자" : 
			System.out.print("회원관리, 게시글 관리 , ");
		case "회원" :
			System.out.print("게시글 작성, 댓글작성 , ");
		case "비회원" :
			System.out.print("게시글 조회");
			
		}
		
	}

	public void practice7() {

		System.out.print("키(m)를 입력해 주세요 : ");
		double heighht = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (heighht * heighht);
		String result = "";
		
		if(bmi < 18.5) {
			result = "저체중";
			
		}
		else if (bmi < 23) {
			result = "정상체중";
		} 
		else if (bmi < 25) {
			result = "과체중";
		}
		else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";	
	}
		System.out.print("BMI 지수 : + bmi");
		System.out.print(result);
	}

	public void practice8() {
   
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		
		if (num1 > 0 && num2 > 0) {
			double result = 0;
			
			switch(op) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / (double) num2;
				break;
			case '%' :
				result = num1 % (double) num2;
				break;
			default  :
				System.out.println("잘못입력했습니다. 프로그램을 종료합니다.");
				return;
			}
			System.out.printf("%d %c %d = %f" , num1, op, num2, result);
		}
	}

	public void practice9() {

		System.out.print("중간 고사 점수 : ");
		double semiScore = sc.nextDouble();

		System.out.print("기말 고사 점수 : ");
		double finalScore = sc.nextDouble();

		System.out.print("과제 점수 : ");
		double homeworkScore = sc.nextDouble();
		
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();
		
		boolean result = false;

		System.out.println("============ 결과 =============");
		if(!(attend > 14)) {
			System.out.println("fail [출석 회수 부족 ("+attend+"/20)]");
			return;
		}
		double sum	= semiScore + finalScore + homeworkScore + attend;
			
		if(sum >= 70) {
			result = true;
		}
		System.out.println("중간고사 점수 (20) : " +semiScore);
		System.out.println("기말고사 점수 (30) : " +finalScore);
		System.out.println("과제 점수 (30) : " +homeworkScore);
		System.out.println("출석 회수 (20) : " + (double)attend);
		System.out.println("총점 : " +sum);
		
		System.out.println(result ? "PASS" : "FAIL");
	
	}

	public void practice10() {

		System.out.print("실행할 기능을 선택하세요.");
		

		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
//	    case n : practice(); break;
		default  :
			System.out.println("없는 메뉴입니다. 다시선택하세요 ");
			practice10();
	}
	}
	public void practice11() {

		System.out.print("비밀번호 입력(1000~9999) : ");
		int pwd = sc.nextInt();
		
		if(pwd > 1000 && pwd < 9999) {
			//String str = pwd + "";
			//char 천 = str.charAt(0);
			//char 백 = str.charAt(1);
			
			int 천의자리 = pwd / 1000;
			int 백의자리 = pwd / 100 %  10;
			int 십의자리 = pwd / 10 % 10;
			int 일의자리 = pwd % 10;
			
		    boolean result=	(천의자리 == 백의자리 || 천의자리 == 십의자리 ||
					         천의자리 == 일의자리 || 백의자리 == 십의자리 ||
					         백의자리 == 일의자리 || 십의자리 == 일의자리);
		if(result) { // 중복값이 하나이상 존재함
			System.out.print("생성 실패");
		}else { //중복값이 하나도 없음
			System.out.print("생성 성공");
		}
		}else {
			System.out.print("자리수 안 맞음");
		}
		
	}
}