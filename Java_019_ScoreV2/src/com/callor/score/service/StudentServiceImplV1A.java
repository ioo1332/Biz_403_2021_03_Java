package com.callor.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentVO;

/* StudentService 인터페이스를 implements 하여 클래스 작성
 * student.txt 파일을 읽어 학생 정보를 추출한후 List<StudentVO>studentList에 추가
 * StudentServiceImplV1생성자에서 loadStudent를 호출자동으로 학생 정보 생성
 */
public class StudentServiceImplV1A implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;
	protected Scanner scan;
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 학과 = 4;
	protected final int 주소 = 5;

	/* new studentServiceImplV1 생성자를 호출하여 
	 * 객체를 생성하려고 하면
	 * 고정된 파일이름을 사용하여 파일을 읽을수있도록할예정
	 * 생성자에서는 new StudentServiceImplV1의 생성자 method를 호출하는구조가된다
	 */
	public StudentServiceImplV1A() {
		// TODO Auto-generated constructor stub
		//여기에서 다음 생성자 메서드를 또 한번 생성
		this("src/com/callor/score/student.txt");
		scan = new Scanner(System.in);
		
	}
	
	public StudentServiceImplV1A(String fileName) {
		this.studentFile=fileName;
		studentList = new ArrayList<StudentVO>();
		// 클래스를 객체로 생성할때 method를 호출하여
		// 데이터를 사용하도록 준비해달라
		this.loadStudent();
		
		
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				// 파일로부터 읽은값이 null이다
				// end of file에 다다랐다
				if (reader == null)
					break;
				String sts[] = reader.split(":");

				StudentVO stVO = new StudentVO();
				stVO.setNum(sts[학번]);
				stVO.setName(sts[이름]);
				stVO.setGrade(sts[학년]);
				stVO.setDept(sts[학과]);
				stVO.setAddress(sts[주소]);
				// 디버깅 코드
				//System.out.println(StudentVO.toString());
				studentList.add(stVO);
				
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(this.studentFile+"파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일을 읽는동안 문제 발생");
		}

	}
	@Override
	public StudentVO getStudent(String num) {
		// getStudent 메서드에 학생의 학번을 파라메터로 전달하고 studentList에서 해당학번 학생찾기
		// 학생정보가 있으면 해당학생의 VO정보를 return 없으면 null 을 return
		
		// 1번코드
		int nSize=studentList.size();
		for(int i=0;i<nSize;i++) {
			// int num;
			// num=100;
			// int num=100;
			
			// student vo=null;
			// vo=studentList.get(i);
			StudentVO vo=studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		// return null;
		
		// 2번코드
		// 새로운 for which
		for(StudentVO vo:studentList) {
			if(vo.getNum().equals(num))return vo;
			
		}
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t주소");
		System.out.println("-".repeat(50));
		/* 배열을 사용하여 for반복문을 사용할때는
		 * 배열.length를 직접 반복문의 조건으로 설정한다
		 * i<배열.length
		 * 
		 *  list객체는 특성상 수시로 데이터의 개수가 변경된다
		 *  list에 담긴 개수를 알려주는 size()method는 호출될때마다
		 *  list에 담긴 데이터 개수를 다시 헤아리는 코드가 실행된다
		 *  
		 *  for반복문내에서 i<list.size코드를 사용하면 
		 *  for 반복문이 반복되는동안 계속해서 개수를 헤아리게 된다
		 *  데이터의 개수가 몇개 안될때는 문제가 없지만
		 *  데이터 개수가 많아지면 그만큼 성능이 떨어진다
		 *  
		 *  list전체를 for 반복문을 사용하여 순회할때는 
		 *  먼저size값을 int 형 변수에 담아놓고 시작하자
		 */
		int nSize=studentList.size();
		for(int i=0;i<nSize;i++) {
			StudentVO vo=studentList.get(i);
			System.out.println(vo.getNum()+"\t");
			System.out.println(vo.getName()+"\t");
			System.out.println(vo.getDept()+"\t");
			System.out.println(vo.getGrade()+"\t");
			System.out.println(vo.getAddress()+"\n");
		}
		System.out.println("=".repeat(50));
	}


}
