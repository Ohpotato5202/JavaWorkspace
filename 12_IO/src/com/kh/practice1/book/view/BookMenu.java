package com.kh.practice1.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice1.book.controller.BookController;
import com.kh.practice1.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr; // = null ;

	public void Bookmenu() {

		bc.makefile();

		bArr = bc.fileRead();

	}

	public void mainMenu() {
		while (true) {

			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("다시입력");
			}
		}

	}

	public void fileSave() {

		System.out.println("도서 명 : ");
		String title = sc.nextLine();

		System.out.println("저자 명 : ");
		String author = sc.nextLine();

		System.out.println("도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());

		System.out.println("출판 날짜(yyyy-mm-dd) : ");
		String sDate = sc.nextLine();

		System.out.print("할인율 : ");
		double discount = Double.parseDouble(sc.nextLine());

		Calendar date = Calendar.getInstance(); // 현재시간

		String[] sDateArr = sDate.split("-"); // [ "yyyy", "mm" , "dd"];
		int year = Integer.parseInt(sDateArr[0]);
		int month = Integer.parseInt(sDateArr[1]);
		int date2 = Integer.parseInt(sDateArr[2]);
		date.set(year, month, date2);

		Book bk = new Book(title, author, price, date, discount);
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i] == null) { // 현재 공간이 비어있는경우
				bArr[i] = bk;
				break;
			}
		}
		bc.fileSave(bArr);
	}

	public void fileRead() {
		Book[] bArr = bc.fileRead();
		for (Book b : bArr) {
			if(b != null) System.out.println(b);
		}

	}

}
