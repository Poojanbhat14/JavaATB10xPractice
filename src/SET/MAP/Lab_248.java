package SET.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab_248 {
    public static void main(String[] args) {
        Map Student1=new HashMap<>();
        Student1.put("Name","Paru");
        Student1.put("RolNo",234);
        Student1.put("Marks",333);

        Map Student2=new HashMap<>();
        Student2.put("Name","varu");
        Student2.put("RolNo",334);
        Student2.put("Marks",533);

        List Students =new ArrayList<>();
        Students.add(Student1);
        Students.add(Student2);
        System.out.println(Students);
    }
}
