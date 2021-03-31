package com.collor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {

	public static void main(String[] args) {
		// 컴퓨터의 내장된 시계로부터 현재 날짜 시간 데이터를 읽어와서
		// today 객체로 만들기
		Date today= new Date();
		// today 객체를 문자열로 변환시기위한 보조 클래스
		SimpleDateFormat dateForm=new SimpleDateFormat("yyyy-mm-dd");
		
		dateForm.format(today);
		String curDate=dateForm.format(today);
		System.out.println(curDate);
		
		SimpleDateFormat timeForm= new SimpleDateFormat("hh:mm:ss");
		String curTime=timeForm.format(today);
		System.out.println(curTime);
		
		timeForm=new SimpleDateFormat("HHH:mm:ss");
		System.out.println(timeForm.format(today));
		
	
	}
}
