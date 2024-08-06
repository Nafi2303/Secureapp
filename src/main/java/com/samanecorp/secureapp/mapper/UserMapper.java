package com.samanecorp.secureapp.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.entities.UserEntity;

public class UserMapper {

public static List<UserDto> listUserEntityToListUserDto(List<UserEntity> users) {   //la transformation d'une liste vers une autre liste
		
		return users.stream()
				.map(user -> toUserDto(user))  //pour chaque objet le user est recuperer convertie en userDto
				.collect(Collectors.toList());   //cree une collection pour lister tout les utilisateurs
	}
	
	
	public static UserDto toUserDto(UserEntity user) {
		
		return new UserDto(user.getId(), user.getEmail(), user.getPassword(), user.isState());
	}
	
	public static UserEntity toUserEtity(UserDto user) {
		
		return new UserEntity(user.getId(), user.getEmail(), user.getPassword(), user.isState());
	}
}
