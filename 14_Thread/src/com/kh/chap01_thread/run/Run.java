package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Runnable1;
import com.kh.chap01_thread.thread.Thread1;

public class Run {
	/*
	 * 프로그램 
	 * - 어떤 프로세스(작업)를 실행할 수 있는 파일(CPU를 할당 받지 않음)(코드덩어리이다.)
	 * 
	 * 프로세스 
	 * - 현재 동작하고 있는 프로그램(작업을 위함 CPU를 할당받음)
	 * 
	 * 스레드 
	 * - 한 개의 프로세스 내에서 실제로 작업을 수행하는 소단위 
	 * - 모든 프로레스에는 한 개 이상의 스레드가 존재하여 작업을 수행함. 
	 * - 스레드는 메인스레드와 n개의 일반스레드가 존재함.(여태 까지는 메인스레드 1개로만 작업함)
	 * 
	 * 싱글스레드 
	 * - 메인스레드 1개 가지고 작업읊 처리함. 한 작업씩 순차적으로 처리
	 * 
	 * 
	 * 멀티스레드
	 * - 메인스레드 외 추가적인 추가적인 스레드를 이용하여 동시에 여러작업을 처리
	 * 
	 * 멀티스레드 장점
	 * 1) 자원을 보다 효율적으로 사용 가능
	 * 2) 사용자 입장에서 일 처리가 빠르게 보인다.(== 응답성 향상)
	 * 3) 작업이 분리되어 코드가 간결해진다.
	 *    스레드별로 다른 작업을 구현시켜 코드를 분리할 수 있음.
	 * 4) CPU를 효율적으로 사용 가능.
	 *    싱글스레드 환경에서는 작업 완료시까지 CPU가 대기해야하는데, 멀티스레드 환경에서는 여러작업이 동시에
	 *    수행되므로 CPU대기시간이 줄어듬.
	 *    
	 * 멀티스레드 단점
	 * 1) 스레드간에 공유자원이 존재할 경우 "동기화"를 신경써줘야함
	 * 2) 동기화 처리시 "교착상태"가 발생하지 않게끔 주의 해줘야함
	 * 3) 프로그램이 복잡해짐
	 *    
	 */

	public static void main(String[] args) {
		// 싱글스레드
		// 항상 앞 라인의 명령문이 다 끝나고나서 다음코드가 실행.
		for (int i = 1; i <= 100; i++) {
			System.out.println("작업 1 [" + i + "]");
		}

		for (int i = 1; i <= 100; i++) {
			System.out.println("작업 2 [" + i + "]");
		}

		// 현재 작업으로 멀티스레드 환경을 만들려면 필요한 스레드 개수 ? 메인스레드 + 1

		// 스레드 생성 방법
		// 1) Thread클래스 상속
		Thread1 th1 = new Thread1();

		// 스레드의 이름을 지정
		th1.setName("스레드 1");

		// 스레드시작
		// th1.run(); // 메인스레드의 Stack에 run()메서드 추가된것. 즉 스레드는 아직 메인스레드 1개
		th1.start(); // 스레드 추가. 현제 스레드 2개 존재함. Stack에 저장공간 할당받고, run메서드 호출.

		// 2) Runnable 인터페이스 구현.
		Thread th2 = new Thread(new Runnable1());
		th2.setName("스레드 2");
		th2.start(); // 스레드 3개 생성

		for (int i = 1; i <= 100; i++) {
			System.out.println("메인스레드 1 [" + i + "]");
		}

		// 3) Runnable 인터페이스 구현 (내부클래스를 통한 구현)
		// 클래스는 메서드 내부든, 클래스 내부든 어디서든 생성 가능함. 이때 메서드 내부에 존재하는 클래스는
		// (지역)내부클래스라고 부름.
		class Runnable2 implements Runnable {
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++)
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}
		}
		Thread th3 = new Thread(new Runnable2());
		th3.setName("스레드 3");
		th3.start();
		
		// 스레드 생성 방법 4 : 익명 내부클래스를 통한 생성.
		/*
		 * 익명클래스 ? 내부클래스를 작성할 때 클래스 정의 없이 곧바로 객체를 생성하는 방식. 즉, 지역 내부클래스의 코드를 간결하게 표현한 것이
		 * 익명 내부 클래스
		 * 
		 * [표현법] new 상위클래스 생성자(){ 상위 클래스 메소드 오버라이딩 }
		 */
		// class 클래스명 implements Runnable + new 클래스명() => new Runnable() {코드구현}
		Thread th4 = new Thread(new Runnable() {
			// 익명클래스 내부.
			int a; // 익명클래스의 필드.
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}
				throw new RuntimeException();
			}
		});
		th4.setName("스레드 4");
		th4.start();

		Thread th5 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}
		});
		th5.setName("스레드 5");
		th5.start();
		
		/*
		 * 알아볼 수 있는 스레드의 특징들
		 * 1. 스레드는 여러개 동시에 실행 가능하다. ==> 스레드는 동시성의 특징을 가지고 있음. ==> 더 빠른 반응성을 가져다 준다.
		 * 2. 메인 스레드가 종료되더라도 실행중인 스레드가 존재하는경우 프로세스는 종료되지 않는다. (독립성)
		 * 3. 매번 결과가 다르게 보인다. => 각 스레드의 실행시점을 결정해주는 스케줄러가 따로 존재하기 때문.
		 * 4. 하나의 스레드에서 예외가 발생하더라도 다른 스레드에 영향을 끼치지 않는다. (독립성)
		 *    => 개별적인 실행 흐름을 보자아하기 위해서 스레드별로 stack저장공간을 할당 받음.
		 * */
		System.out.println("메인스레드 종료 지점.");

	}
}
