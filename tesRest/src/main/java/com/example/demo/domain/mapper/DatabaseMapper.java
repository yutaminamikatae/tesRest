package com.example.demo.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.entity.UserEntity;


@Mapper
public interface DatabaseMapper {

	@Select("SELECT * FROM user WHERE id = #{id} AND name = #{name}")
	public UserEntity findOne(UserEntity userEntity);

}
