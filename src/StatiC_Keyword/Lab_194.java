package StatiC_Keyword;

public class Lab_194 {
    public static void main(String[] args) {
        A a=new A();
    }
}

class  A{
    static {
        System.out.println("called only when class is loaded");
    }
    static  int a=1;
    static void m1(){
        System.out.println("Static function");
    }
    static  class B{

    }
}
