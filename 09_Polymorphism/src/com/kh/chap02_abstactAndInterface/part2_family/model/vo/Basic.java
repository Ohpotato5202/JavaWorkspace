package com.kh.chap02_abstactAndInterface.part2_family.model.vo;

public interface Basic {
	/*
	 *  인터페이스
	 *  [표현법]
	 *  public interface 인터페이스명 {}
	 *  
	 *  -상수 필드와 추상메소드로만 이루어진 추상클래스의 변형체
	 *  	+정적메소드 추가 가능.
	 *  -인터페이스에서 필드는 "무조건" 상수필드이다.(public static final)
	 *  -인터페이스에서 메소드는 무조건 추상메소드이다.
	 *  -무조건 구현해야하는 메소드가 있는 경우 인터페이스를 만들어서 상속하게 된다.
	 *  -인터페이스는 다중 상속을 허용한다.(상속관계에 얽메여 있지 않다)
	 * 	(실제 메소드에 대한 정의는 자식클래스에 한번만 하기 때문에, 다중상속이 가능.)
	 * -추상클래스와 다르게 좀더 강한 규칙성, 강제성을 가지는게 인터페이스이다.
	 * 
	 * 
	 * 추상클래스와 인터페이스
	 * 1. 공통점
	 * 		-객체 생성은 안됨.(단, 참조변수로써 사용이 가능하다.)
	 * 		-상속(구현)하는 클래스에 추상메소드를 구현하도록 강제한다.
	 * 		
	 * 2. 차이점
	 * 		-추상클래스는 클래스 내에 인스턴스변수, 메소드를 생성할 수 있고,
	 * 		 추상메소드가 포함되었거나 abstract키워드로 클래스가 정의 되어있고,
	 * 		 인터페이스는 인스턴스변수 일반메소드 생성이 불가능하고, 모든변수는 상수필드이며
	 * 		 메소드는 추상메소드 위주로 정의되어 있다.
	 * 
	 * 		-존재하는 목적이 다름.
	 * 
	 * 		 추상클래스는 추상클래스를 상속받아서 기능을 이용하고, 클래스를 "확장"하는데 목적이 있음.
	 * 		 (자바는 다중상속을 지원하지 않기 때문에 추상클래스로만 구현해야할 메서드를 강제하는데 한계가 있음.
	 * 		  따라서 추상클래스이 주 목적은 "상속"위주로 사용된다)
	 * 
	 * 		 인터페이스는 클래스의 기능 구현을 "강제"하기 위해서 사용.
	 * 		 구현을 강제함으로써 인터페이스를 구현한 "구현객체"에 "일관된 동작"을 보장함
	 * 
	 * 		extends와 implements
	 * 			-클래스간에 상속관계 일때 : 클래스명 extends 부모클래스명
	 * 			-클래스와 인터페이스의 구현관계 일때 : 클래스명 implements 인터페이스명, 인터페이스명....
	 * 			-인터페이스간에 상속관계 일때 : 인터페이스명 extends 인터페이스명, 인터페이스명
	 * 
	 */
	
	

	/*public final static*/ int NUM =10;
	//인터페이스에서는 "상수" 필드만 정의 할 수 있기 때문에 값 수정이 불가능.
	//final가 항상 붙기 때문에 생략 가능.
	//객체 생성이 불가능하기 때문에 필드에 접근하기 위해 static 항상 붙음(따라서 static 생략가능)
	//NUM =11;
	
	
	//인터페이스에서는 추상메소드만 정의 할 수 있기 때문에 public abstract가 생략 가능.
	/*public abstract*/ void eat();
	
	/*public abstract*/ void sleep();
	
	
	//정적 메소드, 디폴트 메소드 추가 가능. java +8이상
	//정적 메소드 : static메소드 => 객체 생성 없이 호출이 가능한 메서드.
	//인터페이스에서 정적메소드 사용하는 경우 :구현코드에 공통적으로 들어갈 메소드인 경우 사용.
	//재정의 불가.
		static void humanism() {
		//몸통부 기술가능
		System.out.println("인류애 장착");
		privateMethod();
	}
		
		//디폴트 메소드 : 인터페이스를 구현하는 하위클래스에서 동일한 기능을 사용해야 하는 경우
		//사용함. 단, 필요시 오버라이딩을 통해 재정의 가능함.
		default void breathing() {
			System.out.println("숨쉬기 기능 장착");
			privateMethod();
		}
		
		//private static 메서드
		//같은 인터페이스 내부에서 메서드 구현시 공통된 기능을 추가하기 위해 사용한다.
		private static void privateMethod() {
			System.out.println("현재 인터페이스에서만 호출 가능한 내부 정적 메소드");
		}
	
}
