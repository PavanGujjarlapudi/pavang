package Week3.Day2;

public class RunnableExample {
    public static void main(String[] args){
        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();
    }
}
