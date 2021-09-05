package com.hjj.xml.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student2 implements InitializingBean, DisposableBean {
	private Long id;
	private String name;
	private Integer age;

	public Student2() {
		System.out.println("加载Student");
	}

	public Student2(Long id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.id = 0L;
		this.name = "st";
		System.out.println("实例化bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("销毁bean");
	}
}
