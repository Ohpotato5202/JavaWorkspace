package com.kh.practice.leapview;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView{
	

	public LeapView() {
		LeapController lc =  new LeapController();
		Calendar cal1 = Calendar.getInstance();
		
		
		boolean result = lc.isLeapYear(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.YEAR)+"년은 "+ (result ? "윤년" : "평년"));
		
		long count = lc.leapDate(cal1);
		System.out.println("총 날짜 수 : "+count);
	//  , 1년 1월 1일부터 지금 까지 며칠이 지났는지 모두 출력
	
	}
}
