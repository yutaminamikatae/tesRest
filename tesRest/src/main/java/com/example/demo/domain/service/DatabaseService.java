package com.example.demo.domain.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entity.UserEntity;
import com.example.demo.domain.mapper.DatabaseMapper;

@Service
public class DatabaseService {

	@Autowired
	private DatabaseMapper databaseMapper;

	@Transactional
	public UserEntity findOne(UserEntity userEntity) {
		return databaseMapper.findOne(userEntity);
	}

}
