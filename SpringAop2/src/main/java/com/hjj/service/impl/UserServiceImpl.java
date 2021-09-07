package com.hjj.service.impl;

import com.hjj.dao.IUserDao;
import com.hjj.model.User;
import com.hjj.service.IUserService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author PC
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	@Logger(name = "test")
	public User select(Integer id) throws Exception {
		return userDao.select(id);
	}

	@Override
	public void insert(User user) throws Exception {
		userDao.insert(user);
	}

	@Override
	public void delete(Integer id) throws Exception {
		userDao.delete(id);
	}

	@Override
	public void update(User user) throws Exception {
		userDao.update(user);
	}
}
