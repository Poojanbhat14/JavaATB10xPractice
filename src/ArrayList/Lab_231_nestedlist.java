package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab_231_nestedlist {
    public static void main(String[] args) {
        List <String>fruit=new ArrayList<>();
        fruit.add("Papaya");
        fruit.add("Mango");
        fruit.add("Cherry");
        System.out.println(fruit);
        List <String>fruit2=new ArrayList<>();
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("Apple");
        System.out.println(fruit2);
        List <String>Veg=new ArrayList<>();
        fruit.add("bean");
        fruit.add("carrot");
        fruit.add("onion");
        System.out.println(Veg);
        List Allfruit=new ArrayList<>();
        Allfruit.add(fruit);
        Allfruit.add(fruit2);
        Allfruit.add(Veg);
        System.out.println(Allfruit);

    }
}
