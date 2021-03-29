package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {
	
	public static void main(String[] args) {

		ScoreServiceV1 svV1 = new ScoreServiceV1();
		svV1.scoreService();
		svV1.makeScore();
		svV1.makeSum();
		svV1.printList();
		
	}

}
