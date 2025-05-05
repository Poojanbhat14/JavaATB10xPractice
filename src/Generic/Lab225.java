package Generic;

public class Lab225 {
    public static void main(String[] args) {
  temp_Sum(22,55);
  temp_Sum("PP", "Prr");
  temp_Sum(true,false);

    }
    public  static <P> P temp_Sum(P a, P b){
        System.out.println(a);
        System.out.println(b);
        return  null;
    }
}
