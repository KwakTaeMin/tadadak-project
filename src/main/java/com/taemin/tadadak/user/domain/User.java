package com.taemin.tadadak.user.domain;

import java.time.LocalDateTime;

public class User {
	private Long id;
	private String authenticationCode;
	private NickName nickName;
	private LocalDateTime createDate;

	public User(String authenticationCode, NickName nickName) {
		this.authenticationCode = authenticationCode;
		this.nickName = nickName;
		this.createDate = LocalDateTime.now();
	}

	public User(Long id, String authenticationCode, NickName nickName) {
		this(authenticationCode, nickName);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getAuthenticationCode() {
		return authenticationCode;
	}

	public NickName getNickName() {
		return nickName;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}
}
