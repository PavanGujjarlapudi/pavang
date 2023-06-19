package Week3.Day2;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        printNumbers();
    }
    public static void printNumbers(){
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
