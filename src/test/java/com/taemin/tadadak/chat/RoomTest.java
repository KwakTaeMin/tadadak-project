package com.taemin.tadadak.chat;

import static org.assertj.core.api.Assertions.*;

import com.taemin.tadadak.user.domain.Role;
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
		boss = new User(1L, "taemin@naver.com", nickName, Role.USER, "picture");
	}

	@Test
	void 체팅방_생성_테스트() {
		RoomTitle roomTitle = new RoomTitle("title");
		Room room = new Room(1L, roomTitle, boss);

		assertThat(room.getId()).isEqualTo(1L);
		assertThat(room.getBoss()).isEqualTo(boss);
		assertThat(room.getTitle()).isEqualTo(roomTitle);
		assertThat(room.getRoomUsers().count()).isEqualTo(1);
		assertThat(room.getCreateDate()).isNotNull();
	}

	@Test
	void 체팅방_입장_테스트() {
		RoomTitle roomTitle = new RoomTitle("title");
		Room room = new Room(1L, roomTitle, boss);

		NickName nickName = new NickName("person");
		User person = new User(2L, "taemin@naver.com", nickName, Role.USER, "picture");
		room.enter(person);

		assertThat(room.getRoomUsers().count()).isEqualTo(2);
	}

	@Test
	void 체팅방_입장_8명_이상_에러테스트() {
		RoomTitle roomTitle = new RoomTitle("title");
		Room room = new Room(1L, roomTitle, boss);

		NickName nickName = new NickName("person");
		User person1 = new User(2L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person2 = new User(3L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person3 = new User(4L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person4 = new User(5L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person5 = new User(6L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person6 = new User(7L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person7 = new User(8L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person8 = new User(9L, "taemin@naver.com", nickName, Role.USER, "picture");
		room.enter(person1);
		room.enter(person2);
		room.enter(person3);
		room.enter(person4);
		room.enter(person5);
		room.enter(person6);
		room.enter(person7);

		assertThatThrownBy(() ->
			room.enter(person8)
		).isInstanceOf(IllegalArgumentException.class);

	}

	@Test
	void 체팅방_강퇴기능_테스트() {
		RoomTitle roomTitle = new RoomTitle("title");
		Room room = new Room(1L, roomTitle, boss);

		NickName nickName = new NickName("person");
		User person1 = new User(2L, "taemin@naver.com", nickName, Role.USER, "picture");
		User person2 = new User(3L, "taemin@naver.com", nickName, Role.USER, "picture");
		room.enter(person1);
		room.enter(person2);

		assertThat(room.getRoomUsers().count()).isEqualTo(3);

		room.ban(person1);
		assertThat(room.getRoomUsers().count()).isEqualTo(2);
	}
}
