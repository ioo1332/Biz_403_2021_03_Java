package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_05 {

	public static void main(String[] args) {
		
		/* 변수는 배열로 생성을 하면
		 * 개별요소들이 모두 자동으로 초기화된다
		 */
		int []nums=new int[10];
		System.out.println(nums[0]);
		
		/* 클래스를 사용한 객체 배열은 생성을 하여도
		 * 개별요소들이 자동으로 초기화 되지 않는다
		 */
		
		// 배열초기화
		ScoreVO[] scores=new ScoreVO[5];
		// 0번요소 초기화
		// 객체 배열은 사용(저장,읽기)를 시도하기전
		// 개별요소를 반드시 생성(초기화) 해주어야 한다
		scores[0]=new ScoreVO();
		scores[0].name="홍길동";
		scores[0].kor=90;
		scores[0].eng=80;
		scores[0].math=100;
		System.out.println(scores[0].getTotal());
		System.out.println(scores[0].getAvg());
		
		//전체 배열요소를 모두 초기화하는 코드
		for (int i=0;i<scores.length;i++) {
			scores[i]=new ScoreVO();
		}
			System.out.println(scores[1].kor);
	}
	
}
