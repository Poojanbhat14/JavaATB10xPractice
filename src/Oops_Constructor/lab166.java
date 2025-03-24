package Oops_Constructor;

public class lab166 {
    public static void main(String[] args) {
        mobile iphone=new mobile("Oppo",200);

        System.out.println(iphone.Model_name);
        mobile another=new mobile("oneplus",2009);

    }
}
class  mobile{
    String Model_name;
    int yearoflaunch;
 mobile(String model_nameC, int yearoflaunch_1){
     this.Model_name=model_nameC;
     this.yearoflaunch=yearoflaunch_1;
}
void  display(){
    System.out.println(this.Model_name+ " "+ this.yearoflaunch);

    }
    String gime_Model_name(){
     return  this.Model_name;
    }
}
