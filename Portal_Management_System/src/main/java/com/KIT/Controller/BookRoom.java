package com.KIT.Controller;

import java.util.ArrayList;
import java.util.List;

import com.KIT.Modal.Guest;
import com.KIT.Modal.Reservation;
import com.KIT.Modal.Room;

public class BookRoom {
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private List<Guest> guests = new ArrayList<>();

    // Initialize with some sample rooms
    public BookRoom() {
        rooms.add(new Room(101, "Single", 1000));
        rooms.add(new Room(102, "Double", 1500));
        rooms.add(new Room(103, "Suite", 2500));
    }

    public List<Room> getAvailableRooms() {
        return rooms;
    }

    public void bookRoom(Guest guest, int roomno, int checkin, int checkout) {
        Room room = findRoomByNumber(roomno);
        if (room != null) {
            Reservation reservation = new Reservation(roomno, checkin, checkout);
            reservations.add(reservation);
            guests.add(guest);
            System.out.println("Room booked successfully for " + guest.getGuest_name());
        } else {
            System.out.println("Room not found.");
        }
    }

    private Room findRoomByNumber(int roomno) {
        for (Room room : rooms) {
            if (room.getRoomno() == roomno) {
                return room;
            }
        }
        return null;
    }

    public void viewAllReservations() {
        for (int i = 0; i < reservations.size(); i++) {
            System.out.println(guests.get(i));
            System.out.println(reservations.get(i));
        }
    }
}
