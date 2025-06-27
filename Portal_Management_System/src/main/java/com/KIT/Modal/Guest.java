package com.KIT.Modal;

public class Guest {
		private String guest_name;
		private String guest_mail;
		public String getGuest_name() {
			return guest_name;
		}
		public void setGuest_name(String guest_name) {
			this.guest_name = guest_name;
		}
		public String getGuest_mail() {
			return guest_mail;
		}
		public void setGuest_mail(String guest_mail) {
			this.guest_mail = guest_mail;
		}
		public Guest(String guest_name, String guest_mail) {
			super();
			this.guest_name = guest_name;
			this.guest_mail = guest_mail;
		}
		@Override
		public String toString() {
			return "Guest [guest_name=" + guest_name + ", guest_mail=" + guest_mail + "]";
		}	
}
