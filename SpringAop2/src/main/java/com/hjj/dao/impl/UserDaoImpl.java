package com.hjj.dao.impl;

import com.hjj.dao.IUserDao;
import com.hjj.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author PC
 */
@Repository
public class UserDaoImpl implements IUserDao {
	@Override
	public User select(Integer id) throws Exception {
		if (id == null) {
			throw new Exception("id 为 null");
		}
		System.out.println("查询数据库");
		User user = new User();
		user.setId(1);
		user.setAge(11);
		user.setName("啦啦啦");
		return user;
	}

	@Override
	public void insert(User user) throws Exception {
		if (user == null) {
			throw new Exception("user 为 null");
		}
		System.out.println("插入数据库");
	}

	@Override
	public void delete(Integer id) throws Exception {
		if (id == null) {
			throw new Exception("id 为 null");
		}
		System.out.println("删除数据库");
	}

	@Override
	public void update(User user) throws Exception {
		if (user == null) {
			throw new Exception("user 为 null");
		}
		System.out.println("更新数据库");
	}
}
