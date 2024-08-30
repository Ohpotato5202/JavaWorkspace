package com.kh.chap_04_generic.model.vo;

import java.util.ArrayList;

public class Generic<T, GE> {
	
	/*
	 * 제네릭 설정방법.
	 * 여러 참조 자료형으로 대체될 수 있는 부분을 하나의 문자로 표현한다. EX) <T>,<G>, ...
	 * <T> ? 여러 참조자료형 값을 "저장"하는 변수이기 때문에 자료형 매개변수 혹은 타입변수라고 부른다.
	 * */

	
	T t;
	GE ge;
	
	public T test(GE ge) {
		return t;
	}
	
	public void printTest(ArrayList<GE> list) {
		for(GE ge : list) {
			System.out.println(ge);
			
		}
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public GE getGe() {
		return ge;
	}

	public void setGe(GE ge) {
		this.ge = ge;
	}
}
