package SuperAbstraction;

public class Lab185 {
    public void main(String[] args) {
        WagonR Waganor=new WagonR();
        Waganor.drive();
    }

    class  WagonR extends Engine{
        @Override
        void startEngine(){
            System.out.println("Start Engine");
        }
        @Override
        void  StopEngine(){
            System.out.println("Stop Engine");
        }
        void  drive(){
            startEngine();
            System.out.println("I am a drive");
            StopEngine();
        }


    }
    abstract class Engine{
        abstract void startEngine();
        abstract  void StopEngine();

    }
}
