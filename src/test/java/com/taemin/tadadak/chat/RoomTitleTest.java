package com.taemin.tadadak.chat;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.taemin.tadadak.chat.domain.RoomTitle;
import com.taemin.tadadak.chat.exception.RoomTitleException;

public class RoomTitleTest {

	@Test
	void 방이름_생성() {
		RoomTitle title = new RoomTitle("title");
		assertThat(title.value()).isEqualTo("title");
	}

	@Test
	void 방이름_0글자이하_에러발생() {
		assertThatThrownBy(() -> {
			RoomTitle title = new RoomTitle("");
		}).isInstanceOf(RoomTitleException.class);
	}

	@Test
	void 방이름_50글자이상_에러발생() {
		assertThatThrownBy(() -> {
			RoomTitle title = new RoomTitle("123456789123456789123456789123456789123456789123456789123456789");
		}).isInstanceOf(RoomTitleException.class);
	}
}
