package com.kh.chap03_control.thread;

public class SleepThread implements Runnable {

	private char ch;
	private long mills;

	public SleepThread(char ch, long mills) {
		super();
		this.ch = ch;
		this.mills = mills;
	}

	@Override
	public void run() {

		for (int i = 0; i <= 100; i++) {
			System.out.print("" + ch);

			try {
				// sleep 지정된 시간동안 현재 쓰레드를 일시정지(TIMED=WATTING) 상태로 변경.
				// 정지 기간이 지나면 다시 실행 대기상태로 돌아옴
				Thread.sleep(mills);
			} catch (InterruptedException e) {
				break; // interrupt발생시 작업종료
				// return; 작업 종료예약어 아무거나 사용 가능
				// e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName() + "종료");
	}
}
