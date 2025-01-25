package com.matheusalatxeve.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusalatxeve.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
