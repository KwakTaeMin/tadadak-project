package com.taemin.tadadak.user.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Users {

	private List<User> users;

	public Users() {
		users = new ArrayList<>();
	}

	public void add(User user) {
		this.users.add(user);
	}

	public int count() {
		return this.users.size();
	}

	public List<User> getUsers() {
		return Collections.unmodifiableList(users);
	}
}
