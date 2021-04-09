package com.callor.app.service.impl;
/*
 * v2는 v1상속받고
 * v3는 v2를 상속받고
 * v3는 v1을 상속받고 v2의 재 정의된 inputNum()를 상속받는 효과가 된다.
 * 즉 v3는 v1에 구현된 객체 변수 method를 모두 물려받으면서 
 * v2에서 새롭게 작성한 inputNum()을 상속받아서 사용하고있다
 */

public class ScoreServiceImplV3 extends ScoreServiceImplV2{

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("빛나라 고교 성적처리 V3");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적 등록");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("3. 성적 파일에 저장");
			System.out.println("QUIT 업무 종료");
			String strM=scan.nextLine();
			if(strM.equals("QUIT")) {
				break;
			}
			try {
				intM=Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("");
				this.ScoreToFile();
			} 
		}
		System.out.println("휴일 잘보내ㅐ세요");
	}
//입력된 성적 리스트 파일에 저장하기
	protected void ScoreToFile() {
		
	}
}
