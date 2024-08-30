package com.kh.chap03_control.thread;

public class MultipleThread implements Runnable{
	
	private int num;

	
	
	public MultipleThread(int num) {
		super();
		this.num = num;
	}
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		
		for(int i = 1; num*i <= 100; i++) {
			System.out.println("["+threadName+" - "+(num * i) + "]");
	
			try {
				Thread.sleep(200);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("["+threadName+" - "+("종료") + "]");
	}
}
