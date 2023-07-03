package Week3.Day3;

public class CommonResource2 {
    synchronized public void move(){
        System.out.println("Moving");
    }
    synchronized public void walk(){
        System.out.println("Walking");
    }
}
