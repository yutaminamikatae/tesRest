package com.example.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.entity.UserEntity;
import com.example.demo.domain.service.DatabaseService;

@RestController
public class DatabaseController {

	@Autowired
	private DatabaseService databaseService;

	@RequestMapping(path = "/api/user", method = RequestMethod.POST)
	public UserEntity login(@RequestBody UserEntity userEntity) {
		UserEntity entity = new UserEntity();
		entity = databaseService.findOne(userEntity);
		return entity;
	}

	@RequestMapping(path = "/api", method = RequestMethod.GET)
	public String test() {
		return "hello";
	}

}
