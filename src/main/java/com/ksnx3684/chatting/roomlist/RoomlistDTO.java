package com.ksnx3684.chatting.roomlist;

public class RoomlistDTO {

	private Long roomNum;
	private String id;
	private String roomName;
	private String lastChat;
	
	public Long getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(Long roomNum) {
		this.roomNum = roomNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getLastChat() {
		return lastChat;
	}
	public void setLastChat(String lastChat) {
		this.lastChat = lastChat;
	}
	
}
