/* 계층적 패키지 구조
 * base-package : 프로젝트에서 처음의 3단계 패키지
 * com.callor.classes 
 * 프로젝트의 Id역할을 수행한다
 * 
 * service : main()method에서 수행할 연산들을 분산하여 작은코드로 만들기 위한 클래스들의 모음 service 클래스
 * model : data를 저장하는, 데이터를 보관하는 구조를 갖는 클래스 모음
 * VO (value ovject),DTO(Data Trans Object)
 */
package com.callor.classes.model;
/* 학생의 성적 처리를 하기위한 기본 데이터를 저장하여 연산하는곳으로 이동
 * 전달하는 용도의 객체를 만들기 위한 클래스
 * 
 * 학번,이름 등
 * 각 과목의 점수를 담을 변수 필요
 * 총점, 평균
 * 학년, 반, 학과, 연락처
 */
public class ScoreVO {
	
	public String num;
	public int kor; 
	public int eng;
	public int math;
	
	


}
