package com.kh.Variable;

public class A_Variable {
	
	private static final boolean Ture = false;

	//시급과 근무일수를 곱해서 월급을 계산하는 프로그램
		public void printVariable() {
			
			System.out.println("=== 변수 사용 전 ===");
			
			
			System.out.println("시급 : 18500");
			System.out.println("근무시간 : 6");
			System.out.println("근무일수 : 20");
			
			// 월급 = 시급 x 근무시간 x 근무일수
			// 김갑생 : 000000원 형식으로 출력
			
			System.out.println("민경민씨의 월급은 " + (18500 * 6 * 20) + "원 입니다.");
			
			// 변수 사용 후
			System.out.println("=== 변수 사용 후 ===");
			int 시급 = 19900; // 4byte저장공간 확보
			int 근무시간 = 6; // 4byte저장공간 확보
			int 근무일수 = 20; // 4byte저장공간 확보
			
			System.out.println("민경민씨의 월급은 " + (시급 * 근무시간 * 근무일수) + "원 입니다.");
			/* 변수를 사용하는 이유
			 * 1) 변수는 우선적으로 값에 의미를 부여할 목적으로 사용하므로 가돋성이 좋다.
			 * 2) 한번 값을 기록해두고 , 필요할 때 마다 재사용할 수 있으므로 생산성이 좋다.
			 * 3) 유지보수를 쉽게 할 수 있다.
			 * */
		}
		
		
		// 변수의 선언 
		public void declareVariable() {
			/* 
			 * 변수의 선언은? 메모리에 값을 저장하기 위한 저장공간을 확보하는것.
			 * [표현법]
			 * 자료형 변수명;
			 * 
			 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아 낼지에 따라서 변수의 크기 및 모양을 지정한다.
			 * 
			 * 변수명 : 변수의 이름을 직관적으로 정하는 부분.
			 * 
			 * 주의할점 : 변수명 명명규칙
			 * 1. 변수명은 소문자로 시작하게끔 지어줄 것.
			 *  - ex) String user;(o)
			 *        String username(x); 변수의 의미상 사용자 + 이름
			 *        String userName;(o); 이어 붙여지는 단어의 첫글자를 대문자로 표기하는게 관례(낙타등표기법) 
			 * 2. 같은 영역 {} 안에서는 동일한 변수명 사용 금지
			 * 3. 해당 영역에 선언된 변수는 해당 영역에서만 사용할 것.
			 * */
			
			// 1. 논리형 변수 선언 (1byte) => true/false
			boolean isTrue; // 1byte
			
			// 2. 숫자형
			// 2_1. 정수형
			byte bNum; // 1byte(-128 ~ 127
			short sNum; // 2byte(-32768 ~ 32767)
			int iNum; // 4byte(-2147483648 ~ 2147483647)
			//System.out.println(12345);
			long lNum; // 8byte(-92.337.203.684.775.808 ~ 922.337.203.685.477.580)
			
			// 2_2. 실수형
			float fNum; // 4byte; => 소수점 아래 7자리까지 표현가능
			double dNum; // 8byte; => 소숫점 아래 15자리까지 표현가능.
	                             // => Double이 좀더 정확한 값을 저장할 수 있다.
	                            		  
	        // 3. 문자형(기본자료형)
	        char ch; // 2byte 0~65,535(유니코드문자)
	                              
	        // 4. 문자형(참조자료형) => 나중에 자세히 다뤄볼 예정.                    		  
	        String str;             
	        
	        // 9개의 변수 선언.
	        
	        /* 
	         * 변수에 값 대입
	         * [표현법]
	         * 변수형 값
	         * =(대입연산자) ,
	         * */
	        isTrue = Ture;
	        
	        bNum = 1;
	        sNum = 2;
	        iNum = 4;
	        lNum = 8L; // long자료형을 알려주기 위해 소문자, 대문자 L을 표기형
	        		
	        		
	        fNum = 4.0f;// 반드시 f를 붙혀야함
	        dNum = 8.0;
	        		
	        ch = 'A'; // 반드시 '' (작은따음표)안에 넣어줘야함
	        str = "abc"; // 반드시 " " (쌍따음표)안에 넣어줘야함
	        
		}
		
		public void initVariable() {
			/* 
			 * 변수 "선언"과 동시에 값을 "대입" => 초기화
			 * [표현법]
 			 * 자료형 변수형 = 값(리터럴);
			 * */
			boolean isteger = true;
			
			int longInterger = 999_999_999;
			
			int age = 20;
			age = 21;
			
			// final 상수 예약어. 변수에 담긴 값을 바꿀 수 없다.
			final int AGE = 20;
			// AGE = 21;
		}
		
		
		
	}
