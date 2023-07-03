package Week4.Day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayConversion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pavan");
        list.add("Sai Nath");
        list.add("Santhosh");
        list.add("Vamshi");
        list.add("Bhargav");

        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }
        for (String s: str) {
            System.out.println(s);
        }
    }
}
