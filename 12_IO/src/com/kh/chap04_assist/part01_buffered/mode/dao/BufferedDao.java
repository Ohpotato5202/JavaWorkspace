package com.kh.chap04_assist.part01_buffered.mode.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// BufferedReader/Writer

	public void fileSave() {
		// 보조스트림 종료시, 기반스트림도 자동으로 종료됨.
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("c_buffer.txt")));
			bw.write("안녕하세요");
			bw.newLine(); // 개행을 추가하는 메서드
			bw.write("반갑습니다. \n");
			bw.write("저리가세요.ㅇㅇㅇㅇ");
			// bw.close(); // close()시 flush()를 자동으로 호출. 즉, close + flush 함께 실행.
			// bw.flush();
			// 버퍼 저장공간에 기록된 데이터를 비워주기.
			// 데이터 입출력 성능 향상을 위해 "버퍼" 라는 저장공간을 만들어서 관리하고 있으며, 8kb정도가 모이면
			// 버퍼공간에 담긴 데이터를 쏟아내는데, 값이 다 차기전에 프로세스 종료가 된다면, 버퍼에 담겨있던 데이터가
			// 누락될수 있으므로 flush()함수를 써줘야함.

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileRead() {

		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {

			String value = null;
			while ((value = br.readLine()) != null) {
				System.out.println(value);
			}

			// br.readLine(); // read() 한글자씩 ,readLine() 한문장씩 데이터를 가져옴,

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	
	

}
