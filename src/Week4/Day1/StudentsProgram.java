package Week4.Day1;

import java.util.ArrayList;
import java.util.List;

public class StudentsProgram {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Pavan","G",3.4));
        list.add(new Student("Sai Nath","K",3.75));
        list.add(new Student("Santhosh","P",3.7));
        list.add(new Student("Bhargav","M",3.8));
        list.add(new Student("Vamshi","N",3.5));

        double avg = 0;
        for (Student s:list) {
            avg+=s.getGPA();
        }
        avg=avg/list.size();
        System.out.println("Avg" + avg);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGPA()<avg){
                list.remove(i);
            }
        }
        for (Student s:list) {
            System.out.println(s);
        }


    }
}
