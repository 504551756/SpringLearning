package com.hjj.xml.tests;

import com.hjj.xml.model.Student;
import com.hjj.xml.model.Student2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
	private AbstractApplicationContext context;

	@BeforeEach
	public void before() {
		// 注解 根据javaConfig 实例化spring容器
		// ApplicationContext context = new AnnotationConfigApplicationContext();
		// xml 根据项目路径的xml 实例化spring容器
		// 容器实例化时，会加载所有的bean
		context = new ClassPathXmlApplicationContext("spring-ioc-xml.xml");
		System.out.println("加载Spring容器");
	}

	@Test
	public void test01() {
		// Student = context.getBean(Student.class);
		Student student = context.getBean("student", Student.class);
		// Student = context.getBean("student1", Student.class);
		System.out.println(student);
	}

	@Test
	public void test02() {
		// Student = context.getBean(Student.class);
		Student student = context.getBean("student2", Student.class);
		System.out.println(student);
	}


	@Test
	public void test09() {
		Student student = context.getBean("student9", Student.class);
		System.out.println(student);
	}

	@Test
	public void test2_01() {
		Student2 student = context.getBean("student20", Student2.class);
		System.out.println(student);
		context.close();
	}
}
