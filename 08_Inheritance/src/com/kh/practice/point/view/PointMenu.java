package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.*;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		while (true) {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt(); sc.nextLine();
		
		
		switch (menu) {
		case 1:
			circleMenu();
			break;
		case 2:
			rectangleMenu();
			break;
		case 9:
			System.out.println("포르그램을 종료합니다.");
			break;
		default:
			System.out.println("다시 입력해주세요.");
			System.exit(0);
			break;
		}
	}
		
}
	
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int menu = sc.nextInt(); sc.nextLine();
        
		
		switch (menu) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			System.out.println("메인 메뉴로 돌아갑니다.");
			mainMenu();
			return;
		default:
			System.out.println("다시 입력해주세요.");
			System.exit(0);
			break;
		
		}
	}
	
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int menu = sc.nextInt(); sc.nextLine();
        
		
		switch (menu) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			System.out.println("메인 메뉴로 돌아갑니다.");
			mainMenu();
			return;
		default:
			System.out.println("종료합니다.");
			System.exit(0);
			break;
		
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, radius));
		this.mainMenu();
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt(); 
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt(); 
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();;
		
		System.out.println(cc.calcArea(x, y, radius));
		this.mainMenu();
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt(); 
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt(); 
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
		this.mainMenu();
	
	}
	
	public void calcArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();;
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
		this.mainMenu();
	}
}