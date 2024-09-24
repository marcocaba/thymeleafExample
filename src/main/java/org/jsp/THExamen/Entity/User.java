package org.jsp.THExamen.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userser2")
public class User {
	
	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="level")
	private int level;
	@Column(name="published")
	private boolean published;
		
	// define cosntructors
	public User() {
		
	}
	
	public User(String title, String description, int level, boolean published){
		this.title = title;
		this.description = description;
		this.level = level;
		this.published = published;
	}

	public User(int id,String title, String description, int level, boolean published){
		this.id = id;
		this.title = title;
		this.description = description;
		this.level = level;
		this.published = published;
	}
	
	// define getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean getPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}
}
