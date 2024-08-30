package com.kh.practice.snack.model.vo;

public class Snack {
	

	private String Kind;  // 종류
	private String Name;  // 이름
	private String Flavor; // 맛
	private int Numof;    // 개수
	private int Price  ;  // 가격
	
	public Snack() {
	}

	public Snack(String Kind, String Name, String Flavor, int Numof, int Prise, int Price) {
		this. Kind = Kind;
		this. Name = Name;
		this. Flavor = Flavor;
		this.Numof = Numof;
		this.Price = Price;
	
}

	public String getKind() {
		return Kind;
	}

	public void setKind(String kind) {
		Kind = kind;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFlavor() {
		return Flavor;
	}

	public void setFlavor(String flavor) {
		Flavor = flavor;
	}

	public int getNumof() {
		return Numof;
	}

	public void setNumof(int numof) {
		Numof = numof;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	public String information() {
		return Kind+" (" +Name +" - "+Flavor+ " ) " + Numof+ "  " + Price;
		
		
	
}
}
