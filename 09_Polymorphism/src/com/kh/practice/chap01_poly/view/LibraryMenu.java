package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member.Book;
import com.kh.practice.chap01_poly.model.vo.Member.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("나이 : ");
		int age = sc.nextInt();

		System.out.println("성별 : ");
		char gender = sc.next().toUpperCase().charAt(0);

		lc.insertMember(new Member(name, age, gender, 0));

		while (true) {
			System.out.println("1. 마이페이지 "); // LibraryController의 myInfo() 호출하여 출력
			System.out.println("2. 도서 전체 조회"); // LibraryMenu의 selectAll() 호출
			System.out.println("3. 도서 검색"); // LibraryMenu의 searchBook() 호출
			System.out.println("4. 도서 대여하기"); // LibraryMenu의 rentBook() 호출
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 :");
			sc.nextLine();
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" :
				Member m = lc.myInfo();
				System.out.println(m);
				break;
			case "2" : 
				selectAll();
				break;
			case "3" : 
				searchBook();
				break;
			case "4" : 
				rentBook();
				break;
			case "9" : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("다시입력하시오");
			}
		}
		
	}

	public void selectAll() {
		
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		//ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		Book[] bList = lc.selectAll();
		int i = 0;
		for( Book b    :   bList ) {
			System.out.println( i++ +"번 도서 : "+b.toString());
		}

	}

	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keyword);
		
		for( Book b   : searchList)
			System.out.println(b);
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		// LibraryController의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력

	}

	public void rentBook() {
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		selectAll();
		
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		// LibraryController의 rentBook() 에 전달
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();// 개행문자제거
		
		int result = lc.rentBook(index);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
		
	}

}
