package com.hjj.controller;

import com.hjj.model.User;
import com.hjj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author PC
 */
@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	public User select(Integer id) throws Exception {
		return userService.select(id);
	}

	public void insert(User user) throws Exception {
		userService.insert(user);
	}

	public void update(User user) throws Exception {
		userService.update(user);
	}

	public void delete(Integer id) throws Exception {
		userService.delete(id);
	}
}
