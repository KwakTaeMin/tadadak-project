package com.taemin.tadadak.chat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.taemin.tadadak.chat.domain.Room;
import com.taemin.tadadak.user.domain.NickName;
import com.taemin.tadadak.user.domain.User;

public class RoomTest {

	User boss;

	@BeforeEach
	void setUp() {
		NickName nickName = new NickName("niKe");
		boss = new User(1L, "authenticationCode", nickName);
	}

	@Test
	void 체팅방_생성() {
		Room room = new Room(1L, "체팅방 이름", boss);
	}
}
