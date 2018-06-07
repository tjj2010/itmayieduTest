
package com.itmayuiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itmayiedu.service.UserService;

@Controller
public class IndexController {
	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String index() {
		System.out.println("this is index...");
		return "index";
	}

	@ResponseBody
	@RequestMapping("/add")
	public String add(String name, Integer age) {
		userService.add(name, age);
		return "succes";
	}

}
