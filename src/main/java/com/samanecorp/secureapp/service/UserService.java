package com.samanecorp.secureapp.service;

import java.util.List;

import com.samanecorp.secureapp.dao.IUserDao;
import com.samanecorp.secureapp.dao.UserDao;
import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.entities.UserEntity;
import com.samanecorp.secureapp.mapper.UserMapper;

public class UserService implements IUserService {

	private IUserDao userDao = new UserDao();
	@Override
	public List<UserDto> getAll() {
		
		return UserMapper.listUserEntityToListUserDto(userDao.list(new UserEntity()));
	}

	
}
