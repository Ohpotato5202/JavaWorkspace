package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");

		String result = " ";
		StringBuilder sb = new StringBuilder();
		
		while (st.hasMoreTokens()) {
			// result += st.nextToken();
			sb.append(st.nextToken());
		}
		
		return String.join(", ", str.split(" "));
		//return result;
		//return sb.toString();
	}

	public String firstCap(String input) {
		char ch = input.toUpperCase().charAt(0);
		String str = input.substring(1);
		
		//return input.toUpperCase().substring(0.1) + input.substring(1);
		return ch + str;
		

	}

	public int findChar(String input, char one) {
		
		char[] arr = input.toCharArray();
		int count =0;
		
		for(char ch :   arr ) {
			if(ch == one) count++;
			
		}
		return count;
		}

	}

