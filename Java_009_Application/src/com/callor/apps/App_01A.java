package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_01A {

	public static void main(String[] args) {
		
		//scoreServiceV1클래스를 사용하여
		//객체를 생성할때 정수 5를 전달해주고
		//5만큼의배열을 생성하도록 코드 전달
		ScoreServiceV1 svV1= new ScoreServiceV1(5);
		svV1.makeScore();
		svV1.addNum();
		/*inputScore 매서드는 프라이빗으로 선언되어있기 때문에
		 * 객체.inputScore 형식으로 사용할수 없다
		 * 
		 */
		//svV1.inputScore();
		
		
	}
}
