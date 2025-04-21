package SuperAbstraction;

public class Lab186_Interface {
    public static void main(String[] args) {
        Car1 c1= new Car1();
        c1.drive();
    }

}

class  Car1 implements Engine, Break{

    void  drive(){
   startEnginine();
   applyBreak();
   StopEngine();
    }

    @Override
    public void startEnginine() {
        System.out.println("Start Engine");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }
}
interface  Engine{
    void  startEnginine();
    void  StopEngine();
}
interface  Break{
    void  applyBreak();
}
