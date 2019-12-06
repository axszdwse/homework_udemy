package com.train;

public class Ticket {
    int tickets;
    int round;
    int total;

    public Ticket(int tickets, int round) {
        this.tickets = tickets;
        this.round = round;
        this.total=round*2000*90/100+(tickets-round)*1000;
    }

    public void print(){
        System.out.println("Total tickets: "+tickets);
        System.out.println("Round-trip: "+round);
        System.out.println("Total: "+total);
    }
}
