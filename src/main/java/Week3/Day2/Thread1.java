package Week3.Day2;

import Week3.Day3.CommonResource1;
import Week3.Day3.CommonResource2;

public class Thread1 extends Thread{
    @Override
    public void run(){
        printNumbers();
    }

    public static void printNumbers(){
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
