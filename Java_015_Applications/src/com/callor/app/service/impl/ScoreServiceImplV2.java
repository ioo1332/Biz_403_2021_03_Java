package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

/* ScoreServiceImplV1을 상속받고 
 * inputScore method 재정의 학생의 학번 입력받을때
 * 이미 입력된 학생일경우 메시지로 보여주고 다시 입력받는다
 * 이름 성적은 v1과 같음
 * 
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	
	/* scoreList에 성적정보를 추가할때 학번을 입력받을텐데
	 * 이미 등록된 학번 정보가 있으면 그 학번은 추가 하지 못하도록하는 코드
	 *
	 * v1 inputNum method 재정의
	 * v1 inputNum method 재정의 하기위해 private를 protected로 변경함
	 */
	
	public ScoreServiceImplV2() {
		// TODO Auto-generated constructor stub

	}
	
	protected String inputNum() {
		while(true) {
		Integer intNum=inService.inputValue("학번", 1);
		if(intNum==null) {
			return null;
		}
		String strNum=String.format("2021%03d", intNum);
		/* 생성한 strNum에 저장된 학번이 scorList에 있는지 확인
		 */
		int index=0;
		// index는 0~scoreList.size()-1 반복하는 과정에서
		// 0~scoreList.size()-1에 해당한값을 갖게된다
		for(index=0;index<scoreList.size();index++) {
			ScoreVO vo=scoreList.get(index);
			if(vo.getNum().equals(strNum)) {
				break;
			}
		}
		// for ()반복문이 모두 정상종료되었는지?:index>=size()
		// 아니면 중간에 중단되고 빠져나왔는지? : index<size()
		// for 중간에 break만났다. break가 실행됬다
		// ==이미 등록된 학번이있다
		if(index<scoreList.size()) {
			System.out.println(strNum+"이미 등록됨");
			continue;
			//다시 입력받으러 가기
		}
		return strNum;
	}
	}
}

	

	

	/*private String inputNum() {
		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return null;
		}
		String strNum = String.format("2021%03d", intNum); // 2021001
		if(inputNum(strNum)) {
			continue;
		}
				
		
		return strNum;
	}
	

	public void inputScore(String num) {
		while (true) {
			String strNum = this.inputNum();
			if (strNum == null) {
				return;
			}
			for (int i = 0; i < scoreList.size(); i++) {
				if (scoreList.get(i) == scoreList.get(i)) {
					System.out.println("이미 존재");
					this.inputScore(num);
				}else {
					
					
				}
			}

		}
	}
	*/

