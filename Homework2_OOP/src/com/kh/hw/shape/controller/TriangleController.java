package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();

	public double calcArea(double height, double width) {
//		Shape s = new Shape(3, height, width);
		//this.s = s;
		
		this.s = new Shape(3, height, width);
		return width * height / 2;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String paint() {
		return "삼각형" + s.informaion();
	}

}
