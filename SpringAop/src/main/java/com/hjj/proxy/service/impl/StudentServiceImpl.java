package com.hjj.proxy.service.impl;

import com.hjj.proxy.dao.IStudentDao;
import com.hjj.proxy.model.Student;
import com.hjj.proxy.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao studentDao;
	@Override
	public Student getStudent() {
		System.out.println("查询");
		studentDao.getStudent();
		return new Student();
	}

	@Override
	public void addStudent() {
		System.out.println("新增");
	}

	@Override
	public void updateStudent() {
		System.out.println("修改");
	}

	@Override
	public void deleteStudent() {
		System.out.println("删除");
	}
}
