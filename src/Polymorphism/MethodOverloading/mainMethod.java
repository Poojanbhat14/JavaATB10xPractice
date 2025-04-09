package Polymorphism.MethodOverloading;

public class mainMethod {
    public static void main(String[] args) {
        Mathoperation m1= new Mathoperation();
        int r= m1.add(3,4);
        System.out.println(r);
        int r2= m1.add(5,6,2);
        System.out.println(r2);
        double r3= m1.add(2.2,4.6,5.6);
        System.out.println(r3);
    }
}
