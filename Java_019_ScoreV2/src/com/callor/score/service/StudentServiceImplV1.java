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
 * student.txt파일을 읽어 학생정보를 추출한후 List<StudentVO>studentList에 추가
 * StudentServiceImplV1생성자에서 loadStudent를 호출자동으로 학생 정보 생성
 */
public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	protected Scanner scan;
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 학과 = 3;
	protected final int 주소 = 4;
	protected StudentService inService;
	
	public StudentServiceImplV1() {
		// TODO Auto-generated constructor stub
		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
		this.loadStudent();

	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		String studentFile = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;
				String student[] = reader.split(":");

				StudentVO stVO = new StudentVO();
				stVO.setNum(student[학번]);
				stVO.setName(student[이름]);
				stVO.setGrade(student[학년]);
				stVO.setDept(student[학과]);
				stVO.setAddress(student[주소]);
				studentList.add(stVO);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}
	@Override
	public StudentVO getStudent(String num) {
		// getStudent 메서드에 학생의 학번을 파라메터로 전달하고 studentList에서 해당학번 학생찾기
		// 학생정보가 있으면 해당학생의 VO정보를 return 없으면 null 을 return
	

			
		
		
		
		
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		int nSize=studentList.size();
		
	}


}
