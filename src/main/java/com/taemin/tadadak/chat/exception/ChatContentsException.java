package com.taemin.tadadak.chat.exception;

public class ChatContentsException extends IllegalArgumentException {
	public ChatContentsException() {
		super("체팅 내용은 글자는 0보다 크고 255보다 작아야합니다.");
	}
}
