package com.kh.chap04_sync.part02_consumerAndProducer.thred;

public class Consumer extends Thread{
	
	private Buffer buffer;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			// 빵사는 메소드.
			buffer.getData();
			
			
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
		}
	}
	
	
	

}
