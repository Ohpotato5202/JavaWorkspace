package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {

	public static void main(String[]args) {
		
		FieldTest1 ft1 = new FieldTest1();
		ft1.test(123);
		
		FieldTest2 ft2 = new FieldTest2();
		System.out.println(ft2.pub); 
		//System.out.println(ft2.pro); // 같은 패키지에서만, 다른 패키지라면 상속을 통해 접근
		//System.out.println(ft2.df);  // 같은 패키지에서만 접근가
		//System.out.println(ft2.pri); // ft2 클래서에서만 접근가능.
		
		//FieldTest3 f3 = new FieldTest3();
		//System.out.println(ft3.sta);
		//System.out.println(fieldTest.pub);
		  System.out.println(FieldTest3.sta); // static한 접근방식.
		                                      // 클래스명.static변수명
		FieldTest3.sta = "FieldTest3.sta";
		//FieldTest3.s NUM = 1; final키워드가 붙은경우 수정 불가.
		System.out.println(FieldTest3.sta);
		
		
		// static 호출방식
		FieldTest3.test(); // Math.random
		
}
}
