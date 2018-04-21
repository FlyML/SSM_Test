package com.ml.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ml.service.StudentService;

@Controller
@RequestMapping("/student1")
public class StudentController {
	@Autowired
	private StudentService ss;
	
	@RequestMapping("/all1")
//	@ResponseBody
	public String selectAll(Map<String,Object> map) {
		System.out.println("我是StudentController类");
		map.put("list", ss.selectAll());
		System.out.println("bind");
		return "index";
	}
}
