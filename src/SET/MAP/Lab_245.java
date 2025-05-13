package SET.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_245 {
    public static void main(String[] args) {
        Map M= new HashMap<>();
        M.put("nmae","Pramod");
        M.put("Id",1);
        M.put("Id",2);
        M.put("Id3",3);
        M.put("Id4",4);
        M.put("Id5",1);
        M.put("Id6",null);
        M.put(null,1);
        System.out.println(M);
        System.out.println(M.size());
        System.out.println(M.isEmpty());
        System.out.println(M.containsKey("Id4"));
        System.out.println(M.containsValue(8));

    }
}
