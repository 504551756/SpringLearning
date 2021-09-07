package com.hjj;

import com.hjj.model.User;
import com.hjj.service.IUserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTest {
	private ClassPathXmlApplicationContext context;

	@BeforeEach
	public void before() {
		context = new ClassPathXmlApplicationContext("spring.xml");
	}

	@Test
	public void test01() {
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		Long count = jdbcTemplate.queryForObject("select count(*) from user where id = 1", Long.class);
		System.out.println(count);
	}

	@Test
	public void test02() {
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		// 数据库名和字段名一样
		User user = jdbcTemplate.queryForObject("select * from user where id = 1",
				new BeanPropertyRowMapper<>(User.class));
		System.out.println(user);
	}

	@Test
	public void test03() {
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		User user = jdbcTemplate.queryForObject("select * from user where id = 1",
				((resultSet, i) -> {
					User user1 = new User();
					user1.setId(resultSet.getLong("id"));
					user1.setName(resultSet.getString("name"));
					user1.setAge(resultSet.getInt("age"));
					return user1;
				}));
		System.out.println(user);
	}

	@Test
	public void test04() {
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		// 数据库名和字段名一样
		List<User> user = jdbcTemplate.query("select * from user",
				new BeanPropertyRowMapper<>(User.class));
		System.out.println(user);
	}

	@Test
	public void test05() {
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		// 数据库名和字段名一样
		int result = jdbcTemplate.update("insert into user(name, age) values (?,?)",
				"小刚", 15);
		System.out.println(result);
	}

	@Test
	public void test06() {
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		// 数据库名和字段名一样
		int result = jdbcTemplate.update("update user set age = ? where name = ?",
				16, "小刚");
		System.out.println(result);
	}

	@Test
	public void test07() {
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		// 数据库名和字段名一样
		int result = jdbcTemplate.update("delete from user where name = ?",
				"小刚");
		System.out.println(result);
	}

	@Test
	public void test08() {
		test04();
		IUserService userService = context.getBean("userServiceImpl", IUserService.class);
		// 数据库名和字段名一样
		userService.trans();
		test04();
	}
}
