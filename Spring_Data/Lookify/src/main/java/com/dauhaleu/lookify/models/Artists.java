package com.dauhaleu.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Artists")
public class Artists {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long id;
    	
	@Size(min= 2)
    private String artist;
    	
	private String images;
	
//	private Integer rank;
//	
//	private Integer albums;
//	
//	private Integer songs;
	
    	  	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    public Artists() {
    }
    
    public Artists(String art,String images) {
    	this.artist = art;
    	this.images = images;
//    	this.albums = albums;
//    	this.rank = rank;
//    	this.songs = songs;
    }
    public Artists(String art) {
    	this.artist = art;
    }

    //Setters and Getters
    
    
    public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

//	public Integer getRank() {
//		return rank;
//	}
//
//	public void setRank(Integer rank) {
//		this.rank = rank;
//	}
//
//	public Integer getAlbums() {
//		return albums;
//	}
//
//	public void setAlbums(Integer albums) {
//		this.albums = albums;
//	}
//
//	public Integer getSongs() {
//		return songs;
//	}
//
//	public void setSongs(Integer songs) {
//		this.songs = songs;
//	}

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
    
	
	//Update and Create Setters
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    } 
    
    
}
    