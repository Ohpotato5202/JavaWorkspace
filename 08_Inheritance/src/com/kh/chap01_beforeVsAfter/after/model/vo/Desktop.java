package com.kh.chap01_beforeVsAfter.after.model.vo;

public class Desktop extends Product {// 상속 완료!!(extends 붙이고 상속할 클래스명)

	private boolean allInOne;

	public Desktop() {

	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand,pCode,pName,price는 Produce에 존재하는 필드.

		// 방법1)필드의 접근제한자를 protected로 변경후 필드에 직접대입
		super.brand = brand;

		// 방법2)public 접근제한자인 setter메소드 활용하기
		setBrand(brand);
		setpCode(pCode);
		setpName(pName);
		setPrice(price);
		// 방법3)부모생성자를 호출하여 필드값 초기화.
		// super(brand,pCode,pName,price); // super라는 예약어 사용해서 부모생성자를 호출
		// super 는 부모주소값을 가지고 있다.
		// 즉, super으로 부모에 접근 가능.

		this.allInOne = allInOne;

	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public String toString2() {
		return super.toString() + getBrand() + super.getpCode() + "allInOne : " + allInOne;
	}

}