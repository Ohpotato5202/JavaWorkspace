package com.kh.chap04_sync.part03_deadlock;

import com.kh.chap04_sync.part02_consumerAndProducer.thred.Buffer;

public class Run {
	/*
	 * 교착상태 ? 각 각의 스레드가 서로 임계영역에 접근할 수 있는 key를 얻지 못하고, key를 얻기 위해 무한 대기에 돌입하는 것.
	 */

	// 공유자원 1
	private static Buffer buffer1 = new Buffer();

	// 공유자원 2
	private static Buffer buffer2 = new Buffer();

	public static void main(String[] args) {

		// 첫번째 스레드 : buffer1을 가지고 작업을 한 후, buffer2를 가지고 이어서 작업.
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (buffer1) {
					System.out.println("th1이 buffer1에 대한 key를 획득");

					System.out.println("thread 1 : th2이 buffer에 대한 key를 반납하기 전까지 대기중.");
					synchronized (buffer2) {
						System.out.println("th1이 buffer2에 대한 key를 획득");

					}
				}
			}
		});
		// 두번째 스레드 : buffer2를 가지고 작업을 한 후, buffer1을 가지고 이어서 작업.
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (buffer1) {
					System.out.println("th2이 buffer2에 대한 key를 획득");
					
					System.out.println("thread 2 : th1이 buffer에 대한 key를 반납하기 전까지 대기중.");
					synchronized (buffer2) {
						System.out.println("th2이 buffer1에 대한 key를 획득");

					}
				}
			}
		});
		// 교착상태 해결방법 ?
		// 1. key 획득 순서 변경하기.
		// -  synchronized블럭의 순서를 동일하게 맞춰주기
		// 2. threadControl : notify, wait등을 통해 동기화 블럭안에서 스레드의 흐름을 제어하기.

		th1.start();
		th2.start();

	}

}
