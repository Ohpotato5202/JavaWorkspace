package com.kh.practice.chap01_poly.model.vo.Member;

public class AniBook extends Book{
	
	private int accessAge;
	
	public AniBook() {
		
	}
	
	

	public AniBook(String title, String aythor, String publisher , int accessAge) {
		super(title, aythor, publisher);
		this.accessAge = accessAge;
		// TODO Auto-generated constructor stub
	}




	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook [accessAge=" + accessAge + "]";
	}

	
}
