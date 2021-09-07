package com.hjj.proxy.service;

import com.hjj.proxy.model.Student;

public interface IStudentService {
	Student getStudent();

	void addStudent();

	void updateStudent();

	void deleteStudent();
}
