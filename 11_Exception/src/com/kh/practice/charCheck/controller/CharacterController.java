package com.kh.practice.charCheck.controller;


import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		
	}

	public int countAlpha(String s) throws CharCheckException{
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		char [] cArr = s.toCharArray(); // char배열 변환
		
		int count = 0;
		for( char ch : cArr) {
			// ch가 영문자인지 아닌지 확인
			if(ch >= 'a' && ch <= 'z') {
				count++;
			}
			if(ch == ' ') {
				new CharCheckException("체크할 문자열안에 공백이 포함되어 있습니다.");
			}
		}
		
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		return count;
		
	
		
		
		
		    }	
	    
	
	
		

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
