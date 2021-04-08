package com.callor.app.service.impl;

import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.ioo1332.standard.InputService;

/* 다음 interface를 impl하여 ScoreServiceImplV1을 생성하고
 * 각 method 구현
 * List<ScoreVO> scoreList 객체 생성
 * 학생 5명의 학번 이름 성적 입력받아 scoreList에 추가
 */
public class InputServiceImplV1 implements ScoreService {

	protected Scanner scan;
	List<ScoreVO> scoreList;
	InputService isVO;
	
		
	public InputServiceImplV1() {
	// TODO Auto-generated constructor stub
		scan=new Scanner(System.in);
		ScoreVO scVO=new ScoreVO();
		InputService isVO=new com.ioo1332.standard.impl.InputServiceImplV1();
		
}
	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("성적처리");
		System.out.println("-".repeat(50));
		
	}

	@Override
	public void inputName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer inputScore() {
		// TODO Auto-generated method stub
	
		System.out.println(title+"성적 입력");
		
		
		
		return null;
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}