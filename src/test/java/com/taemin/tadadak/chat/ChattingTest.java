package com.taemin.tadadak.chat;

import static org.assertj.core.api.Assertions.*;

import com.taemin.tadadak.user.domain.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.taemin.tadadak.chat.domain.ChatContents;
import com.taemin.tadadak.chat.domain.Chatting;
import com.taemin.tadadak.chat.domain.Room;
import com.taemin.tadadak.chat.domain.RoomTitle;
import com.taemin.tadadak.user.domain.NickName;
import com.taemin.tadadak.user.domain.User;

public class ChattingTest {

	User user;
	Room room;

	@BeforeEach
	void setUp() {
		NickName nickName = new NickName("niKe");
		RoomTitle roomTitle = new RoomTitle("title");
		User person1 = new User(1L, "taemin@naver.com", nickName, Role.USER, "picture");
		room = new Room(1L, roomTitle, user);
	}

	@Test
	void 체팅_생성() {
		ChatContents chatContents = new ChatContents("내용");
		Chatting chatting = new Chatting(room, user, chatContents);

		assertThat(chatting.getContents().value()).isEqualTo("내용");
		assertThat(chatting.getRoom()).isEqualTo(room);
		assertThat(chatting.getUser()).isEqualTo(user);
		assertThat(chatting.getCreateDate()).isNotNull();
	}
}
