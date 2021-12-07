package com.taemin.tadadak.user;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.taemin.tadadak.user.domain.Users;

public class UsersTest {

	@Test
	public void create() {
		Users users = new Users();
		assertThat(users.count()).isEqualTo(0);
	}
}
