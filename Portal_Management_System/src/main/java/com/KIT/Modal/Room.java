package com.KIT.Modal;

public class Room {
	private int roomno;
	private String roomtype;
	private int price;
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Room(int roomno, String roomtype, int price) {
		super();
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Room [roomno=" + roomno + ", roomtype=" + roomtype + ", price=" + price + "]";
	}
}
