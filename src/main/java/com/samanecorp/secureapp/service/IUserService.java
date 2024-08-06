package com.samanecorp.secureapp.service;

import java.util.List;

import com.samanecorp.secureapp.dto.UserDto;

public interface IUserService {

	public List<UserDto> getAll();
}
