package com.callor.method.service;

/* InputServiceV2 클래스를 이용해
 * subject{"국어","영어","수학"} 배열을 사용해
 * 국어 영어 수학 점수를 입력받고 변수에 저장
 * 0~100점 범위내에 입력
 * 총점 평균 구하기
 */
public class ScoreServiceV4 {
	/*
	 * 과목의 이름이 저장될 배열을 클래스영역에 선언 과목점수입력, 성적리스트 출력등에서 
	 * 사용하기때문에 맴버변수 영역, 클래스 영역에 선언
	 */
	protected String[] subject;
	protected InputServiceV2 inservice;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	/*
	 * 생성자 method ScoreServiceV4 클래스를 사용하여 객체를 생성할때 호출할 method
	 */
	public ScoreServiceV4() {
		// 생성자에 작성되는 코드
		// 맴버변수 영역에 선언된 변수,객체를 생성하는 코드
		// TODO Auto-generated constructor stub
		inservice = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };
	}

	// 키보드를 사용하여 3과목의 점수를 입력받는데
	// InputServiceV2에 선언된 method를 사용할예정이므로
	// 여기에서 키보드 등의 클래스,객체를 사용할 필요가없다
	public void inputScore() {
		/* 과목명을 배열로 선언한 이유는
		 * 점수를 입력받는 method 호출 코드를 한번만 작성하고
		 * for()반복문을 사용하여 처리할수있다
		 */
		// 과목의 점수를 저장할 score배열을 생성
		int[] scores=new int[subject.length];
		for(int i=0;i<subject.length;i++) {
			Integer score = inservice.inputValue(subject[i], 0, 100);
			if(score==null) {
				System.out.println("종료");
				/* break와 return 
				 * break를 실행하면for()반복문만 중단하고
				 * for() 반복문 이후의 코드를 실행한다
				 * for() 반복문 이후에 다른 연산(코드)를 수행할 필요가 있을때는 break
				 * 
				 * return을 실행하면 현재 method(inputScore())를 종료한다
				 * inputScore() method를 호출했던 코드로 되돌아간다
				 */
				//break를 쓰면 for다음명령 실행
				
				return; //main method로 가라
			}
			scores[i]=score; //return 받은 점수를 scores의 i번째 배열에 저장 (과목별 점수저장)
		}// for end
		// scores 배열에 담긴 점수를 총점계산
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		// 과목의 개수만큼 값으로 평균을 계산
		float avg = (float)sum/subject.length;
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);

	}

}
