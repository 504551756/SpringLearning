package com.hjj.annotation.service.impl;

import com.hjj.annotation.dao.IStudentDao;
import com.hjj.annotation.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao studentDao;
	@Override
	public void getStudent() {
		studentDao.getStudent();
	}
}
