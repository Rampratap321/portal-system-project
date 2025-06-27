package com.KIT.View;

import com.KIT.Controller.BookRoom;
import com.KIT.Modal.Guest;
import com.KIT.Modal.Room;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookRoom controller = new BookRoom();
        boolean running = true;

        System.out.println("Welcome to KIT Hotel Booking System");

        while (running) {
            System.out.println("\n1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. View Reservations");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    List<Room> availableRooms = controller.getAvailableRooms();
                    for (Room room : availableRooms) {
                        System.out.println(room);
                    }
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter room number to book: ");
                    int roomno = scanner.nextInt();
                    System.out.print("Enter check-in date (as int): ");
                    int checkin = scanner.nextInt();
                    System.out.print("Enter check-out date (as int): ");
                    int checkout = scanner.nextInt();

                    Guest guest = new Guest(name, email);
                    controller.bookRoom(guest, roomno, checkin, checkout);
                    break;

                case 3:
                    controller.viewAllReservations();
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for using the KIT Hotel Booking System.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}
