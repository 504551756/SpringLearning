package com.hjj.service.impl;

import com.hjj.dao.IStudentDao;
import com.hjj.service.IStudentService;
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
