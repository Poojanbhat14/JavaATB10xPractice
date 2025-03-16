package Oops_Constructor;

public class lab163 {
    public static void main(String[] args) {
 AC c1=new AC();

    }
}
class AC{
    AC(){
        System.out.println("Called when only Objectct created");
        System.out.println("can do anything can write a logic inside");
    }
}
class car{
    String name;
    String brand;
    int yr;
    car(){
        String name="unknown";
        String brand="not Disclosed";
        int yr=0;
        System.out.println("DC");
    }

}
