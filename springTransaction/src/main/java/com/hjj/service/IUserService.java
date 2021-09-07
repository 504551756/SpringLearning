package com.hjj.service;

import com.hjj.model.User;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	void trans();
}
