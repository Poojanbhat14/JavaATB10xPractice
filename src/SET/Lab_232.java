package SET;

import Overriding.Pramod;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_232 {
    public static void main(String[] args) {
        Set s1= new HashSet<>();
        Set s2=new TreeSet<>();
        Set s3=new LinkedHashSet();

        s1.add("Pramod");
        s1.add("kayar");
        s1.add("Buddhi");
        s1.add("Pramod");
        System.out.println(s1);
    }
}
