package com.taemin.tadadak.chat.domain;

import java.time.LocalDateTime;

import com.taemin.tadadak.user.domain.User;
import com.taemin.tadadak.user.domain.Users;

public class Room {

	private static final int MAX_ROOM_SIZE = 8;

	private Long id;
	private RoomTitle title;
	private User boss;
	private Users roomUsers;
	private LocalDateTime createDate;

	public Room(RoomTitle title, User boss) {
		this.title = title;
		this.boss = boss;
		this.createDate = LocalDateTime.now();
		this.roomUsers = new Users();
		this.roomUsers.add(boss);
	}

	public Room(Long id, RoomTitle title, User boss) {
		this(title, boss);
		this.id = id;
	}

	public void enter(User user) {
		enterValidate();
		this.roomUsers.add(user);
	}

	public void ban(User user) {
		banValidate(user);
		this.roomUsers.remove(user);
	}

	public Long getId() {
		return id;
	}

	public RoomTitle getTitle() {
		return title;
	}

	public User getBoss() {
		return boss;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public Users getRoomUsers() {
		return roomUsers;
	}

	private void enterValidate() {
		if (MAX_ROOM_SIZE <= this.roomUsers.count()) {
			throw new IllegalArgumentException("방 인원 초과");
		}
	}

	private void banValidate(User user) {
		if (!this.roomUsers.isContain(user)) {
			throw new IllegalArgumentException("강퇴할 유저가 존재하지 않습니다.");
		}
	}

}
