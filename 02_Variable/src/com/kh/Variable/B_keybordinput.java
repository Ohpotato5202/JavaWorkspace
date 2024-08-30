package com.kh.Variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 변수에 기록
public class B_keybordinput {
    
	public void inputTest1() {
		
		Scanner sc = new Scanner(System.in);
		// 사용자의 인적사항 입력받기.
		// 이름, 나이, 키
		
		System.out.println("당신의 이름은 무엇입니까 ? ");
		String name = sc.nextLine();
		//String a, b, c = sc.next();
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드
		// 1) nextLine() :사용자가 입력한 값 중 개행(\n)이 있을경우 공백에 무관하게 개행 이전까지 출력해준다.
		// 2) next() : 사용자가 입력한 값 중 공백이 있을경우 공백 이전까지 출력.
		
		System.out.println("당신의 나이는 몇 살 입니까?");
		int age = sc.nextInt(); // 사용자가 입력한 값을 int자료형으로 변환
		
		System.out.println("당신의 키는 몇 cm입니까 ?");
		double height = sc.nextDouble();
		
		sc.nextLine(); // 입력버퍼에 남아있는 개행문자를 날림
		
		System.out.println("당신이 사는 곳은 ?");
		String address = sc.nextLine();
		
		//System.out.println(address.charAt(1));
		// 문자열.charAt(인덱스) : 문자열의 인덱스 위치에 있는 문자를 추출
		// 김민욱.charAt(2) -> 0 : 김 , 1 : 민 , 2 : 욱
		
		System.out.println("address에 사는 키 :"+height+" "+"cm"
		        + age + "세" + name +" 님 안녕하세요" );
		System.out.println("님이 입력한값 :" +name);
	}
	 
	 public void inputTest2() {
		   
		 Scanner sc = new Scanner(System.in);
		 /*
		  * 문자열을 뽑을때 : sc.nextLine() , sc.next()
		  * 정수값을 뽑을때 : sc.nextInt() ,  sc.nextINT()
		  *               sc.nextShort() , sc.nextByte()
		  * 실수값을 뽑을때 : sc.nextFloat() , sc.nextDouble()
		  * 논리형값을 뽑을때 : sc.nextBoolean()
		  * 
		  * 문자값을 뽑을때 : sc.nextChar() . 존재하지 않음
		  * 
		  * 문자값을 뽑으려면 먼저 sc.nextLine()으로 문자열로 값을 입력 받은 후 그 문자열에서 0번째 문자를 추출
		  * 
		  * */
		 
		 System.out.println("성별입력 (M/F) : ");
		 char gender = sc.nextLine().charAt(0);
		 // M , F , MALE , FEMALE
		 
		 System.out.println("사용자가 입력한 성별정보 : "+ gender);
		 
	 }
	
	
}
