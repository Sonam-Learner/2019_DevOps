package com.epharmacist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epharmacist.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
