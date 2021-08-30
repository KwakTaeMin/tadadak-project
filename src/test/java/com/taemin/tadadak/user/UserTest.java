package com.taemin.tadadak.user;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.taemin.tadadak.user.domain.NickName;
import com.taemin.tadadak.user.domain.User;

public class UserTest {
	@Test
	void 유저생성() {
		NickName nickName = new NickName("niKe");
		User user = new User("authenticationCode", nickName);

		assertThat(user.getAuthenticationCode()).isEqualTo("authenticationCode");
		assertThat(user.getNickName().value()).isEqualTo("niKe");
	}

	@Test
	void 유저생성_아이디_포함() {
		NickName nickName = new NickName("niKe");
		User user = new User(1L, "authenticationCode", nickName);

		assertThat(user.getId()).isEqualTo(1L);
		assertThat(user.getAuthenticationCode()).isEqualTo("authenticationCode");
		assertThat(user.getNickName().value()).isEqualTo("niKe");
		assertThat(user.getCreateDate()).isNotNull();
	}
}
