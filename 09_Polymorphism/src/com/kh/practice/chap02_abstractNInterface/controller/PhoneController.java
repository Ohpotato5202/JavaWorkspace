package com.kh.practice.chap02_abstractNInterface.controller;


import com.kh.practice.chap02_abstractNInterface.model.vo.*;


public class PhoneController {
	private String [] result = new String[2];
	
	
	public String[] method() {
		Phone[] arr =new Phone[2];
		arr[0] =new GalaxyNote9();
		arr[1] =new V40();
		
		for(int i =0; i<arr.length;i++) {
			
			//arr[i]가 실제로 참조하고 있는 클래스가 GalaxyNote9이라면?
			//1)
			if(arr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)arr[i]).printInformation();
			}else {
				result[i] = ((V40)arr[i]).printInformation();
			}
			
			
			//2) arr[i] =>Phone(최상위 인터페이스)
//						=>downCasting=> SmartPhone.printInformation();
//						=>동적바인딩 =>GalaxyNote9, V40에 작성한 오버라이딩된 메서드 실행
			result[i] =((SmartPhone)arr[i]).printInformation();
			
			
		}
		
		return result;
		
	}

}
