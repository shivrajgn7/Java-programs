package com.puppy.ticketgeneration.ticket;

public interface Ticket {
    void book(int seatNo);

    void cancel(int ticketId);

    void getDetails();
}
