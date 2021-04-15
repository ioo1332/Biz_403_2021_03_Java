package com.callor.score.service;

import com.callor.score.model.StudentVO;

public interface StudentService {
	
	public void insertStudent();
	public void loadStudent();
	// 학번으로 학새정보를 검색하여
	// 학생 정보가 담긴 VO를 return하는 method
	public StudentVO getStudent(String num);
	public void printStudent();
}