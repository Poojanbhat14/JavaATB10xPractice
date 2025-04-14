package SuperAbstraction;

public class lab184AbtractClass {
    public static void main(String[] args) {
        child c= new child();
        c.loan50K();
        c.loan25K();

    }

}
abstract  class  Father{
    abstract void loan50K();
    void loan25K(){
        System.out.println("given 20K");
    }

    }
     class  child extends  Father{

         @Override
    void loan50K(){
        System.out.println("Child will pay the loan");
    }

     }

