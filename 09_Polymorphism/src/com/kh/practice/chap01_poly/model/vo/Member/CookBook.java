package com.kh.practice.chap01_poly.model.vo.Member;

public class CookBook extends Book {
	private boolean coupon;
	
	public CookBook() {
		
		
	}
	
	
	
	public CookBook(String title, String aythor, String publisher, boolean coupon) {
		super(title, aythor, publisher);
		this.coupon = coupon;
	}


	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + "]";
	}

}
