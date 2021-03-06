package com.callor.apps;

import com.callor.apps.model.AddressVO;
import com.callor.apps.service.AddressServiceV1;

public class AddrEx_01 {

	public static void main(String[] args) {
		
		/* 자바에서는 변수명,클래스명,매서드명 객체명 등을 모두 한글로 작성가능하다
		 * 팀프로젝트를 할때는 혼자 만드는 프로젝트가 아니다 보니 
		 * 이름을지을때 프로젝트 규칙을 따라야한다
		 * 
		 * 일부에서 한글로 변수명등을 지으면 코드가 문제가 발생한다고 하지만
		 * 근거없는 이야기 이다
		 * 
		 * 다만 한글로 이름을 짓게되면 CammelCase방식의 명명이 힘들어
		 * 코드작성이 다소 어려워진다.
		 */
		
		// 설계된 VO 클래스를 사용하여 홍길동 객체를 생성한다
		AddressVO 홍길동=new AddressVO();
		
		//객체의 맴버변수에 값을저장
		홍길동.name="홍길동";
		홍길동.cellPhone="010-0000-0000";
		홍길동.email="abc@abc.com";
		홍길동.chain="친구";
		홍길동.address="서울";
		
		AddressServiceV1 ssV1=new AddressServiceV1();
		ssV1.printAddress ("홍길동","abc@abc.com", "010-0000-0000");
		System.out.println("========================");
		ssV1.printAddress(홍길동);
		
		
		
	}
}
