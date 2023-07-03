package Week3.Day3;

import Week3.Day2.Thread1;

public class User2 extends Thread {
    BookTicket bookTicket;

    public User2(BookTicket bookTicket) {
        this.bookTicket = bookTicket;
    }
    @Override
    public void run(){
        this.book();
    }
    public void book(){
        bookTicket.bookTicket();
    }
}
