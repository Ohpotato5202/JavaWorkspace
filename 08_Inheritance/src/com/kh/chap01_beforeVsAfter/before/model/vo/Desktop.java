package com.kh.chap01_beforeVsAfter.before.model.vo;

public class Desktop {

	public String brand;
	public String pCode;
	public String pName;
	public int price;
	public boolean allInone;

	public Desktop() {

	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInone) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInone = allInone;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}

	@Override
	public String toString() {
		return "Desktop [brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", allInone="
				+ allInone + "]";
	}

}
