package com.kh.practice.loop.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){

		//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		while(true) {
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
    	
    	
    	if(num > 1 ) {
    		for(int i = 1; i<=num; i++) {
    			System.out.print(i + " ");
    		}
    		break;
    	}
    		System.out.println("1이상의 숫자를 입력하세요");
    	}
    }
	
	
	public void practice2(){
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
    	
    	if( num < 1 ) {
    	    System.out.println("1이상의 숫자를 입력하세요");
    	    practice2();
    	    return;
    
	}
    	for (int i = num; i> 0 ; i--) {  
			System.out.print(i + " ");
    	}
	}
	
	public void practice3(){
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		System.out.print("정수를 하나 입력하세요 : ");
    	int num = sc.nextInt();
    	
    	int sum = 0;
	    for(int i = 1; i<=num; i++ ) {
	    	sum += i;
	    	
	    	 System.out.print(i);
	    	 if(i < num) {
		    	 System.out.print(" + ");
	    	 }
	}  
	    	System.out.print(" = " + sum);
	    	
    	} 
	
    
    	
	public void practice4(){
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
//		력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 <2) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
			return; //무한반복문 코드 작성시 종료시점 꼭 만들어주기 
			//System.out.println("값을 잘못 입력함.");
		}
		
		int start = num1 < num2 ? num1 : num2 ; // num1이 num2보다 작은 경우 num1을 시작수로
		int end   = num1 > num2 ? num1 : num2 ; // num1이 num2보다 큰 경우 num1이 필수
		
		for(int i = start ; i <= end; i++) {
			System.out.print(i+ " ");
		}
		
	}
	public void practice5(){
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		boolean run = true;
		while(run) {
		    System.out.print("숫자 : ");
		    int dan = sc.nextInt();
		 		
		    if(dan >= 10){
		    	System.out.println("9 이하의 숫자만 입력해주세요");
		    	continue;
		}
		    run = false;
		    for(int i = dan; i <=9; i++) {
		    	System.out.println("=====" + i + "단 =====");
		    	
		    	for(int j = 1; j<=9; j++) {
		    		System.out.printf("%d X %d = %d \n", dan , j , dan * j);
		    	}
		    }
		}
			
		
	}
	public void practice6(){
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다. 
//		* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//		ex) 2, 7, 12, 17, 22 …
//		5 5 5 5 => 여기서 공차는 5
		
		 System.out.print("시작 숫자 : ");
		 int num = sc.nextInt(); // 4 
		 
		 System.out.print("공차 : ");
		 int gong = sc.nextInt(); // 3 
		 
		 for(int i = 1; i<=10; i++) { // 10번 반복
			 System.out.print(num+ " "); // 4 7 
			 num += gong;
			 
		 }
		 	
	}
	public void practice7(){
//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		while(true) {
			
		 System.out.print("연산자(+, -, *, /, %) : "); 
		 String op = sc.nextLine(); // 사용자가 입력한 연산자가 exit일수도 있으므
		 
		 if(op.equals ("exit")) {
			 System.out.println("프로그램을 종료합니다.");
			 break;
		 }
		 
		 System.out.print("정수 1 : ");
		 int num1 = sc.nextInt();
		 
		 System.out.print("정수 2 : ");
		 int num2 = sc.nextInt();
		 sc.nextLine();
		 
		 if((op.equals("/") || op.equals("/")) && num2 == 0) {
			 System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			 continue;
		 }
		 
		 int result = 0;
		 
		 switch(op) {
		 
		 case "+" :
			 result = num1 + num2;
			 break;
		 case "-" :
			 result = num1 - num2;
			 break;
		 case "*" :
			 result = num1 * num2;
			 break;
		 case "/" :
			 result = num1 / num2;
			 break;
		 case "%" :
			 result = num1 % num2;
			 break;
		default:
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			continue;
			 
		 }
		
		System.out.println(num1 + op + num2 + " = " +result);
	}
}
	
	public void practice8(){
//		*\n
//		**\n
//		***\n
//		****\n
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int j = 1; j<=num; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();// \n
			
		}
		
		
	}
	public void practice9(){
		
	
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = num; i > 0; i--) {
		for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();// \n
		}
	}
	
	public void practice10(){
//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		ex) 2, 3, 5, 7, 11 …
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
				
		if(num < 2) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		
		// 소수는 1 ~ n까지 나누었을때 나누어 떨어지는 수가 1과 n뿐인수.
		// n = 6 
		// 1 2 3 4 5 6
		
		boolean isPrime = true;
		for(int i = 2; i < num; i++ ) {
			
		    if( num % i == 0) {
		    	isPrime = false; // 소수가 아님.
		    	//System.out.print("소수가 아닙니다. ");
		    	break;
		    }
		}
	    if(isPrime)
	    	System.out.println("소수입니다."); 
	    else
	    	System.out.println("소수가 아닙니다. ");
	
}
	public void practice11(){
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
	    if(num < 2) {
	    	System.out.println("잘못 입력하셨습니다. ");
	}

	// 1. 소수의 개수를 구할 변수.
	int count = 0;
	
	for(int i = 2;  i< num; i++ ) {
		boolean isPrime = true;
		
		
		// i값이 소수인지 아닌지 검증
		for(int j = 2; j < i; j++) {
			if(i % j == 0) {
				isPrime = true;
				break;
			}
		}
		if(isPrime) {
			 System.out.println(i+" ");
			 count++;
		}
	}
	System.out.printf("\n2부터 %d까지의 소수의 개수는 %d입니다. " , num, count);
	
		
			
	
	}
	public void practice12(){
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		 모두 나머지가 0이 나오는 수
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1;  i<=num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i+ " ");
				
			}
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println("\ncount : "+count);
	}	
	}

		    	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
