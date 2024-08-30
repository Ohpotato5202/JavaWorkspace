package com.kh.practice1.book.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.kh.practice1.book.model.dao.BookDAO;
import com.kh.practice1.book.model.vo.Book;

public class BookController {

	private BookDAO bd = new BookDAO();
	
	public void makefile() {
		//book.txt가 없을 때 만들어줌
		File book = new File("book.txt");
		if(!book.exists()) { // 파일이 없다면
			try {
				book.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			} // 파일생성
		}
	}
	
	public void fileSave(Book [] bArr) {
		bd.fileSave(bArr);
		
		
	}
	
	public Book[] fileRead() {
		Book[] bArr = bd.fileRead();
		/*
		 * System.out.println(Arrays.toString(bArr)); int count = 0; for(Book b : bArr)
		 * { if(b != null) count ++;
		 * 
		 * }
		 */
		
		return bArr;
		
		
	}
	

	
}
