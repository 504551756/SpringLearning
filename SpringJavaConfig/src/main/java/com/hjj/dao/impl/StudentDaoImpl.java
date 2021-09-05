package com.hjj.dao.impl;

import com.hjj.dao.IStudentDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@PostConstruct
	public void init(){
		System.out.println("生命周期回调");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("销毁");
	}

	@Override
	public void getStudent() {
		System.out.println("查询数据库");
	}
}
