package com.epharmacist.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="auth_role")
public class Role {
	
	@Id
	@Column(name="role_name")
	private String role_name;

	
	@ManyToMany(mappedBy = "roles")
	private List<User> users;

	public String getRole_name() {
		return role_name;
	}


	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Role( String name, List<User> users ) {
		this.role_name = name;
		this.users = users;
	
	}

	public Role() {}
	public Role(String name) {
		this.role_name=name;
	}
	

	

}
