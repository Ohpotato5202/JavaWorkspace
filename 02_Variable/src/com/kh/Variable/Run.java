package com.kh.Variable;
 
public class Run {

	public static void main(String[] args) {
		// printVariable함수 호출
		
		// 1) A_Variable을 main 안으로 불러오기
		A_Variable av = new A_Variable();
		
		// 2) A_Variable 내부의 printVariable함수를 찾은후 , 함수호출
		// 연산자 사용하기
		
	
	    //com.kh.Variable.A_Variable();
		
		B_keybordinput bk = new B_keybordinput();
		//bk.inputTest1();
		
		
		C_Cast cc= new C_Cast();
		//cc.autoCasting();
		//cc.forceCasting();
		D_Printf dp = new D_Printf();
		dp.prinfTest();
		
		
		
	}
}
