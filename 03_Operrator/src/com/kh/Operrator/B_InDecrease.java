package com.kh.Operrator;

public class B_InDecrease {
	
	/*
	 * 증감연산자 (당항연산자) ++ --
	 * ++ : 변수에 담긴 값을 1증가시는 연산자
	 *      ++변수값(전위연산자) , 변수값++(후위연산자)
	 * -- : 변수에 담긴 값을 1 감소시키는 연산자
	 *      --변수, 변수--
	 *      
	 * 전위연산자 : 선증감 후처리
	 * 후위연산자 : 선처리 후증감
	 * 
	 * 증감 : 값을 1 증가 혹은 감소시키는 작업
	 * 
	 * */
	
	public void method1() {
	    //전위연산
		int num = 10;
			System.out.println("전위연산 전 num : "+num); // 10
		    ++num;
		    System.out.println("1회 수행후 결과 : "+num); // 11
		    System.out.println("2회 수행후 결과 : "+ ++num); // 12
		    System.out.println("3회 수행후 결과 : "+ ++num); // 13
		    
		    System.out.println("최종 결과값 num : "+num); // 13
		    
		    System.out.println(" =============== ");
		   
		    int num2 = 10;
		    System.out.println("후위연산 전 num2 : "+num2);
		    num2++;
		    System.out.println("1회 수행후 결과 : "+ num2); // 11
		    System.out.println("2회 수행후 결과 : "+ num2++); // 11
		    System.out.println("3회 수행후 결과 : "+ num2++); // 12
		    
		    System.out.println("최종 결과값 num2 : "+ num2);
	}
		    
	 public void method2() {	    
		    
		 
		 int a = 10;
		 int b = ++a;
		 // a = 11 , b= 11
		 System.out.printf("a : %d , b : %d \n", a, b);
		 
		 int c = 10;
		 int d = ++a;
		 // a = 11 , b= 11
		 System.out.printf("c : %d , d : %d \n", c, d);
		 
		 int num1 = 20;
		 int result1 = num1++ *3; // num1 = 21 , result1 = 60
	     System.out.println("num1 = "+num1 + " result1 = "+result1);
		    
	     int e = 10;
	     int f = 20;
	     int g = 30;
	     
	     System.out.println(e++); // e = 10(11)
	     System.out.println((++e) + (f++)); // 출력 : 32 e = 12 , f = 20(21)
	     
	     // 출력 : 61 e = 12(13) , f = 20 , g = 29
	     System.out.println( (e++) + (--f)+ (--g));
	     
	     
	    
	    
		    
	}	

}
