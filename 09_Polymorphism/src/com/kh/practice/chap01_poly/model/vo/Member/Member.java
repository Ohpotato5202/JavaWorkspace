package com.kh.practice.chap01_poly.model.vo.Member;

public class Member {
	
	private String name;
	private int age;
	private char genderr;
	private int couponCount = 0;

	public Member() {
		
	}

	public Member(String name, int age, char genderr, int couponCount) {
		super();
		this.name = name;
		this.age = age;
		this.genderr = genderr;
		this.couponCount = couponCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGenderr() {
		return genderr;
	}

	public void setGenderr(char genderr) {
		this.genderr = genderr;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", genderr=" + genderr + ", couponCount=" + couponCount + "]";
	}
	
	
	
	
}
