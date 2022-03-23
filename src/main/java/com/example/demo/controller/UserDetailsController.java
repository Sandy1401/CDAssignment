package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDetailsDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/v1")
public class UserDetailsController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public String getDetails() {
		return "Hello World";
	}
	
	
	@GetMapping("/userDetails")
	public ResponseEntity<List<UserDetailsDto>> getAllTutorials(@RequestParam(required = false) String userName) {
		try {
			return new ResponseEntity<>(userService.getUserDetailsByUserName(userName), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/userInfo")
	public ResponseEntity<UserDetailsDto> createUser(@RequestBody UserDetailsDto userDetailsDto) {
		try {
			return ResponseEntity.ok(userService.createUser(userDetailsDto));
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
