package com.kh.chap02_abstactAndInterface.part2_family.model.vo;

public class Baby extends Person implements Basic {
	
	public Baby() {
		super();
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
		breathing();  //인터페이스에게 상속받은 default메소드
	}
	
	public String toString() {
		return super.toString();
	}

	
	
	@Override
	public void eat() {
		setWeight(getWeight() +3);
		setHealth(getHealth() +1);
	}

	@Override
	public void sleep() {
		setHealth(getHealth() +3);
		
	}
	
	
	public void crawl() {
		setHealth(getHealth() +3);
	}
	
	

}
