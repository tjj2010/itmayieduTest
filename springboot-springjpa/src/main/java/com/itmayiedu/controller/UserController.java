
package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.dao.UserDao;
import com.itmayiedu.entity.User;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/index")
	public User index(Integer id) {
		User user = userDao.findOne(id);
		System.out.println(user.getName());
		return user;
	}
}
