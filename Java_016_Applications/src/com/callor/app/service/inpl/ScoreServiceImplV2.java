package com.callor.app.service.inpl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.ioo.standard.MenuService;
import com.ioo.standard.impl.InputServiceImplV1;
import com.ioo.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected InputServiceImplV1 inService;
	protected Scanner scan;

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub

		/*
		 * 보통 맴버변수(클래스영역에 선언된 변수들)객체는 이 클래스의 생성자 에서 만드는것이 좋다
		 * 
		 * 하지만 객체를 생성할때 전달해야할 매개변수(파라메터)에 대하여 수행해야할 연산 코드가 있을 경우에는 객체를 사용하기 전에 객체를
		 * 생성하는코드를 작성해도 된다
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		
		menuService = new MenuServiceImplV1("빛고을 고교 성적처리",
							scoreMenu);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료!!!");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			} else if(menu == 2) {
				this.printScore();
			} else if(menu == 3) {
				this.saveScore();
			}
		}
	}

	@Override
	public void inputScore() {
		// 학번입력,이름입력,과목별 성적 입력
		// scoreVO객체 담고 List에 추가
		// =ScoreVO 클래스를 사용하여 생성한 scoreVO객체 담고
		// =ScoreVO에 담고
		inService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		ScoreVO scoreVO = new ScoreVO();

		System.out.println("학번 입력");
		System.out.print(">>");
		String num = scan.nextLine();
		System.out.println("학생 이름 입력");
		System.out.print(">>");
		String name = scan.nextLine();
		System.out.println("국어 점수 입력");
		System.out.print(">>");
		Integer kor = scan.nextInt();
		System.out.println("영어 점수 입력");
		System.out.print(">>");
		Integer eng = scan.nextInt();
		System.out.println("수학 점수 입력");
		System.out.print(">>");
		Integer math = scan.nextInt();

		scoreVO.setKor(kor);
		scoreVO.setEng(eng);
		scoreVO.setMath(math);
		scoreVO.setName(name);
		scoreVO.setNum(num);
		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		System.out.println("성적리스트 저장");
		System.out.println("저장할 파일이름을 입력하세요");
		System.out.print(">> ");
		String strFileName = scan.nextLine();
		if(strFileName.equals("")) {
			System.out.println("파일이름을 입력해야 합니다");
			return;
		}
	}

	

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
