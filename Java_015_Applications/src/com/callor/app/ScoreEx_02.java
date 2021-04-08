package com.callor.app;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ScoreEx_02 {
	public static void main(String[] args) {

		InputServiceV1 inService = new InputServiceV1();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName("홍길동");
		

		/* 중요
		 * VO 객체에 데이터를 저장하고 List에 추가 하려고 하면 
		 * 먼저 VO객체를 다시 생성 해주어야 한다
		 */
		scoreVO = new ScoreVO();

	}
}