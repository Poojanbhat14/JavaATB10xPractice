package SET.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_244 {
    public static void main(String[] args) {

        Map m1= new LinkedHashMap();
        m1.put("Name","Preethi");
        m1.put("Rol",2344);
        m1.put("Mark", 345);
        System.out.println(m1);

        Map m2= new HashMap();
        m2.put("Name","Preethi");
        m2.put("Rol",2344);
        m2.put("Mark", 345);
        System.out.println(m1);

        Map m3= new TreeMap();
        m3.put("Name","Preethi");
        m3.put("Rol",2344);
        m3.put("Mark", 345);
        System.out.println(m1);
    }
}
