package com.kh.Operrator;

public class D_ LogicalNegation {
	 /*
	  * 논리부정연산자 ! (단항연산자)
	  * 
	  * 논리값을 반대로 바꿔줄때 사용함
	  *
	  * !논리값 
	  * */
    public void method() {
    	System.out.println("true의 부정 : " + !true);
    	System.out.println("false의 부정 : " + !false);
    	
    	boolean b = true; // true
    	boolean b2 = !b;  // false
    	
    	// true나 false값이 반환되는 계산식에 자주 사용된다.
    	boolean b3 = !(5 < 3); // true 
    	
    	
    }
	
}
