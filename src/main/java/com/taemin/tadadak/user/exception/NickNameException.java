package com.taemin.tadadak.user.exception;

public class NickNameException extends IllegalArgumentException {
	public NickNameException() {
		super("닉네임은 글자는 0보다 크고 16보다 작아야합니다.");
	}
	public NickNameException(String message) {
		super(message);
	}
}
