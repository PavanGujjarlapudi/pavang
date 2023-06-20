package Week4.Day1;

import java.util.ArrayList;
import java.util.List;

public class RemovingLastObject {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Pavan","G",3.5));
        list.add(new Student("Sai Nath","K",3.75));
        list.add(new Student("Santhosh","P",3.6));
        list.add(new Student("Bhargav","M",3.8));
        list.add(new Student("Vamshi","N",3.4));
        //System.out.println(list.size());
        list.parallelStream().forEach(System.out::println);
        list.remove(list.size()-1);
        System.out.println("After removing last Object");
        //System.out.println(list.size());
        list.parallelStream().forEach(System.out::println);

    }
}
