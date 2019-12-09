package com.dauhaleu.license.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class License {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Size(max = 2)
	private String state;
		

	private String ln;
	
	@Future
    @DateTimeFormat(pattern="MM-dd-yyyy")
	private Date date;

	
	
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
	
	
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    ///SetUp
    
    public License() {
    }
    
    public License(Long id, String ln, Date date, String state, Person person) {
    	this.id = id;
		this.ln = ln;
		this.date = date;
		this.state = state;
		this.person = person;
    }

    
    //Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
	        
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Person getPersons() {
		return person;
	}

	public void setPersons(Person persons) {
		this.person = persons;
	}

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}         
}
