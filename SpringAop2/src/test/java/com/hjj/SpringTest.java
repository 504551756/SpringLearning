package com.hjj;

import com.hjj.controller.UserController;
import com.hjj.service.IUserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	ClassPathXmlApplicationContext context;

	@BeforeEach
	public void before(){
		context = new ClassPathXmlApplicationContext("spring.xml");
	}

	@Test
	public void test() throws Exception {
		// 实现了接口：JDK动态代理
		IUserService bean = context.getBean("userServiceImpl", IUserService.class);
		System.out.println(bean.getClass());
		bean.select(1);
		// 没有实现接口：cglib动态代理
		UserController userController = context.getBean("userController", UserController.class);
		System.out.println(userController.getClass());
		userController.select(1);
	}
}
