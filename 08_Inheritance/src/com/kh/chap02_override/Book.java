package com.kh.chap02_override;

public class Book {

	private String title;
	private String author;
	private int price;

	public Book() {
		super();

	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAythor() {
		return author;
	}

	public void setAythor(String aythor) {
		this.author = aythor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	/*
	 * 오버라이딩 
	 * - 상속받고있는 부모 클래스의 메소드를 자식 클래스에서 재정의(Override) 하는것
	 * - 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다 라는 의미
	 *   (실행시 자식메소드가 우선권을 가짐)
	 *   
	 * 오버라이딩 성립 조건
	 * - 부모메소드의 메소드명과 동일
	 * - 매개변수의 자료형, 개수, 순서가 완벽히 동일(매개변수명은 상관 없음)
	 * - 반환형도 동일해야함
	 * - 접근제한자는 부모보다 같거나, 공유범위가 커야한다.
	 * 
	 * @Override 어노테이션(주석)
	 * - 생략가능 (명시를 안해도 부모메소드와 형태가 같으면 오버라이딩이 자동으로 이루어짐)
	 * - 어노테이션을 붙이는 이유
	 *   > 잘못 기술했을 경우 오류를 알려주기 때문에 오류를 수정 할 수 있음.
	 *   > 부모 클래수의 메소드가 나중에 수정된경우, 오류로 알려주기 때문에 검토할 수 있음.
	 *   > 이 메소드가 오버라이딩된 메소드임을 알리는 목적
	 * */
	
//	@Override
	public String toString() {
		return "title :"+title+" ,author : "+author+", price : "+price;
	}

}
