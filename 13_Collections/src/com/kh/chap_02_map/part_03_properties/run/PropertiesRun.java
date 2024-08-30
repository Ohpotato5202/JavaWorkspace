package com.kh.chap_02_map.part_03_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {
	
	public static void main(String[] args) {
		/*
		 * Properties : Map계열 (key, value 세트로 값을 저장)
		 *             단, Properties만의 특징은 key, value모두 문자열로 저장한다.
		 *             파일 입출력 메소드를 지원하고 있다.
		 *             => 설정정보를 표현하는데 있어서 최적의 형태를 가지고 있다.
		 * */
		
		Properties prop = new Properties();
		
		// Map계열이기 때문에 put메소드를 통해 어떤자료형의 값이든 다 추가 가능.
		// prop.put("다이제",new Snack("초코맛",1234));
		
		// 단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는 key, value세트들을 파일로 기록 시킨다거나,
		// 파일에 기록된 keym value세트를 가지고 올때 사용한다.
		
		// 1.Properties에 값을 추가시에는 setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties"); // 덮어씌우기
		prop.setProperty("Set", "HashSap");
		
		
		System.out.println(prop);
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("Map"));
		System.out.println(prop.getProperty("Map2","기본값")); // key값이 존재하지 않는경우 반환시켜주는 두번째 매개변수
		
		
		try {
			// 3. store(OutputStream os, String Comments) : Properties에 담긴 데이터를 key - value로 출력
			prop.store(new FileOutputStream("test.properties"), "Properties");
			
			// 4. storeToXML(OutputStream os, String Comments) : xml문서에 내용을 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties xml Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	













}