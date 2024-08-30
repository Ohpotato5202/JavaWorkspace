package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	
	public void mainMenu() {
	System.out.println("== Welcome KH Library ==");
	System.out.println("******* 메인 메뉴 *******");
	System.out.println("1. 새 도서 추가 ");
	System.out.println("2. 도서 전체 조회");
	System.out.println("3. 도서 검색 조회");
	System.out.println("4. 도서 삭제");
	System.out.println("5. 도서 명 오름차순 정렬");
	System.out.println("9. 종료");
	
	while(true) {
		System.out.print("메뉴 번호 : ");
		int menu =Integer.parseInt(sc.nextLine());
		
		switch(menu){
		case 1:insertBook(); break;
        case 2:selectList(); break;
        case 3:searchBook(); break;
        case 4:deleteBook(); break;
        case 5:ascBook(); break;
        case 9: System.out.println("종료"); return;
		
        default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		}
	}
		
		
	}

	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {
		
		System.out.print("도서명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 입력 : ");
		String author = sc.nextLine();
		
		System.out.print("장르 입력 : ");
		int category = sc.nextInt();
		
		System.out.println("가격 입력 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book bk = new Book(title, author, category == 1 ? "인문" :
		                                  category == 2 ? "자연과학" :
		                                  category == 3 ? "의료" : "기타"
			                            , price);
	    bc.insertBook(bk);
	}

	// 2. 도서 전체용 view 메소드
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for( Book b : bookList ) {
				System.out.println(b);
			}
		}
		
	}
//	// 3. 도서 검색용 view 메소드
	public void searchBook() {
		System.out.print("검색할 도서명 : ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchList = bc.searchBook(keyword);

		if (searchList.isEmpty()) {
			System.out.println("없습니다.");
			return;
		}

		for (Book b : searchList) {
			System.out.println(b);
		}

	}
//	// 4. 도서 삭제용 view 메소드
	public void deleteBook() {
		System.out.print("삭제할 도서명 :");
		String title = sc.nextLine();

		System.out.print("삭제할 저자명 :");
		String author = sc.nextLine();

		Book remove = bc.deleteBook(title, author);

		if (remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			return;
		}
		System.out.println("성공적으로 삭제되었습니다.");
	}
		
//	// 5. 도서 명 오름차순 정렬용 view 메소드
	 public void ascBook() {

			int result = bc.ascBook();

			if (result == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}

	 }
}