package com.group11.threadsync.booking;

public class MovieTicketClient extends Thread {
    private MovieTicketServer movieTicketServer;
    private String costumerName;
    private int numberOfSeats;

    public MovieTicketClient(MovieTicketServer movieTicketServer, String costumerName, int numberOfSeats) {
        this.movieTicketServer = movieTicketServer;
        this.costumerName = costumerName;
        this.numberOfSeats = numberOfSeats;
    }

    public void run() {
        movieTicketServer.bookTicket(costumerName, numberOfSeats);
    }
}