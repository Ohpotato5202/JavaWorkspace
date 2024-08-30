package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent{

	private int n;
	
	public Child2() {
		
	}
	public Child2(int x, int y, int n) {
		super(x,y);
		this.n=n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public void printChile2() {
		System.out.println("자식 클래스 2번");
	}
	
	@Override
	public void print() {
		System.out.println("자식클래스2에서 재정의된 메서드");
	}
	
}
