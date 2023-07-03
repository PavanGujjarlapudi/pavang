package Week3.Day3;

public class User1 extends Thread{
    BookTicket bookTicket;
    public User1(BookTicket bookTicket) {
        this.bookTicket = bookTicket;
    }
    @Override
    public void run(){
       this.book();
    }
    public void book(){
        bookTicket.selectSeat();
        //bookTicket.bookTicket();
    }
}
