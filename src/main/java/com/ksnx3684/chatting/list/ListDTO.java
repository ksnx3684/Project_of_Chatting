package com.ksnx3684.chatting.list;

public class ListDTO {

	private Long chatNum;
	private Long roomNum;
	private String id;
	private String contents;
	
	public Long getChatNum() {
		return chatNum;
	}
	public void setChatNum(Long chatNum) {
		this.chatNum = chatNum;
	}
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
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
