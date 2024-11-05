package com.developerhut.inhutdev.entity;

public class Post {

	private Integer id;
	private String username;
	private String title;
	private String desc;

	public Post(Integer id, String username, String title, String desc) {
		super();
		this.id = id;
		this.username = username;
		this.title = title;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
