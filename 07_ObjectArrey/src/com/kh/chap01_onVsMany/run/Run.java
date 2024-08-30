package com.kh.chap01_onVsMany.run;

import java.util.Scanner;

import com.kh.chap01_onVsMany.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// 1. 기본생성자를 이용해 객체를 생성 후 setter를 통해 필드 초기화
		Book bk1 = new Book();
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("자바신");
		bk1.setPublisher("자바");
		bk1.setPrice(20000);
		
		// 2. 매개변수 있는 생성자로 객체 생성과 동시에 필드 초기화
		Book bk2 = new Book("자바 프로그래밍", "박은종", "이지스퍼블리싱",25000);
//		
//		// 3. 사용자가 입력한 값들로 객체 생성 
//		Scanner sc = new Scanner(System.in);	
//		
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		
//		System.out.print("저자 : ");
//		String author = sc.nextLine();
//		
//		System.out.print("출판사 : ");
//		String publisher = sc.nextLine();
//		
//		System.out.print("가격 : ");
//		int price = sc.nextInt();
//		
//		Book bk3 = new Book(title, author, publisher, price);
//		
//		System.out.print(bk1);
//		System.out.print(bk2);
//		System.out.print(bk3);
//	
//		//
//		sc.nextLine();
//		System.out.print("검색할 책 제목을 입력해주세요.");
//		String searchTitle = sc.nextLine();
//		
//		if(bk1.getTitle().equals(searchTitle)) {
//			
//		}
//		if(bk2.getTitle().equals(searchTitle)) {
//			
//		}
//		if(bk3.getTitle().equals(searchTitle)) {

//		}

		Book[] arr = new Book[1000];

		// 1000개의 도서 정보를 저장
		for (int i = 0; i < arr.length; i++) {

			arr[i] = new Book("도서 " + i, "저자" + i, "출판사" + i, 20000);
		}

		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);

		// 사용자에게 검색할 도서 제목을 입력받아
		// 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 출력
		// 만약, 일치하는 도서를 찾지 못한경우 "검색한 도서가 없습니다"를 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 책 제목 :");
		String searchTitle = sc.nextLine();

		boolean isTrue = true;

		for (int i = 0; i < arr.length; i++) {
			Book bk = arr[i];
			String title = bk.getTitle();
			if (title.equals(searchTitle)) {
				isTrue = false;
				break;
			}
		}

		if (isTrue) {
			System.out.print("검색된 도서가 없습니다.");
		}

	}
}
