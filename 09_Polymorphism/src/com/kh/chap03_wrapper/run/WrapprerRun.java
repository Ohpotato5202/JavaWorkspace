package com.kh.chap03_wrapper.run;

public class WrapprerRun {
	
	public static void main(String[] agrs) {
		/*
		 * Wrapper클래스
		 * => 기본 자료형(8개)을 객체로 포장해주는 클래스들
		 *  기본자료형   <-------> Wrapper클래스
		 *  boolean             Boolean
		 *  char                Charcter
		 *  short               Byte
		 *  int                 Short
		 *  long                Integer
		 *  float               Float
		 *  double              Double
		 * */
		int num1 = 10;
		int num2 = 15;
		
		// System.out.println(num1.eqauls(num2));
		// 기본 자료형에서 객체 자료형의 메소드를 활용하고싶다면, Wrapper클래스로 변환해줘야한다.
		
		// 자동형변환 기본자료형 => Wrapper(Boxing)
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.compareTo(i2)); // 10 15
		// a.compareTo(b) : 두 값을 비교해서 a가 b보다 크면 1, a가 b보다 작으면 -1 반환 같다면 0
		
		// Wrapper클래스 => 기본자료형 (UnBoxing)
		int num3 = i1;
		int num4 = i2;
		
		System.out.println("======================================");
		
		// 기본자료형 <------> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1+str2); // 1015.3
		
		// 1. String --> 기본자료형 : 파싱한다.
		//    바꾸고자 하는 자료형의 Wrapper.parseXXX(변환할문자열);
		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // "15.3" => 15.3
		
		System.out.println(i+d);
		
		// 2. 기본자료형에서 --> String
		//    String.valueOf(변환할 기본자료형값)
		//    "" + 기본자료형값
		String strI = String.valueOf(i);
		String strd = ""+d;
		
	}

}
