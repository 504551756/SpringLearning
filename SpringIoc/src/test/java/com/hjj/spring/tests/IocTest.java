package com.hjj.spring.tests;

import com.hjj.spring.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	@Test
	public void test01() {
		// 注解 根据javaConfig 实例化spring容器
		// ApplicationContext context = new AnnotationConfigApplicationContext();
		// xml 根据项目路径的xml 实例化spring容器
		// 容器实例化时，会加载所有的bean
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
		System.out.println("加载Spring容器");
		// Student = context.getBean(Student.class);
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}
}
