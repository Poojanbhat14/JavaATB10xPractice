package Overriding;

public class Lab175 {
    public static void main(String[] args) {
        Pramod p= new Pramod();
        p.home();
        ftherOverrid f1=new ftherOverrid();
        f1.home();
        ftherOverrid f2=new Pramod();
        f2.home();
    }
}
