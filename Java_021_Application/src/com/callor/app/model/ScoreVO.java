package com.callor.app.model;

public class ScoreVO {

	private String strNum;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
	private Integer avg;
	private Integer total;
	/* 기본 생성자: 매개변수가 없는 생성자 super constructor
	 * 
	 * new DeckVO()처럼 호출
	 * 만약 클래스를 정의하고 아무런 생성자를 만들지 않으면 기본생성자는 자동으로 만들어져
	 * 언제든지 객체를 생성할때 호출할수 있다
	 * 
	 * 하지만 매개변수가 (한개라도)있는 생성자를 만들면 기본생성자는 만들어지지 않는다
	 */
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	/* 필드(맴버)변수를 매개변수로 갖는 생성자
	 * Field Constructor
	 * new DeckVO(값~~) 처럼 호출
	 */
	
	public ScoreVO(String strNum, Integer kor, Integer eng, 
			Integer math, Integer avg, Integer total) {
		super();
		this.strNum = strNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.total = total;
	}

	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg
				+ ", total=" + total + "]";
	}
	

}
