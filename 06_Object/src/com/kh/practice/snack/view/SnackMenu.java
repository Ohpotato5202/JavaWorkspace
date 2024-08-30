package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요");
		
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		int numof = sc.nextInt();
		System.out.print("가격 : ");
		int getPrice = sc.nextInt();
		
		String result = scr.saveData(kind,name,flavor,numof,getPrice);
		System.out.println(result);
		
		
		System.out.println("저장한 정보를 확인하시겠습니까? ? (Y/N) : ");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'y') {
			String snack = scr.confirmData();
			System.out.println(snack);
			System.out.println("저장 완료되었습니다.");
		}
	}
	
	

}
