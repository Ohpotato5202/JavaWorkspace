package com.kh.chap02_byte.mode.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//da0(Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를
//                          입출력하는 클래스.
public class FileByteDao {

	// 자바프로그램 --> 외부매체(파일)
	// 출력(out) : 프로그램내의 데이터를 파일로 내보내기(파일에 기록)
	
	public void filesave() {
		
		// 외부매체(File)로 데이터를 1byte단위로 "출력"하는 스트림
		FileOutputStream fos = null; // 변수 선언 및 명시적 초기화
		
	
		
		try {
			// 1. FileOutputStream 객체 생성
			//    객체생성 == 외부매체와의 스트림 연결.
			//    FileOutputStream은 연결하고자하는 파일이 존재하지 않으면 "파일생성"후 연결
			//                                      존재한다면 그냥 연결.
			//    FileOutputStream("연결하고자하는 외부매체", 이어쓰기여부(true/false))
			//    true 미작성시 => 덮어쓰기(기본값)
			//    true  작성시 -> 이어쓰기
			fos = new FileOutputStream( "a_byte.txt", true );
			String path = "C:/abc";
			File dir = new File(path);
			if(!dir.exists()) {
				dir.mkdir();
				}
			//File p = new File(dir+"/a_byte.txt");
			
			//fos = new FileOutputStream(path+"/a_byte.txt" , true );
			
			// 2. 연결통로를 통해 데이터를 "출력" : write() 메소드 사용
			// 1byte 범위 내에서 문자 출력 가능 (-128 ~ 127 까지의 숫자만 저장가능)
			// 파일에 기록시 '문자'로 기록되기떄문에 0~127까지의 숫자만 저장가능.
			fos.write(97);  //  97 == 'a'
			fos.write('b'); // 'b' == 98
			//fos.write('민'); // 문자열 꺠짐 (바이트의 표현범위를 벗어났기 떄문)
			
			byte [] bArr = {'a','p','p','l','e'}; //apple
			fos.write(bArr);
			
			byte [] cArr = {'h','e','l','l','o',' ','w','o','r','l','d'};
			fos.write(cArr, 0, 5);
			
			fos.write(cArr, 6, 5);
			fos.write('\n'); //개행처리
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 에러가 발생했뜬 아니든 "항상" 최종적으로 실행되는 블럭.
			// 3. 스트림을 다 이용했으면 자원 반납하기
		    try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	    //외부매체 --> 프로그램 (읽음)
	    //입력 : 파일로부터 현재 어플리케이션에 데이터를 가지고 오겠다.
       public void fileRead() {
    	   
    	   //FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
    	   
    	   FileInputStream fin = null;
    	   
    	   try {
    		   // 1. 객체생성 ==  외부매체와 스트림을 연결.
			fin = new FileInputStream("a_byte.txt"); // 연결하고자하는 파일이 없는경우 에러
            
			// 2. 스트림을 통해 데이터 입력 read() 
			// 단, 데이터는 1byte단위로 읽어옴
			
			/*
			 * System.out.println((char)fin.read()); //97
			 * System.out.println((char)fin.read()); //112
			 * System.out.println((char)fin.read()); //112
			 * System.out.println((char)fin.read()); //108 System.out.println(fin.read());
			 * //파일 끝을 만난순간 -1반환
			 */			
			
			int value =0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
				
			}
        			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				fin.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
    	   
		}
	}
