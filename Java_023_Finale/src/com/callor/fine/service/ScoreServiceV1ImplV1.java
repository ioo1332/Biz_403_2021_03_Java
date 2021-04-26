package com.callor.fine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceV1ImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceV1ImplV1() {
		// TODO Auto-generated constructor stub
		scoreList =new ArrayList<ScoreVO>();
		scan=new Scanner (System.in);
	}

	public void inputService() {
		// TODO Auto-generated method stub

	}

	public void printList() {
		// TODO Auto-generated method stub

	}

}
