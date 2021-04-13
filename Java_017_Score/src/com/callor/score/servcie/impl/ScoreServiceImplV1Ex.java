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

public class ScoreServiceImplV1Ex implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected InputService inService;

	public ScoreServiceImplV1Ex() {
		// TODO Auto-generated constructor stub
		inService=new InputServiceImplV1();
		/* menuServiceImplV1 클래스의 생성자는
		 * 두개의 매개변수(아규먼트 파라메터)를 전달하면서 호출해야한다
		 * 첫번째 매개변수는  프로젝트의 title 
		 * 두번째 매개변수는 업무 리스트를 담을 List형 객체
		 * 
		 * title은 단순 문자열이기 때문에 바로 전달할수있는데
		 * List형 객체는 List객체를 생성하고 데이터를 add 한후 전달해야하므로
		 * 약간의 추가 연산 코드가 필요하다
		 * 
		 * 이럴떄는 생성자 method 에서 작성하지 않고
		 * 객체를 사용할 method에 작성하는것이 좋다
		 */
		menuService=new MenuServiceImplV1(null, null);
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
		String title="대한 고등학교 성적처리 시스템 2021";
		List<String> menuList=new ArrayList<String>();
		menuList.add("학생 정보 등록");
		menuList.add("성적 등록");
		menuList.add("성적 정보 열기");
		menuList.add("성적 정보 저장");
		menuList.add("성적 정보 출력");
		
		menuService=new MenuServiceImplV1(title,menuList);
		
		while(true) {
			Integer menu=menuService.selectMenu();
			if(menu == null) {
				return;
			}
			// 1번코드
			/* menu 변수의 값이 1일때 코드가 실행되고
			 * 코드가 종료되면 
			 * 또 다시 menu값이 2인가 menu값이 3인가를 검사하는 불필요한 코드가 실행된다
			 */
			if(menu == 1) {}
			if(menu == 2) {}
			if(menu == 3) {}
			// 2번코드
			/* 만약 menu변수의 값이 1이면 menu가 1일때 실행되고 코드가 종료되면 
			 * else이후의 코드는 무시하고 바로 if문이 종료된다
			 */
			if(menu == 1) {
			}else if(menu == 2) {
			}else if(menu == 3) {
			}
		}
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputNum() {
		// TODO Auto-generated method stub
		
	}
}
	