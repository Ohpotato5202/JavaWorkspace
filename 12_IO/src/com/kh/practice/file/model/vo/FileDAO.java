package com.kh.practice.file.model.vo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		//File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		return new File(file).exists();
	}
	
	public void fileSave(String file, String s) {
		File f = new File(file);
		FileOutputStream fos = null;
		try {
			f.createNewFile();
			
			fos = new FileOutputStream(f);
			
			char [] ch = s.toCharArray();
			
			for( char c    :  ch ) {
				fos.write(c); // 한글은 깨짐.
			}
			fos.write(0);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	public  StringBuilder fileOpen(String file) {
		
		StringBuilder sb = new StringBuilder();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		     
			int value = 0;
			
			while((value = fis.read()) != -1) {
				sb.append((char)value);
			}
		
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		} finally {
			
		}
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}

	// 이어쓰기
	public void fileEdit(String file, String s) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file,true);
			
			char [] arr = s.toCharArray();
			for(char word : arr) {
				fos.write(word);
			}
									
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			
			try {
				fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
	
	
}
