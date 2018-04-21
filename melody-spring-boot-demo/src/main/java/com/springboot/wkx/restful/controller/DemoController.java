package com.springboot.wkx.restful.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.wkx.modul.User;

@RestController
public class DemoController {

	@RequestMapping(value = "/getUser",method = RequestMethod.GET)
	public User getUser() {
		User user = new User();
		user.setAddress("112121");
		user.setAge("13rdgd");
		user.setEmail("152422@foxmail.com");
		user.setSex("man");
		user.setUsername("fjdkjfkdgj");
		return user;
	}
}
