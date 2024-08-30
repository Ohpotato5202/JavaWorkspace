package com.kh.chap04_assist.part02_Object.mode.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_Object.mode.vo.Phone;

public class ObjectDao {
	
	public void fileSave() {
		Phone ph = new Phone("아이폰",1500000);
		
		// 객체단위 입출력시 필요한 보조 스트림
        // 기반스트림 : 파일(File)로 기록할것이기 떄문에 FileOutputStream
		// 보조스트림 : 객체(Object)를 출력할 것이기 떄문에 ObjectOutputStream
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
			
			oos.writeObject(ph); // 객체 저장시 사용되는 함수 : writeObject()
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
		
		
		
	}
	
	public void fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))) {
			
		Phone p	= (Phone) ois.readObject();
		
		System.out.println(p);	
		
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
