package com.kh.chap01_thread.run;

public class AlphabetThread {
	
	public static void main(String[] args) {
		class UpperAlphabetThread implements Runnable {

			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println("[" + threadName + "시작]");
				for (int i = 'A'; i <= 'Z'; i++) {
					System.out.println("[" + threadName + ":" + (char) i + "]");
				}
				System.out.println("[" + threadName + "종료]");
			}
		}

		class LowerAlphabetThread extends Thread {

			@Override
			public void run() {
				String threadName = getName();
				System.out.println("[" + threadName + "시작]");
				for (int i = 'a'; i <= 'z'; i++) {
					System.out.println("[" + threadName + ":" + (char) i + "]");
				}
				System.out.println("[" + threadName + "종료]");
			}
		}
		
		Thread th1 = new Thread(new UpperAlphabetThread() ,"대문자 쓰레드");
		
		Thread th2 = new LowerAlphabetThread();
		th2.setName("소문자 쓰레드");
		
		th1.start();
		th2.start();
        
        
        
        
	}
}

	
		
		
		
	
      
