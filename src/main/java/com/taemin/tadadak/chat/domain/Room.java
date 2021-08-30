package com.taemin.tadadak.chat.domain;

import java.time.LocalDateTime;

import com.taemin.tadadak.user.domain.User;

public class Room {
	private Long id;
	private String title;
	private User boss;
	private LocalDateTime createDate;

	public Room(String title, User boss) {
		this.title = title;
		this.boss = boss;
		this.createDate = LocalDateTime.now();
	}

	public Room(long id, String title, User boss) {
		this(title, boss);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public User getBoss() {
		return boss;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}
}
