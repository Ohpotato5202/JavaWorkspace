package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StirngPoolTest;
import com.kh.chap02_string.controller.B_StringBufferAndBuilder;
import com.kh.chap02_string.controller.C_StringMethodTest;
import com.kh.chap02_string.controller.D_StringTokenizerTest;

public class Run {

	public static void main(String[] args) {
		A_StirngPoolTest asp =new A_StirngPoolTest();
		//asp.method1();
		//asp.method2();
		//asp.method3();
		
		B_StringBufferAndBuilder bs =new B_StringBufferAndBuilder();
		//bs.method();
		
		C_StringMethodTest cs =new C_StringMethodTest();
		//cs.method();
		
        D_StringTokenizerTest ds = new D_StringTokenizerTest();
        ds.method();
        		
	}

}
