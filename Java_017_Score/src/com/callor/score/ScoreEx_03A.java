package com.callor.score;

import com.callor.score.servcie.ScoreService;
import com.callor.score.servcie.impl.ScoreServiceImplV3;

public class ScoreEx_03A {
	public static void main(String[] args) {
		ScoreService sService=new ScoreServiceImplV3(); 
		sService.selectMenu();
	}

}
