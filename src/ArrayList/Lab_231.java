package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_231 {
    public static void main(String[] args) {

        List list= new ArrayList();
        list.add("bt");
        list.add("Milk");
        list.add("name");
        list.add("chat");
        list.add("Milana");
        list.add("navami");
        list.add(1234);
        list.add(true);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println("Print List");

     for (Object o:list){
         System.out.println(o);
     }

        System.out.println("Iterate form");
        Iterator Itr= list.iterator();
        while (Itr.hasNext()){
            System.out.println(Itr.next());
        }
    }
}
