package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDetailsDto;
import com.example.demo.mapper.UserDetailsMapper;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserDetailsRepo;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Autowired
	 UserDetailsMapper userDetailsMapper;
	

	@Override
	@Transactional
	public UserDetailsDto createUser(UserDetailsDto userDetailsDto) {
        return userDetailsMapper.toUserDetailsDto(userDetailsRepo.save(userDetailsMapper.toUserDetails(userDetailsDto)));
	}

	@Override
	@Transactional
	public List<UserDetailsDto> getUserDetailsByUserName(String userName) {
		if(userName == null) 
			return userDetailsMapper.entityListToDtoList(userDetailsRepo.findAll());
		else {
			Iterable<UserDetails> userdetails= userDetailsRepo.findByUserName(userName);
			return userDetailsMapper.entityListToDtoList(userdetails);
		}
			
	}

}
