package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
//		연도가 윤년이면 true, 평년이면 false 리턴
//		(윤년: 연도가 4의 배수이면서,100의 배수가 아니거나 400의 배수가 되는 해)
		
		
	}
	
	public long leapDate(Calendar c) {
		
		int currentYear = c.get(Calendar.YEAR);
		long totalDate =0;
		for(int i = 1; i <currentYear; i++) {
			totalDate += isLeapYear(i) ? 366 : 365;
			
		}
		
		Calendar c2 = new GregorianCalendar(2024 , 0 , 1 , 0 , 0, 0 );
		
		long currentTime = c.getTimeInMillis();
		long oldTime = c2.getTimeInMillis();
		
		long diff = (currentTime - oldTime) / 1000 / 60 / 60 / 24+1;
		totalDate += diff;
		
//		int currentYear = c.get(Calendar.MONTH);
//		for(int i = 0; i < currentMonth; i ++) {
//		switch(i) {
//		case 0 : case 2 : case 4 : case 6 : case 7 : case 9 : case 11 :
//			totalDate += 31;
//			break;
//		case 3 , 5 , 8 , 10:
//			totalDate += 30;
//		break;
//		
//		case 1 : totalDate += isLeapYear(currentYear) ? 29 : 28;
//		}	
//		}
//		totalDate += c.get(Calendar.DATE);
		
		return totalDate;
	}
		
	}

	
	

