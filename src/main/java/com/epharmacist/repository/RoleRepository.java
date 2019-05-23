package com.epharmacist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epharmacist.models.Role;

public interface RoleRepository extends JpaRepository<Role, String>{

}
