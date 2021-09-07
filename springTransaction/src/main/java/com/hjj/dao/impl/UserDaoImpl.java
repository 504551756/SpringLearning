package com.hjj.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.hjj.dao.IUserDao;
import com.hjj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author PC
 */
@Repository
public class UserDaoImpl implements IUserDao {
	JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DruidDataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public User select(Long id) {
		return jdbcTemplate.queryForObject("select * from user where id = 1",
				new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public void insert(User user) {
		int result = jdbcTemplate.update("insert into user(name, age) values (?,?)",
				"小刚", 15);
	}

	@Override
	public void delete(Integer id) {
		int result = jdbcTemplate.update("delete from user where name = ?",
				"小刚");
	}

	@Override
	public void update(User user) {
		int result = jdbcTemplate.update("update user set age = ? where name = ?",
				16, "小刚");
	}

}
