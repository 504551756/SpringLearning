package com.hjj.controller;

import com.hjj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController{

	@Autowired
	private IStudentService studentService;

	public void getStudent(){
		studentService.getStudent();
	}
}
