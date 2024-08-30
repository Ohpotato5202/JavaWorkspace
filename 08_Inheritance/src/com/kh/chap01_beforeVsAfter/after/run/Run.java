package com.kh.chap01_beforeVsAfter.after.run;

import com.kh.chap01_beforeVsAfter.after.model.vo.*;

public class Run {
public static void main(String[] args) {
		Desktop d = new Desktop("삼성","d-01","삼송데스크탑",2000000,true);
		SmartPhone s = new SmartPhone("애플","s-01","아이폰",1300000,"LGU+");
		Tv t = new Tv("엘지","t-01","울트라씬티비",3500000, 30);
		
		System.out.println(d);
		System.out.println(s);
		System.out.println(t);
		
		
		/*
		 * 상속의 장점
		 * - 보다 적은양의 코드로 새로운 클래스들을 작성 가능
		 * - 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할 댸
		 *   용이하다 => 프로그램 생산성과 유지보수에 크게 기여가된다.
		 * - 정의해둔 부모클래스를 통해 좀더 쉽게 클래스의 "확장"이 가능하다
		 *   ex) 데탑, 폰, tv외에도 냉장고나, 에어프라이어 객체를 쉽게 만들 수 있음.
		 * 
		 * 상속의 특징
		 * - 클래스간의 상속은 다중 상속이 불가능하다.
		 * - 명시되어있지 않지만 모든 클래스는 Object 클래스의 후손이다.
		 *  => 모든 클래스느 Object클래스에 있는 메소드를 쓸 수 있음.
		 *  => Object내부에 있는 메소드가 마음에 안들면 "오버라이딩"을 통해
		 *     재 정의가 가능하다.
		 * */
		

}
}
