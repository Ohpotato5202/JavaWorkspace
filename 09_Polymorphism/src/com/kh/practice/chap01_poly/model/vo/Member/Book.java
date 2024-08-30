package com.kh.practice.chap01_poly.model.vo.Member;

public class Book {
	private String title;
	private String aythor;
	private String publisher;

	public Book() {

	}

	public Book(String title, String aythor, String publisher) {
		super();
		this.title = title;
		this.aythor = aythor;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAythor() {
		return aythor;
	}

	public void setAythor(String aythor) {
		this.aythor = aythor;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", aythor=" + aythor + ", publisher=" + publisher + "]";
	}

}
