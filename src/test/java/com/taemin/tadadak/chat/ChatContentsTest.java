package com.taemin.tadadak.chat;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.taemin.tadadak.chat.domain.ChatContents;
import com.taemin.tadadak.chat.exception.ChatContentsException;

public class ChatContentsTest {

	@Test
	void 체팅내용_생성() {
		ChatContents chatContents = new ChatContents("contents");
		assertThat(chatContents.value()).isEqualTo("contents");
	}

	@Test
	void 체팅내용_0글자이하_에러발생() {
		assertThatThrownBy(() -> {
			ChatContents chatContents = new ChatContents("");
		}).isInstanceOf(ChatContentsException.class);
	}

	@Test
	void 체팅내용_255글자이상_에러발생() {
		assertThatThrownBy(() -> {
			ChatContents chatContents = new ChatContents(
				"123456789123456789123456789123456789123456789123456789123456789"
					+ "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123546"
					+ "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123546"
					+ "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123546"
					+ "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123546");
		}).isInstanceOf(ChatContentsException.class);
	}
}
