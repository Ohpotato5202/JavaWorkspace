package com.kh.example.practice6.model.vo;

public class Book {
//	실행용 메소드로 기본 생성자와 매개변수 3개인 생성자,
//	매개변수 5개인 생성자들을 통해 각각의 객체 생성 후
//	inform()을 통해 출력
	
	private String title; 
	private String publisher; 
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
	}
		
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		
           this(title, publisher, author);
		
		   this.price = price;
		   this.discountRate = discountRate;
		
	}
	public void inform() {
		System.out.println(
				title + " , "+ publisher+"," +author+","+price+","+ discountRate	);
	}
	
}
