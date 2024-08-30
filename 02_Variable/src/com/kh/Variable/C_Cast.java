package com.kh.Variable;

public class C_Cast {
    /*
     * 형변환 : 값의 자료형을 바꾸는 개념
     *
     * 컴퓨터상에서의 값처리 규칙
     * 
     * 1.대입연산자(=)를 기준으로 왼쪽과 오른쪽은 값은 자료형이여야함.
     *   => 즉, 같은 자료형에 해당하는 값만 대입이 가능하다
     *   => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수
     * 2. 연산은 같은 자료형끼리만 가능하다.*(+ , - , * , , ,)
     *   => 즉, 다른 자료형끼리 연산을 수행하고 싶으면 형변환이 필수
     *   
     * 형변환의 종류
     * 
     * 1. 자동형변환 => 자동으로 형변환이 진행되기 때문에 내가 집적 형변환을 할 필요가 없다.
     *    대표적인 자동형변환 케이스 : 작은 바이트 자료형 -> 큰바이트의 자료형
     * 2. 강제형변환 => 자동형변환이 되지 않아 내가 직접 강제로 형변환 해야하는 경우
     *               강제형변환 케이스 : 큰 바이트의 자료형 -> 작은 바이트의 자료형
     * [표현법]
     * 
     * (바꿀 자료형) 값;
     * (바꿀 자료형) == 형변환연산자
     *   
     * */
	
	// 자동형변환
	public void autoCasting() {
		
		//int(4byte) ->	double(8byte)
		int i1 = 10;
		double d1 = /*(double)*/ i1; //자동형변환
		// double이 표현할 수 있는 값의 범위가 훨씬 넓으므로, 자동으로 형변환된다.
		// 10 -> 10.0
		
		System.out.println("d1 : "+d1);
		
		int i2 = 12;
		double s2 = 3.3;
		
		double result2 = /* (double) */ i2 + s2;
		// 12 + 3.3 =? 12.0 + 3.3 => 15.3
		System.out.println("result2 : "  + "result2");
		
		 //int(4) -> long(8)
	    //int i3 + 1000;
	 	//long l1 =  /* (long) */ i3;
		
		long l2 = 2000L; // L을 붙이지 않아도 자동형변환이 이루어짐.
				
				
	    // Long(8byte) -> float(4byte)
		// 실수는 long자료형보다 담을 수 있는 값의 범위가 더 크기 때문에
		// 자동형변환이 이루어짐
	    long l5 = 10000000000L;
		float f5 = /* (float) */ l5;
			
	    System.out.println("f5 : " + f5);
	    
	    // char(2byte) <-> int(4byte) 양방향 형변환가능
	    char ch = 65;
	    System.out.println("ch : "+ch);
	    
	    int num = 'A';
	    System.out.println("nem : " +num);
		
	    // char의 범위 0~65xxx : 각 문자마다 고유한 정수값이 매핑되어 있기 때문에 쌍방향 변환이 가능하며
	    // 매핑된 값을 확인하고 싶다면
	    // 아스키코드표 (0~127) 혹은 유니코드표(0~65xxx)를 참고하면 된다.
	    
	    // byte와 byte간의 연산
	    byte b1 = 1;
	    byte b2 = 2;
	   
	    // byte나 short로 연산시 결과값을 int로 취급
	    // 대부분 int나 long사용
	    byte b3 = (byte) (b1 + b2); //강제형변환 해줘야함
	    
	}

	
	// 강제형변환 : 큰 크기의 자료형을 작은크기로 변환시켜야 하는 경우
	public void forceCasting() {
		
		// 1. double(8) -> float(4)
		float f1 = 4.0f;
		
		double d2 = 8.0000000000111;
		float f2 = (float) d2; // 소수점아래 8번째부터 데이터 손실 이루어짐
		
		System.out.println("f2 : "+f2);
		
		// 2. double(8) -> int(4)
		double d3 = 10.89;
		int i3 = (int) d3; // 10.89 -> 10
		System.out.println("i3 : "+i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		int iSum = (int) (iNum + dNum); // 15
		
		// 10 + 5.89 => 10 + 5 => 15
		int iSum2 = iNum + (int)dNum;
		
		int inum2 = 290;
		byte bNum2 = (byte) inum2;
		
		System.out.println("bNum : "+bNum2);
		
	}
	
	
}
