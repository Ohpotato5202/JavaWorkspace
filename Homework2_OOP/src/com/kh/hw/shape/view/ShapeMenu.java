package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
import com.kh.hw.shape.model.vo.Shape;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private Shape s = new Shape();
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	// 메인메뉴
	public void inputMenu() {
		while (true) {
			System.out.println("=====도형 프로그램=======");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 3:
				s.setType(3);
				triangleMenu();
				break;
			case 4:
				s.setType(4);
				squareMenu();
				break;
			case 9:
				System.out.println("포르그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 번호 입니다. 다시 입력하세요");
				inputMenu();
				break;
			}
		}
	}

	// 삼각형 메뉴
	public void triangleMenu() {
		while (true) {
			System.out.println("=====삼각형=====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				inputSize(s.getType(), num);
				break;
			case 2:
				inputSize(s.getType(), num);
				break;
			case 3:
				printInfomation(s.getType());
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력했니다. 다시 입력해주세요.");
				triangleMenu();
				break;
			}
		}
	}

	// 사각형 메뉴
	public void squareMenu() {
		while (true) {
			System.out.println("=====사각형=====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				inputSize(s.getType(), num);
				break;
			case 2:
				inputSize(s.getType(), num);
				break;
			case 3:
				inputSize(s.getType(),num);
				scr.paint();
				break;
			case 4:
				printInfomation(s.getType());
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				triangleMenu();
				break;
			}
		}
	}

	// 너비와 높이를 받아 요청사항을 처리하거나
	// 색깔을 받아 요청사항을 처리하는 메소드
	public void inputSize(int type, int menuNum) {
		if (type == 3) { // 삼각형
			if (menuNum == 1) { // 1번 면적
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double area = tc.calcArea(height, width);
				System.out.println("삼각형 면적 : " +area);
			} else {  // 2번 색칠
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		}else {
			if (menuNum == 1 || menuNum == 2) {// 사각형
		
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double width = sc.nextDouble();
			sc.nextLine();
			if (menuNum == 1) { // 1번 둘레
				System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));

			}else { // 2번 면적
				System.out.println("사각형 면적 : " + scr.calcArea(height, width));
			
			}
		}else {// 3번 색칠
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("색깔이 수정되었습니다.");
		}
		}
	}
	
	
	// 매개변수에 따라 삼각형/사각형의 정보를 출력하는 메소드
	public void printInfomation(int type) {
		if (type == 3) {
			System.out.println(type == 3 ? tc.paint() :scr.paint());
		} else if (type == 4) {
			System.out.println(scr.paint());
		}
	}
}

