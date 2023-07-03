package Week3.Day3;

public class Booking {

    public static void main(String[] args) throws InterruptedException {
       BookTicket bookTicket = new BookTicket();
        User1 user1 = new User1(bookTicket);
        User2 user2 = new User2(bookTicket);
        User1 user3 = new User1(bookTicket);
        User2 user4 = new User2(bookTicket);

        user1.start();
        user3.start();
        //user4.start();
        user2.start();
        user4.start();

    }
}
