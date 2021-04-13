package com.callor.score.servcie.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2 {
		//v1 v2로부터 다음 method를 상속받은 상태
		//selectMunu intputScore printScore saveScore
		//readScore
		
	@Override
	/* 
	 * 
	 */
	public void readScore() {
		String readFile="/src/com/callor/score/sample_score.txt";
		
		FileReader fileReader=null;
		BufferedReader buffer =null;
		/* List에 있는 removeAll method는 두개의 리스트에 중복된 데이터가 있으면
		 * 중복된 데이터를 삭제하는 method
		 * List type의 데이터를 추가 하고자 할땐 기존의 데이터를 삭제하고 추가를 해야한다
		 * 이때 사용할수있는 코드
		 * 
		 * 파일이나 데이터 베이스에서 데이터를 가져와서 List에 반영하고자 할때 먼저 실행해주는 코드
		 */
		scoreList.removeAll(scoreList);
		
		try {
			fileReader=new FileReader(readFile);
			buffer=new BufferedReader(fileReader);
			while(true) {
				String reader=buffer.readLine();
				// if조건문에 대하여 실행할 명령문이 
				// 한줄만 있을경우
				// {} 생략하고 명령문을 사용할수있다
				if(reader==null)break;
				
				String[] scores=reader.split(";");
				Integer intKor=Integer.valueOf(scores[1]);
				Integer intEng=Integer.valueOf(scores[2]);
				Integer intMath=Integer.valueOf(scores[3]);
				ScoreVO scoreVO=new ScoreVO();
				scoreVO.setNum(scores[0]);
				scoreVO.setKor(intKor);
				scoreVO.setEng(intEng);
				scoreVO.setMath(intMath);
				scoreList.add(scoreVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
