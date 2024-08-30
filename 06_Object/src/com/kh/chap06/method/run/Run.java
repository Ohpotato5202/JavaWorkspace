package com.kh.chap06.method.run;

import com.kh.chap06.method.controller.MethodController1;
import com.kh.chap06.method.controller.MethodController2;

public class Run {
	
	public static void main(String[]args) {
		MethodController1 mc1 = new MethodController1();
		mc1.method1();
		
		//mc1.method1();
		int random = mc1.random();
		System.out.println(random);
		
		mc1.sum(random);
		
		int result = mc1.multply(random, 10);
		System.out.println(result);
	}
	MethodController2 mc2 = new MethodController2();
	

}
