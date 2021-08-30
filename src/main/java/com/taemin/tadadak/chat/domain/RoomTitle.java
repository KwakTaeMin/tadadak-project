package com.taemin.tadadak.chat.domain;

import com.taemin.tadadak.chat.exception.RoomTitleException;

public class RoomTitle {

	private String title;

	private static final int MIN_TITLE_SIZE = 1;
	private static final int MAX_TITLE_SIZE = 50;

	public RoomTitle(String title) {
		validate(title);
		this.title = title;
	}

	private void validate(String title) {
		if(title.length() > MAX_TITLE_SIZE || title.length() < MIN_TITLE_SIZE) {
			throw new RoomTitleException(title);
		}
	}

	public String value() {
		return this.title;
	}
}
