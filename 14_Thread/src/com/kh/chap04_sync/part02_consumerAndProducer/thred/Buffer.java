package com.kh.chap04_sync.part02_consumerAndProducer.thred;

// 생산자 / 소비자
public class Buffer {

	// 생상 및 소비되는 상품
	private int 빵;
	
    // 플래그변수(객체의 상태르 저장하고 흐름을 제어하기 위한 변수)
	private boolean isEmpty = true;

	public void setData(int data) {
		synchronized (this) {
			// 데이터가 비어있지 않다면 더 생산하지 않아도 되므로 대기.
			if(isEmpty == false) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			this.빵 = data;
			isEmpty = false;
			System.out.println("생산자가 " + data + "번째 빵 생산을 완료 했습니다.");

			notify(); // 동기화된 블럭안에서 대기중인 다른 스레드를 깨우는 역할을 함.
		}
	}

	public void getData() {
		synchronized (this) {
			
			// 아직 빵 생산이 완료되지 않았다면, 소비자는 대기상태로 전환.
			if(isEmpty == true) {
				
				try {
					wait(); // wait() : 동기화된 블록 안에서 사용하며, 지정된 시간이 지나거나 다른 스레드에 의해 호출됨녀
					        //          실행대기 상태로 전환됨.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("소비자가 " + this.빵 + "번째 빵 소비를 완료했습니다.");
			isEmpty = true;
			notify(); // 생산자에게 빵 소비를 완료했다고 알림.
		}
	}
}
