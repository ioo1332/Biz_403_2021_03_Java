package com.callor.app.service;

public interface ScoreService {
	
	/* interface 
	 * 클래스를 만들기 위한 설계도 prototype 역할수행
	 * 팀 프로젝트 클래스를 여러 팀원이 같은 연산을 수행하는
	 * 클래스를 만들때 method이름을 통일하여 이후 프로젝트를 통합할때
	 * 발생하는 오류를 최소화하기 위함이다
	 * 
	 * interface를 implements한 클래스는 
	 * interface에 지정된 method를 반드시 구현해야한다
	 * 
	 * interface 와 관련된 클래스를 사용하여 객체를 생성한후 method를 호출하는 코드를 통해
	 * 연산을 수행하는 측에서는 아직 method코드가 구현이 덜 되었더라도
	 * 자신의 코드를 진행할수있도록한다
	 */
	
	public void selectMenu();
	public void inputScore();
	public void printScore();
	public void saveScore();
	
	public void readScore();
	public Integer checkScore();

}
