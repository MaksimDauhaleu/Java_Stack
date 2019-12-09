package com.dauhaleu.license.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
	import javax.persistence.PreUpdate;
	import javax.persistence.Table;
	import java.util.Date;


	import org.springframework.format.annotation.DateTimeFormat;

	@Entity
	@Table
	public class Person { 
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long id;
		
		private String first_name;
		
		private String last_name;
		
		@OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	    private License license;
		    
		
		
		@Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    //SetUp
	    
	    public Person() {
	    	
	    }
	    public Person(String first_name,String last_name) {
	    	this.first_name = first_name;
	    	this.last_name = last_name;
	    }
	    
	    //Getters and Setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
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
	    
