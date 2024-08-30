package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	
//	+ NUMBERPAD : char[] = {‘1’, ‘2’, 
//			‘3’, ‘4’, ‘5’, ‘6’, ‘7’, ‘8’, ‘9’, ‘*’, ‘0’, ‘#’}
//			+ makeCall() : String // 전화 걸기
//			+ takeCall() : String // 전화 받기

	char [] NUMBERPAD = {'1','2','3', '4', '5','6','7','8','9','*','0','#'};
		
	String makeCall();
	
	String takeCall();
		
	

}
