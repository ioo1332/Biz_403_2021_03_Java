package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.ioo.standard.impl.InputServiceImplV1;


/* 다음 interface를 impl하여 ScoreServiceImplV1을 생성하고
 * 각 method 구현
 * List<ScoreVO> scoreList 객체 생성
 * 학생 5명의 학번 이름 성적 입력받아 scoreList에 추가
 */
/* 메뉴를 보여주고
 * 성적입력 학생수의 제한이 없다
 * 
 * 학생성적입력 inputScore로시작
 * 학번입력
 * 이름입력
 * 점수입력
 * 학생의 이름을 입력하는 inputName method는 return타입이 string 이기 때문에
 * 학생이름을 입력받고 입력받은 학생이름을 return 할수있다
 * 이 return된 학생 이름을 inputScore에 받아 변수에담아 처리할수있다
 */
public class ScoreServiceImplV1 implements ScoreService {
	
	protected Scanner scan;//이름을 입력 받을때 사용할 객체
	protected List<ScoreVO> scoreList; // 저장소
	protected ScoreVO scoreVO;
	protected InputServiceImplV1 inService;//학번 점수를 입력 받을때 사용할 객체

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		InputServiceImplV1 inService = new InputServiceImplV1();

	}

	@Override
	public void selectMenu() {
		// TODO 성적처리 메뉴 선택
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("성적처리");
			System.out.println("-".repeat(50));
			System.out.println("1.학생별 성적 입력");
			System.out.println("2.학생별 리스트 출력");
			System.out.println("QUIET.업무종료");
			System.out.println("=".repeat(50));
			System.out.println("업무선택>>");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIET")) {
				break;
				// System.out.println("업무종료");
				// return;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴는 1,2,QUIET만 입력가능");
				continue;
			}
			if (intMenu == 1) {
				this.inputScore();
			} else if (intMenu == 2) {
				this.printScore();
				
			}
		}//end while
		System.out.println("업무종료");
	}

	@Override
	public void inputName() {
		// TODO 학번,이름,과목점수를 입력받아 list에 추가
		
		/* while (true) {
			System.out.println("학생의 학번을 입력하세요.(QUIT : 메뉴화면)");
			System.out.print(">> ");
			String num = scan.nextLine();
			Integer intInput = null;
			if (num.equals("QUIT")) {
				return;
			} else {
				try {
					intInput = Integer.valueOf(num);
				} catch (NumberFormatException e) {
					System.out.println("학번은 정수로 입력");
					continue;
				}
			}
			scoreVO = new ScoreVO();
			scoreVO.setNum(num);
			this.inputScore();

		}*/
	}

	private String inputName(String strNum) {
		// TODO 학번을 보여주고 이름을 입력받는 method
		while(true) {
			System.out.println("학생 이름 입력 (QUIT:입력취소");
			System.out.print(">>");
			String strName=scan.nextLine();
			if(strName.equals("QUIT")) {
				return null;
				//break; 끝에 return 을 살리고싶으면 break
			}else if(strName.equals("")){ //빈칸입력시
				System.out.println("학생 이름 입력해주세요");
				continue;
			}
			return strName;
		}//end while
		//return null;
	}
	/* 현재 클래스 내부에서만 호출되는 method는 private로 선언한다
	 * 현재 클래스를 상속받아 확장하여 사용할수 있도록 하려면
	 * private=> protected로 변경 해주는게 좋다
	 */
	protected String inputNum() {
		
		// 학번입력처리 : 001, 002 형식으로 입력받자
		// 정수 1 이상을 입력하면
		// 		정수 값이 intNum에 담길것이고
		// QUIT를 입력했으면 
		//		null 값이 intNum에 담길것이다
		Integer intNum = inService.inputValue("학번",1);
		
		// intNum에 null 값이 담겨있으면 종료하고
		// 		다시 메뉴로 돌아간다
		if(intNum == null) {
			return null;
		}
		
		// 정수를 입력했으면 입력받은 정수값을
		// 학번의 문자열 형식(001, 002)으로 변환을 하자
		// String.format("%3d", 1)
		//		전체 자릿수를 3개로 만들고
		//		정수값을 오른쪽 정렬하는 문자열 만들기
		//		"  1"
		// String.format("%03d", 1)
		//		전체 자릿수를 3개로 만들고
		//		정수값을 오른쪽 정렬하고
		//		왼쪽의 빈칸에 0을 채워라
		//		"001"
		String strNum 
			= String.format("2021%03d",intNum); // 2021001
		return strNum;
	
	}
	
	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		/* while (true) {
			for(int i=0;i<5;i++) {
			System.out.println("학생의 이름을 입력하세요.");
			System.out.print(">> ");
			String name = scan.nextLine();
			System.out.println("국어점수를 입력하세요");
			System.out.print(">> ");
			Integer kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			System.out.print(">> ");
			Integer eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			System.out.print(">> ");
			Integer math = scan.nextInt();

			scoreVO.setName(name);
			scoreVO.setKor(kor);
			scoreVO.setEng(eng);
			scoreVO.setMath(math);
			scoreList.add(scoreVO);
			}
			this.printScore();

		} */
		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		
		/*
		 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후
		 * 한 과목이라도 QUIT하면 종료하는 코드이다
		 * 만약 국어 과목에서 QUIT를 하여도
		 * 영어, 수학 점수를 입력받은 Prompt가 나타나고 3과목을
		 * 모두 통과 한 후 입력종료 된다
		 */
		if(intKor == null || intEng == null || intMath == null) {
			return;
		}
		
		// 입력을 모두 마쳤으면 VO에 담기
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		// vo에 담간 데이터를 List 저장소에 추가
		scoreList.add(scoreVO);
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("=".repeat(50));

		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO vo=scoreList.get(i);
			System.out.println(vo.getNum()+"\t");
			System.out.println(vo.getName()+"\t");
			System.out.println(vo.getKor()+"\t");
			System.out.println(vo.getEng()+"\t");
			System.out.println(vo.getMath()+"\t");
			System.out.println(vo.getTotal()+"\t");
			System.out.println(vo.getAvg()+"\n");
		}
		System.out.println("=".repeat(50));
		}
	}

