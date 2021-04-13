package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.servcie.ScoreService;
import com.callor.score.servcie.impl.ScoreServiceImplV1Ex;

public class Const_01 {
	
	public static void main(String[] args) {
		
		/* 인터페이스가 있는 클래스의 객체 생성
		 * =클래스를 선언할때 인터페이스를 impl했다
		 * 
		 * 인터페이스를 사용하여 객체를 선언하고
		 * 구현체 클래스의 생성자를 호출하여 객체를 생성,초기화 해야한다
		 * 
		 * 인터페이스는 생성자 method가 없다
		 */
		ScoreService sService=new ScoreServiceImplV1Ex();
		/* List 인터페이스로 3개의 객체를 선언하고
		 * 각각을 array Linked vector클래스를 사용하여 생성했다
		 * 
		 * strList1~3 는 각각 arrayList LinkedList Vector 타입으로 
		 * 데이터 형이 다르다
		 * 
		 * 하지만 List 인터페이스 타입으로 선언되어있기때문에
		 * method등의 연산을 공용으로 사용할수 있다
		 * 이러한 성질을 (클래스의)다형성 이라고 한다
		 */
		List<String> strList1=new ArrayList<String>();
		List<String> strList2=new LinkedList<>();
		List<String> strList3=new Vector<>();
		strList1.add("대한민국");
		strList1.add("우리나라");
		
		strList2.add("3+4");
		strList2.add("3/4");
		
		strList3.add("홍길동");
		strList3.add("이몽룡");
		strList3.add("성춘향");
		

		
		//리스트에 저장된 내용을 출력하는 method호출
		list(strList1);
		list(strList2);
		list(strList3);
		
	}
	/* 매개변수 타입을 
	 * List interface type으로 선언한 method
	 * 
	 * 이 method 는 List interface의 자손인
	 * arrayList LinkedList Vector 클래스로 생성된 객체르 매개변수로 받아 연산을 수행할수있다
	 * 
	 * 즉 한개의 method로 다수 type의 값을 연산을 수행할수있다
	 * 
	 */
	public static void list(List<String> strList) {
		//List내용을 console에 출력
		int nSize=strList.size();
		for(int i=0;i<nSize;i++) {
			System.out.println(strList.get(i));
		}
		
		
	}

}
