package com.group11.threadsync.booking;

public class MovieTicketServer {
    private int availableSeats;
    private String movieName;


    public MovieTicketServer(String movieName, int availableSeats) {
        this.availableSeats = availableSeats;
        this.movieName = movieName;
    }

    public synchronized void bookTicket(String costumerName, int numberOfSeats) {
        if ((availableSeats - numberOfSeats) < 0) {
            System.out.println("Hello " + costumerName + ", Requested seats not available. Only " + availableSeats + " seats left.");
        } else {
            availableSeats -= numberOfSeats;
            System.out.println("Hello " + costumerName + " , " + numberOfSeats + " seats booked successfully. " + availableSeats + " seats left.");
        }
    }
}