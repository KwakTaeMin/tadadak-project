package com.taemin.tadadak.chat.exception;

public class RoomTitleException extends IllegalArgumentException {
	public RoomTitleException() {
		super("방 제목은 글자는 0보다 크고 50보다 작아야합니다.");
	}
	public RoomTitleException(String message) {
		super(message);
	}
}
