package com.kh.chap_02_map.part_03_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		// 1. load(InputStream)
		
		try {
			prop.load(new FileInputStream("test.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		String list = prop.getProperty("List");
		
		System.out.println(list);

		
		// 2. 전체열람 메소드
		Enumeration<?> en = prop.propertyNames();
		
		while(en.hasMoreElements()) {
			String name = (String)en.nextElement();
			String value = prop.getProperty(name);
			System.out.println(name+" = "+value);
			
		}
		/*
		 * .properties 사용하는 이유 ?
		 *  내부의 데이터가 모두 (key,value) 문자열이기 떄문에 개발자가 아닌 일반 관리자가 문서를 다루기 쉬움
		 *  프로그램이 가져야하는 기본적인 정보들을 .properties로 저장해두면 데이터를 쉽게 가져올수 있다.
		 *  
		 * .xml 사용하는 경우는, 다른 프로그래밍 언어, 다른 프로그램간에 호환성이 좋기 때문에 자주 사용된다.
		 * */
		
		
		
		
		
		
		
	}

}
