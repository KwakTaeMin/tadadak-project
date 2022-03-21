package com.taemin.tadadak.user;

import static org.assertj.core.api.Assertions.*;

import com.taemin.tadadak.user.domain.Role;
import org.junit.jupiter.api.Test;

import com.taemin.tadadak.user.domain.NickName;
import com.taemin.tadadak.user.domain.User;

public class UserTest {
	@Test
	void 유저생성() {
		NickName nickName = new NickName("niKe");
		User user = new User(2L, "taemin@naver.com", nickName, Role.USER, "picture");

		assertThat(user.getEmail()).isEqualTo("authenticationCode");
		assertThat(user.getNickName().value()).isEqualTo("niKe");
	}

	@Test
	void 유저생성_아이디_포함() {
		NickName nickName = new NickName("niKe");
		User user = new User(2L, "taemin@naver.com", nickName, Role.USER, "picture");

		assertThat(user.getId()).isEqualTo(1L);
		assertThat(user.getEmail()).isEqualTo("authenticationCode");
		assertThat(user.getNickName().value()).isEqualTo("niKe");
		assertThat(user.getCreateDate()).isNotNull();
	}
}
