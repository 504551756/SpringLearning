package com.hjj;

import com.hjj.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SecondJavaConfig {
	@Bean
	public Student student01() {
		Student student = new Student();
		student.setName("heihei");
		return student;
	}

	@Bean
	public Student student02() {
		Student student = new Student();
		student.setName("heihei2");
		return student;
	}
}
