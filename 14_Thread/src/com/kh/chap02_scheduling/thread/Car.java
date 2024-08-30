package com.kh.chap02_scheduling.thread;

public class Car implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 20; i++) {

			System.out.println("Car Driving");

			try {
				Thread.sleep(100); // 현재 작동중인 스레드를 MS시간만큼 지연시키는 메소드
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
