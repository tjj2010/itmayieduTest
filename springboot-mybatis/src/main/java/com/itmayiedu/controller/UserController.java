
package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/insert")
	public String insert(String name, Integer age) {
		userService.insert(name, age);
		return "success";
	}

	@RequestMapping("/findByName")
	public User findByName(String name) {
		return userService.findByName(name);
	}

}
