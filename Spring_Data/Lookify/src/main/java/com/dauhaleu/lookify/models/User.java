package com.dauhaleu.lookify.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;


//imports removed for brevity
@Entity
@Table(name="users")
public class User {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String email;
 
 @Size(min = 5, message = "Too short")
 private String password;
 
 private String name; 
 
 @Transient
 private String passwordConfirmation;
 @Column(updatable=false)
 private Date createdAt;
 private Date updatedAt;
 

public User() {
 }
 
 public User(User user) {
	 this.name = user.name;
	 this.email = user.email;
	 this.password = user.password;
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


public String getPasswordConfirmation() {
	return passwordConfirmation;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void setPasswordConfirmation(String passwordConfirmation) {
	this.passwordConfirmation = passwordConfirmation;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public Date getCreatedAt() {
	return createdAt;
}


public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}


public Date getUpdatedAt() {
	return updatedAt;
}


public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}


@PrePersist
 protected void onCreate(){
     this.createdAt = new Date();
 }
 @PreUpdate
 protected void onUpdate(){
     this.updatedAt = new Date();
 }
}
