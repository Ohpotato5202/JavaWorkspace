package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{

	private String maker; // 제조사 정보

//	+ SmartPhone()
	public SmartPhone() {

	}

//	+ printInformation() : String
	public abstract String printInformation();

//	+ setMaker(maker : String) : void
//	+ getMaker() : String
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;

	}
}
