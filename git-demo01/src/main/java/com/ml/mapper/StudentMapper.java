package com.ml.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ml.entity.Student;

@Mapper
public interface StudentMapper {
	
	@Select("select * from student")
	List<Student> selectAll();
	
	Student selectByPrimaryKey(Integer id);
	
	int deleteByPrimaryKey(Integer id);
	
	int insertSelective(Student stu);
	
	int updateByPrimaryKeySelective(Student stu);
}
