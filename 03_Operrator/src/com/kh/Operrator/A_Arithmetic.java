package com.kh.Operrator;

// 산술연산자(이항연산자 == 두개의 값을 가지고 연산)
// + - / *%
public class A_Arithmetic {
	public void method() {
		int num1 = 10;	
		int num2 =  3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		// num1 + num2 = 103
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		
		System.out.println("num1 * num2 = " + (num1 * num2));
		
		System.out.println("num1 / num2 = " + (num1 / num2));
		
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		
		double a = 35; 
		double b = 10;
		
		System.out.println(a / b); // 3.5
		System.out.println(a % b); // 5.0
		
	}
	
	public void quiz() {
		
		
		
	    int a = 5;
	    int b = 10;  // a= 5, b=10
	    
	    int c = (++a) + b; // a= 6, b= 10 , c= 16
	    int d = c / a; // a= 6, b= 10 , c= 16, d = 2
	    int e = c % a; // a= 6, b= 10 , c= 16, d = 2, e= 4
	    
	    int f = e++; // a= 6, b= 10 , c= 16, d = 2, e= 4(5), f = 4
	    int g = (--b) + (d--); // a= 6, b= 10 , c= 16, d = 2(1), e= 5, f = 4, g = 11
	    int h = 2;
	    
	    // a= 6(7), b= 10 , c= 16, d = 1, e= 5(6), f = 4, g = 11(10), h = 2
	    // , h= 2 , g= 12
	    int i = (a++) + b / (--c / f) * (g-- -d) % (++e + h);
	    // (6) + 9 / (15 / 4 ) * (11 - 1) % (6 + 2)
	    // 6 + 9 / 3 * 10 % 8
	    // 6 + 3 * 10 % 8 
	    // 6 + 30 % 8
	    // 6 + 6
	    // 12
	
	    //a, b, c, d, e, f, g, h, i
	    //담겨있는 값을 예측해보기
	    
	    System.out.println("a : " +a);
	    System.out.println("b : " +b);
	    System.out.println("c : " +c);
	    System.out.println("d : " +d);
	    System.out.println("e : " +e);
	    System.out.println("f : " +f);
	    System.out.println("g : " +g);
	    System.out.println("h : " +h);
	    System.out.println("i : " +i);
	   
	
	
	}
}
