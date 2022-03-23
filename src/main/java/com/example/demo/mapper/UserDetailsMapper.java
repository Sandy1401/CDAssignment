package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.dto.UserDetailsDto;
import com.example.demo.model.UserDetails;

@Mapper(componentModel = "spring")
public interface UserDetailsMapper {
	

	UserDetailsDto toUserDetailsDto(UserDetails userDetails);
	
	UserDetails toUserDetails(UserDetailsDto userDetailsDto);
	
	List<UserDetailsDto> entityListToDtoList(Iterable<UserDetails> iterable);
	
	List<UserDetails> DtoListToEntityList(Iterable<UserDetailsDto> userDetailsDto);
	
}
