package Oops_Constructor;

public class cars {
    public static void main(String[] args) {
        car tesla =new car();
        tesla.name="Module3";
        System.out.println(tesla.name);//if not initialised take DC value
       // tesla.name="ttesla module2";
        System.out.println(tesla.yr);
        System.out.println(tesla.brand);

        System.out.println("----");
        car nano=new car();
        nano.name="veganar";
        System.out.println(nano.name);

    }
}
