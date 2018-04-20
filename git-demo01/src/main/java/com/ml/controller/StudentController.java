package com.ml.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ml.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService ss;
	
	@RequestMapping("/all")
	public String selectAll(Map<String,Object> map) {
		map.put("list", ss.selectAll());
		return "index";
	}
}
