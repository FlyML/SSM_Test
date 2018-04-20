package com.ml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ml.entity.Student;
import com.ml.mapper.StudentMapper;
import com.ml.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper sm;
	
	@Override
	public List<Student> selectAll() {
		return sm.selectAll();
	}

	@Override
	public Student selectByPrimaryKey(Integer id) {
		return sm.selectByPrimaryKey(id);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return sm.deleteByPrimaryKey(id);
	}

	@Override
	public int insertSelective(Student stu) {
		sm.insertSelective(stu);
		return stu.getId();
	}

	@Override
	public int updateByPrimaryKeySelective(Student stu) {
		return sm.updateByPrimaryKeySelective(stu);
	}

}
