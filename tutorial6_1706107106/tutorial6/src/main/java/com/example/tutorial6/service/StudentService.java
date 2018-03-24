package com.example.tutorial6.service;

import java.util.List;

import com.example.tutorial6.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	List<StudentModel> selectAllStudents();
	boolean addStudent(StudentModel student);
	boolean deleteStudent(String npm);
	boolean updateStudent(StudentModel student);
}
