package com.taemin.tadadak.chat.domain;

import com.taemin.tadadak.chat.exception.ChatContentsException;

public class ChatContents {

	private String contents;

	private static final int MIN_CONTENTS_SIZE = 1;
	private static final int MAX_CONTENTS_SIZE = 255;

	public ChatContents(String contents) {
		validate(contents);
		this.contents = contents;
	}

	private void validate(String contents) {
		if(contents.length() < MIN_CONTENTS_SIZE || contents.length() > MAX_CONTENTS_SIZE) {
			throw new ChatContentsException();
		}
	}

	public String value() {
		return this.contents;
	}
}
