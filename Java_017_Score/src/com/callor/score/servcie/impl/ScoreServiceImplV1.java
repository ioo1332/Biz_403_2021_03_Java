package com.callor.score.servcie.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
/* 프로젝트를 생성하고 자신의 jdk를 추가하고 InputValue MenuService클래스를 사용하여 작성
 * 016프로젝트의 scoreVO클래스, scoreService 인터페이스를 참조하여 VO와 interface 작성
 * ScoreService interface 를 implements하여 클래스 작성
 * slectMenu method작성
 */
import com.callor.score.servcie.ScoreService;
import com.ioo.standard.InputService;
import com.ioo.standard.MenuService;
import com.ioo.standard.impl.InputServiceImplV1;
import com.ioo.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected InputService inService;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		inService=new InputServiceImplV1();
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		List<String> menuList = new ArrayList<String>();
		
		menuList.add("학생 정보 등록");
		menuList.add("성적 등록");
		menuList.add("성적 정보 열기");
		menuList.add("성적 정보 저장");
		menuList.add("성적 정보 출력");
		
		menuService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021",menuList);
		
		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업 무 종 료");
				break;
			}
			if (menu == 1) {
				//this.inputNum();
			} else if (menu == 2) {
				this.inputScore();
			} else if (menu == 3) {
				this.readScore();
			} else if (menu == 4) {
				this.saveScore();
			} else if (menu == 5) {
				this.printScore();
			}

		}

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	public void printScore() {
		// TODO Auto-generated method stub

	}
	public void inputNum() {
		// TODO Auto-generated method stub

	}



}
