package com.KIT.Modal;

public class Reservation {
	private int room;
	private int checkin;
	private int checkout;
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getCheckin() {
		return checkin;
	}
	public void setCheckin(int checkin) {
		this.checkin = checkin;
	}
	public int getCheckout() {
		return checkout;
	}
	public void setCheckout(int checkout) {
		this.checkout = checkout;
	}
	public Reservation(int room, int checkin, int checkout) {
		super();
		this.room = room;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	@Override
	public String toString() {
		return "Reservation [roomno=" + room + ", checkin=" + checkin + ", checkout=" + checkout + "]";
	}
}
