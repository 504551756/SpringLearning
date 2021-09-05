package com.hjj.xml.tests;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mysqlTest {
	private AbstractApplicationContext context;

	@BeforeEach
	public void before() {
		// 注解 根据javaConfig 实例化spring容器
		// ApplicationContext context = new AnnotationConfigApplicationContext();
		// xml 根据项目路径的xml 实例化spring容器
		// 容器实例化时，会加载所有的bean
		context = new ClassPathXmlApplicationContext("spring-ioc-mysql.xml");
		System.out.println("加载Spring容器");
	}

	@Test
	public void test01() {
		DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
		System.out.println(dataSource);
		context.close();
	}


}
