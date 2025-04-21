package StatiC_Keyword;

import java.sql.Driver;

public class Lab_196 {
    public static void main(String[] args) {
   automation A1= new automation();
        System.out.println(A1.Driver);
        System.out.println(automation.Driver);
        automation.Driver="Firefox";
        System.out.println(automation.Driver);
    }
}

class  automation{
    static  String Driver="Chrome";
    static  String driver2;
}
