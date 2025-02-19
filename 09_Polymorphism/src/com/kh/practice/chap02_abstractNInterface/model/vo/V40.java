package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone {
	
	
//	V40는 LG에서 만들어졌고 제원은 다음과 같다.
//	번호를 누르고 통화버튼을 누름
//	전화받기 버튼을 누름
//	1200, 1600만 화소 트리플 카메라
//	고속충전, 고속 무선 충전
//	정전식
//	블루투스 펜 탑재 여부 : false
	
	
	public V40() {
		setMaker("LG");
		
	}
	public String makeCall() {
	return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	public String picture() {
		return "1200, 1600만 화소 트리플 카메라";
		}
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	public String touch() {
		return "정전식";
		}
	
	public boolean bluetoothPen() {
		return false;
	}
	
	public String printInformation(){
		String result = "V40는"+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n"
		+makeCall()+"\n"
		+takeCall()+"\n"
		+picture()+"\n"
		+charge()+"\n"
		+touch()+"\n";
		return result;
	}

}
