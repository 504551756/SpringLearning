package com.hjj.proxy.service.impl;

import com.hjj.proxy.model.Student;
import com.hjj.proxy.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IStudentService {
	@Override
	public Student getStudent() {
		System.out.println("查询");
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
