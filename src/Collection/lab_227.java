package Collection;

import java.util.ArrayList;
import java.util.List;

public class lab_227 {
    public static void main(String[] args) {
        List Fruits= List.of("orange", "Mango", "Grapes","Guava");
        System.out.println(Fruits);

        ArrayList array= new ArrayList<>();
        array.add("Pallavi");
        array.add("Prema");
        array.add(null);
        array.add(0,234);
        array.add("tara");
        System.out.println(array);
        System.out.println(array.size());

        List l=new ArrayList<>();
        l.add("eee");
        l.add(233);
        System.out.println(l);
    }
}
