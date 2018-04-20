package com.ml.service;

import java.util.List;

import com.ml.entity.Student;

public interface StudentService {
	
	List<Student> selectAll();
	
	Student selectByPrimaryKey(Integer id);
	
	int deleteByPrimaryKey(Integer id);
	
	int insertSelective(Student stu);
	
	int updateByPrimaryKeySelective(Student stu);
}
