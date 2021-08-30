package com.taemin.tadadak.chat.domain;

import com.taemin.tadadak.user.domain.User;
import com.taemin.tadadak.user.domain.Users;

public class RoomUsers {

	private Users roomUsers;

	private static final int MIN_ROOM_SIZE = 0;
	private static final int MAX_ROOM_SIZE = 8;

	public RoomUsers(User boss) {
		roomUsers = new Users();
		roomUsers.add(boss);
	}

	public void enterRoom(User user) {
		roomUsers.add(user);
	}

	private void enterRoomValidate() {
		if (MAX_ROOM_SIZE < roomUsers.count()) {
			throw new IllegalArgumentException("방 인원 초과");
		}
	}
}
