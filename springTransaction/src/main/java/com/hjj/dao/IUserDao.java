package com.hjj.dao;

import com.hjj.model.User;

/**
 * @author PC
 */
public interface IUserDao {
	/**
	 * 查询
	 *
	 * @return User
	 * @param id id
	 */
	User select(Long id);

	/**
	 * 新增
	 *
	 * @param user 用户
	 */
	void insert(User user);

	/**
	 * 删除
	 *
	 * @param id id
	 */
	void delete(Integer id);

	/**
	 * 更新
	 *
	 * @param user 用户
	 */
	void update(User user);
}
