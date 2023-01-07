package com.tus.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tus.jpademo.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
