package com.callor.score.model;

/* 데이터를 담아서 정보 처리를 수행할때 편리하게 데이터를 묶어서 관리하기 위한 클래스
 * VO를 만드는 작업을 데이터 모델링(설계) 이라고 한다
 * 추상화,정보은닉,캡슐화,재정의
 * 
 * 모델링된 scoreVO를 사용할때는 객체로 생성하여 사용한다
 * ScoreVO scoreVO=new ScoreVO() 
 * 필요할때마다 객체로 생성하고 데이터를 setter하고
 * 연산을 수행한후 getter하는 방식으로 활용한다
 * 
 * DB항목에서는 entity 모델링 이라고 한다
 * 모델링된 entity를 data table로 생성하여 사용한다
 * 한번 Table을 생성하고 영구적으로 사용한다
 */
public class ScoreVO {
	
	private String num;
	private String name;
	/* VO클래스에 숫자형변수를 선언할때 primitive 형이 아닌 
	 * wrapper클래스형으로 선언할땐 0으로 clear해주자
	 * 이러한 불편을 방지하기위하여 primitive형으로 만들기도 하지만
	 * null값을 취급하기가 어려운 단점이 발생한다.
	 */
	private Integer kor=0;
	private Integer eng=0;
	private Integer math=0;
	
	//private Integer total;
	//private Float avg;
	
	/* VO클래스를 모델링하고 : 추상화
	 * 변수를 은닉하였다 (private) : 정보은닉
	 * 은닉된 변수에 접근하기위하여 getter setter 생성
	 * 
	 * getter와 setter생성하고 봤더니
	 * 총점과 평균은 점수가 입력되면 항상 계산 되어야하는 항목이다
	 * 외부에서 이 값을 저장할일이 별로 없다 
	 * total avg 값을 요청하면 계산하여 return 하면될것같다
	 *  
	 * total avg 변수를 삭제하고
	 * total avg setter method를 제거
	 * total avg 변수의 getter method를 변경한다
	 * 과목 총점과 과목 평균을 계산하여 return 할수 있도록
	 * 
	 */

	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	/* 캡슐화
	 * 외부에서 객체.getTotal()method를 호출하면
	 * 과목의 총점을 return 받을수있다
	 * 
	 * 실제코드는 3과목의 총점을 계산하고 계산된 결과를 return하는 구조로 되어있다
	 * 
	 * 하지만 외부에서는 실제코드가 어떻게 작동되는지 몰라도 또는 관심갖지않아도 상관없이
	 * getTotal method는 당연히 잘 계산된 총점결과를 알려준다는것을 알고있다
	 * 
	 * 이렇게 내부코드를 감추고 (외부에 노출하지않고) 기능을 충실히 수행할수있도록하는것
	 */
	public Integer getTotal() {
		Integer total=this.kor+this.eng+this.math;
		return total;
	}

	public Float getAvg() {
		Float avg=(float)this.getTotal()/3;
		return avg;
	}
	
	/* tostring method는 object클래스에 정의 되어있으며 
	 * 모든 클래스는 자동적으로  object클래스를 상속받는다
	 * 
	 * 따라서 ScoreVO클래스는 자동적으로 tostring method 가 있는거처럼 동작한다
	 * 
	 * 하지만 object클래스에 정의된 tostring method는 사용하는데 의미가없다
	 * 
	 * 그래서 toString method를 VO객체 변수에 담긴 값들을 문자열로 만들어
	 * return하는 코드로 다시 작성을한다
	 * 이제 vo객체.toStirng method를 호출하면 vo객체의 변수들에 담긴값이 출력된다
	 * 
	 */
	@Override
	public String toString() {
		return "ScoreVO [num=" + num  
				+", name=" + name 
				+ ", kor=" + kor 
				+ ", eng=" + eng 
				+ ", math=" + math 
				+",total="+this.getTotal()
				+",avg="+this.getAvg()+"]";
	}
	
	
	}
