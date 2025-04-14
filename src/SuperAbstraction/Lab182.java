package SuperAbstraction;

public class Lab182 {
    public static void main(String[] args) {

    }
}

class car extends vehicle{
    private  int MaxSpeed =200;
car(){
    super(130);
}
car(int b){
    System.out.println("PC car");
}
    @Override
    void display() {
        System.out.println("Override car Display");
        System.out.println(super.MaxSpeed); // Parent MaxSpeed, parent Variable
        System.out.println(this.MaxSpeed); //Its own Variable
    }
}
//Single Inheritance
class vehicle{
    public  int MaxSpeed=180;
    vehicle(){
        System.out.println("Default Const");
    }
    vehicle(int a){
        System.out.println("Parameter Const");
    }
    //Method overloading same class same name, with diff Argument
    void  message(){
        System.out.println("No return type No Argument");
    }
    void  message(int a){
        System.out.println("Parameter Constructor Arg");
    }
    void  display(){
        System.out.println("Display Vehucle");
    }
}
