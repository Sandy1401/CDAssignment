package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer>{


	Iterable<UserDetails> findByUserName(String userName);

}
