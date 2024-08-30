package com.kh.practice.thread;

public class Data {

	private int value;

	private boolean isEmpty = true;

	public Data() {

	}

	public synchronized void setValue(int value) {
		try {
			// setValue메서드 호출후, 반환된 key값을 또 provider가 가져갔을때
			if (isEmpty == false) {
				wait();
			}

			this.value = value;
			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : " + value);
			notify(); // 대기중인 스래드를 실행시킴
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized int getValue() {
		int value = 0;

		if (isEmpty == true) {
			try {
				// getValue() 함수 호출후 다시 한번 getValue()함수 호출시 에러발생
				throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오…");
			} catch (EmptyException e) {
				System.out.println(e.getMessage());
				try {
					wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}

		value = this.value;
		isEmpty = true;
		System.out.println("get value : " + value);
		System.out.println("값을 꺼냈습니다. value가 비었습니다.");
		notify();

		return value;
	}
}
