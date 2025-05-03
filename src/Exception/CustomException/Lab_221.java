package Exception.CustomException;

import java.util.Currency;

public class Lab_221 {
    public static void main(String[] args) {
        Bank SBI=new Bank("INR",1000);
        Bank ICIC=new Bank("INR",3456);
        Bank JPM=new Bank("USD",67);
        int result=SBI.Add(JPM);
        System.out.println(result);

    }
}
