package com.taemin.tadadak.chat.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rooms {

	private static final int MAX_ROOMS_SIZE = 100;

	private List<Room> rooms;

	public Rooms() {
		this.rooms = new ArrayList<>();
	}

	public void createRoom(Room room) {
		validateCreateRoom();
		rooms.add(room);
	}

	public List<Room> getRooms() {
		return Collections.unmodifiableList(rooms);
	}

	private void validateCreateRoom() {
		if(this.rooms.size() >= 100) {
			throw new IllegalArgumentException("방 100개 이상을 만들 수 없습니다.");
		}
	}
}
