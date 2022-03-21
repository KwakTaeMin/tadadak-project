package com.taemin.tadadak.user.domain;

import com.taemin.tadadak.user.exception.NickNameException;

import javax.persistence.Embeddable;

@Embeddable
public class NickName {

	private String nickName;

	private static final int MIN_NICKNAME_SIZE = 1;
	private static final int MAX_NICKNAME_SIZE = 16;

	protected NickName() {}

	public NickName(String nickName) {
		validate(nickName);
		this.nickName = nickName;
	}

	public String value() {
		return this.nickName;
	}

	private void validate(String nickName) {
		if (nickName.length() < MIN_NICKNAME_SIZE || nickName.length() > MAX_NICKNAME_SIZE) {
			throw new NickNameException();
		}
	}
}
