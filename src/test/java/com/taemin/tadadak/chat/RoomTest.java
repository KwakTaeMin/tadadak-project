package com.taemin.tadadak.chat;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.taemin.tadadak.chat.domain.Room;
import com.taemin.tadadak.chat.domain.RoomTitle;
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
		RoomTitle roomTitle = new RoomTitle("title");
		Room room = new Room(1L, roomTitle, boss);

		assertThat(room.getBoss()).isEqualTo(boss);
		assertThat(room.getTitle()).isEqualTo(roomTitle);
	}
}
