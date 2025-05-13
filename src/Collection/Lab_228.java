package Collection;

import java.util.ArrayList;
import java.util.List;

public class Lab_228 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("3");
        list.add("5");
        list.add("8");
        list.add("8");
        list.add("8");
        list.add("0");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("3"));
        System.out.println(list.contains(4));
        System.out.println(list.indexOf("8"));
        System.out.println(list.lastIndexOf("8"));
    }
}
