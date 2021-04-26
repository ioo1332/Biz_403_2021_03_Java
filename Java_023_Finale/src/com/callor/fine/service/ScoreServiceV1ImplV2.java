package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceV1ImplV2 extends ScoreServiceV1ImplV1{
	
	public ScoreServiceV1ImplV2() {
		// TODO Auto-generated constructor stub
		
		//private
		scoreList=new ArrayList<ScoreVO>();
		scan=new Scanner(System.in);
	}

}
