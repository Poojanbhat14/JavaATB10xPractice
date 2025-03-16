package Oops_Constructor;

public class Lab162 {
    public static void main(String[] args) {

        baby b1=new baby();
        b1.name="Satwik";

    }

}
class baby{
    String name;
    //default cnstructor
    baby(){
        System.out.println("I am called,Object class is created");

    }
    {
        System.out.println("I am also called when class called");
    }
}
