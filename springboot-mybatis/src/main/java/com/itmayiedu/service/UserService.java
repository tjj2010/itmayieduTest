
package com.itmayiedu.service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.itmayiedu.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User findByName(String name) {
		return userMapper.findByName(name);

	}

	public int insert(String name, Integer age) {
		return userMapper.insert(name, age);

	}
}
