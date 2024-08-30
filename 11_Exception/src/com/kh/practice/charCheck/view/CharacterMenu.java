package com.kh.practice.charCheck.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;


public class CharacterMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		    System.out.print("문자열 : ");
		    String str = sc.nextLine();
		   
		    CharacterController cc = new CharacterController();
		try {
			int result = cc.countAlpha(str);
			System.out.println(str +"에 포함된 영문자 개수 : " +result);
		} catch (CharCheckException e) {
			e.printStackTrace(); // 에러메세지 출력.
		}
		
		
		// CharacterController의 countAlpha()에
		// 매개변수로 넘겨주어 반환 값을 출력함
		// 이 때 countAlpha()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리
	}

}
