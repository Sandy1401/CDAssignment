package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDetailsDto;

public interface UserService {

	UserDetailsDto createUser(UserDetailsDto userDetailsDto);
	
	List<UserDetailsDto> getUserDetailsByUserName(String userName);

}
