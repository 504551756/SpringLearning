package com.hjj.service.impl;

import com.hjj.dao.IUserDao;
import com.hjj.model.User;
import com.hjj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author PC
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public User select(Long id) {
		return userDao.select(id);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}


	// 可以标记方法或者类，建议写在方法上
	@Transactional
	@Override
	public void trans(){
		update(new User());
		int i = 1 / 0;
	}
}
