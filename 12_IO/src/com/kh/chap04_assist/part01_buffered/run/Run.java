package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.mode.dao.BufferedDao;

public class Run {

	public static void main(String[] args) {
		/*
		 * 보조 스트림
		 * 기반 스트림(외부매체와의 연결이 가능한 스트림)의 부족한 기능들을 확장 시킬 수 있는 스트림
		 * 보조 스트림은 단독으로 사용 불가(단독으로 객체생성불가능)
		 * 
		 * [표현법]
		 * 보조스트림 변수명 = new보조스티림 (new 보조스트림(new 기반스트림 객체));
		 * 
		 * 속도 성능 향상 목적의 보조 스트림 : BufferedXXX 
		 *  ==> 버퍼 공강은 제공해서(8byte) 데이터를 버퍼에 몰아두었다가, 버포공간에 데이터가 꽉 차면
		 *      한번에 입/출력을 진행.
		 *      
		 * 기반스트림을 통해 스트림을 열고, 보조스트림을 통해 성능을 개선한다.
		 * 추가성능 ) 속도 성능 향상, 문자변환, 객체 변환 ...
		 * 
		 * */
		
		BufferedDao bd = new BufferedDao();
		//bd.fileSave();
		bd.fileRead();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
