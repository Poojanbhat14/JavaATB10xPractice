package OOPS;

public class Lab161_Cats {
    public static void main(String[] args) {
       cats c1=new cats();
       c1.name="Billi";
       cats c2;
       new cats();
       c1.Running();


    }
}
class cats{
    String name;

    void Running(){
        System.out.println("Running");
    }
}