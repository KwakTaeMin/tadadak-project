package com.taemin.tadadak.user.domain;

import com.taemin.tadadak.user.exception.NickNameException;

public class NickName {

	private String nickName;

	public NickName(String nickName) {
		validate(nickName);
		this.nickName = nickName;
	}

	public String value() {
		return this.nickName;
	}

	private void validate(String nickName) {
		if (nickName.length() <= 0 || nickName.length() > 16) {
			throw new NickNameException("닉네임은 글자는 0보다 크고 16보다 작아야합니다.");
		}
	}
}
