package com.hjj;

import com.alibaba.druid.pool.DruidDataSource;
import com.hjj.model.MyImportSelector;
import com.hjj.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.hjj")
@PropertySource("classpath:db.properties")
@Import({MyImportSelector.class})
public class IocJavaConfig {
	@Value("${mysql.username}")
	private String name;

	@Value("${mysql.password}")
	private String password;

	@Value("${mysql.url}")
	private String url;

	@Value("${mysql.driverClassName}")
	private String driverClassName;

	/**
	 * 方法名为BeanId
	 * 自己实例化bean交给Spring
	 * 自动将返回值作为Bean的类型
	 * 设置别名（可以多个）：@Bean(name="")
	 *
	 * @return DruidDataSource
	 */
	@Bean
	public DruidDataSource dataSource(Student student02) {
		// 自动注入外部bean测试
		// 内部Bean直接调用即可
		System.out.println(student02);

		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setName(name);
		druidDataSource.setPassword(password);
		druidDataSource.setUrl(url);
		druidDataSource.setDriverClassName(driverClassName);
		return druidDataSource;
	}
}
