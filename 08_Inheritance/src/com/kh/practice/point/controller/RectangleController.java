package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);  r.setY(y);  r.setHeight(height);  r.setWidth(width);
		return "면적 : " + r.toString() + " / " +
				(r.getHeight() * r.getWidth());
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);  r.setY(y);  r.setHeight(height);  r.setWidth(width);
		return "둘레 : " + r.toString() + " / " +
				2 * (r.getHeight() + r.getWidth());
	}

}
//받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
// 면적 : PI * 반지름 * 반지름
//calcArea(x:int, y:int,:int):
