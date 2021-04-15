package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.inpl.ScoreServiceImplV1;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		/* 아직 ScoreServiceImplV1 클래스의 method들은
		 * 코드가 구체적으로 구현되지 않았다
		 * method는 만들어져있지만 코드가 아직 미완성이다
		 * 
		 * 이런상황에 다른 팀원이 ScoreServiceImplV1클래스의 method를
		 * 호출하는 코드를 작성했을때 
		 * 1. method가 없어서 발생하는 문법 오류는 없고
		 * 2. 언젠가는 호출할 method코드가 구현될것임을 약속받은 상태이다
		 * 3. 따라서 ScoreSerivceimplV1의 method를 호출하는 코드는 잠시 만들어두고
		 * 이후 코드에 집중하여 코딩을 계속 할수있다
		 */
		ScoreService sService=new ScoreServiceImplV1();
		
		sService.inputScore();
		sService.printScore();
		sService.saveScore();
		
		if(sService.checkScore()==0){
			// checkScore()가 0을 return하면 수행할코드
	}else {
		// 그렇지 않을경우 수행할코드
		}
	}

}
