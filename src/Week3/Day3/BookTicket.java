package Week3.Day3;

public class BookTicket {

   synchronized public void selectSeat(){
        try {
            System.out.println("Seat is Selected");
            System.out.println("Waiting");
            wait();
            System.out.println("Waiting done");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

   synchronized public void bookTicket(){
        try {
            System.out.println("Ticket is Booked");
            notifyAll();
            System.out.println("Notified");
        }catch (Exception ignored){

        }
    }

}
