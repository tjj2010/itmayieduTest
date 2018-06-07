
package com.itmayiedu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(String name, Integer age) {
		String insertUserSQL = "insert into users values(null,?,?);";
		jdbcTemplate.update(insertUserSQL, name, age);
		System.out.println("添加成功...");
	}

}
