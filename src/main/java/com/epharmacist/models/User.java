package com.epharmacist.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity 
@Table(name="auth_user")
public class User {
	
	@Id
	@Email
	@NotEmpty
	@Column(name="email")
	private String email;
	
	@NotEmpty
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="age")
	private Integer age;
	
	@NotEmpty
	@Column(name="nationality")
	private String nationality;
	
	@Size(min = 4)
	@Column(name="password")
	private String password;
	
	@NotEmpty
	@Column(name="validDoc")
	private String validoc;
	
	@Column(name="status")
	private String status;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="auth_user_role", joinColumns=@JoinColumn(name="auth_user_email", referencedColumnName="email"), inverseJoinColumns=@JoinColumn(name="auth_role_name", referencedColumnName="role_name"))
	private List<Role> roles;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getValidoc() {
		return validoc;
	}

	public void setValidoc(String validoc) {
		this.validoc = validoc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public User(Integer Age, String name,String nationality,String password,String docx, String email) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.nationality=nationality;
		this.age=Age;
		this.validoc=docx;
	}

	public User() {

	}
}
