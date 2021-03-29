package com.callor.apps.model;

/* ScoreVO 클래스 선언문
 * ScoreVO 클래스 에는 5개의 변수가 포함되어있고
 * 이 5개의 변수는 반드시 ScoreVO 클래스를 객체로 선언한후 사용할수있다.
 */
public class ScoreVO {
	
	/* 현재 ScoreVO클래스에는 7개의 변수와 2개의 method가 설계되어 있는 상태
	 * 이 클래스를 사용하여 만들어진 객체에는 
	 * 7개의 변수와 2개의 method가 포함된 상태로 완성이 된다
	 * 
	 * 한번 객체로 생성이되면 내부의 변수들은 절대 다른 데이터와 혼동되거나 하지않는다
	 */

	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	/* kor eng math 변수는 사용자에 의해 main()mathod에서 
	 * 사용자에 의해 값을 저장하기 위한 변수이다
	 * 
	 * total avg는 3과목의 점수를 사용하여 연산한후 
	 * 연산결과를 저장하기 위한 변수이다
	 * 
	 * kor eng math 는 어디에서든지 저장 읽기가 가능한 상태이어야하므로
	 * public으로 선언을한다.
	 * 
	 * 그런데 total avg변수도 public으로 선언을 해두었더니 실제 계산된 결과와 상관없이 
	 * 임의의 값을 저장할수 있게 되었다
	 * 코드가 진행되는 과정에서 total에 임의의 값이 저장되면 
	 * 평균값이 엉뚱하게 계산이 되는 결과가 나타난다
	 * 이런경우 total avg변수를 임의로 수정(저장)하지 못하도록 막는 장치가 필요하다
	 * 
	 * VO 클래스의 맴버변수를 private로 선언하면 다른곳에서 객체를통해 직접접근이 불가능해진다
	 * 
	 * total avg를 private로 선언하면 누구도 직접 total avg에 값을 저장할수없다
	 * 
	 * total avg변수에 담긴 값을 객체를 통해 읽기하기 위해 getTotal() getAvg() method를 만들어두었다
	 * 
	 * 이제부터 total avg 변수는 저장기능은 되지않고 
	 * getTotal() getAvg() 메서드를 통해 읽기만 가능한 상태가 되었다.
	 */
	private int total;
	private float avg;
	
	public int getTotal() {
		this.total=this.kor+this.eng+this.math;
		return this.total;
	}
	
	public float getAvg() {
		
		//int intTotal=this.getTotal();
		int intTotal=this.total;
		float floatAvg= (float)intTotal/3;
		return(float)this.getTotal()/3;
	}
	
}
