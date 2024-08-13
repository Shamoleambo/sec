package com.tidz.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tidz.sec.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String username);
}
