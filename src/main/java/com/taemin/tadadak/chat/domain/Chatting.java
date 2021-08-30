package com.taemin.tadadak.chat.domain;

import java.time.LocalDateTime;

import com.taemin.tadadak.user.domain.User;

public class Chatting {

	private Room room;
	private User user;
	private ChatContents contents;
	private LocalDateTime createDate;

	public Chatting(Room room, User user, ChatContents contents) {
		this.room = room;
		this.user = user;
		this.contents = contents;
		this.createDate = LocalDateTime.now();
	}

	public Room getRoom() {
		return room;
	}

	public User getUser() {
		return user;
	}

	public ChatContents getContents() {
		return contents;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}
}
