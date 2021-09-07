package com.hjj.service;

import com.hjj.model.User;

/**
 * @author PC
 */
public interface IUserService {
	/**
	 * 查询
	 *
	 * @param id id
	 * @return User
	 */
	User select(Integer id) throws Exception;

	/**
	 * 新增
	 *
	 * @param user 用户
	 */
	void insert(User user) throws Exception;

	/**
	 * 删除
	 *
	 * @param id id
	 */
	void delete(Integer id) throws Exception;

	/**
	 * 更新
	 *
	 * @param user 用户
	 */
	void update(User user) throws Exception;
}
