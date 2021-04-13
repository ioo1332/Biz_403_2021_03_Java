package com.callor.score;

import com.callor.score.servcie.ScoreService;
import com.callor.score.servcie.impl.ScoreServiceImplV1;
import com.callor.score.servcie.impl.ScoreServiceImplV1Ex;
import com.callor.score.servcie.impl.ScoreServiceImplV2;

public class ScoreEx_02A {
	
	public static void main(String[] args) {
		
		ScoreService sService=new ScoreServiceImplV1();
		sService.selectMenu();
	}

}
