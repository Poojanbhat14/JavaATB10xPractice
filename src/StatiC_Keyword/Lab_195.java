package StatiC_Keyword;

public class Lab_195 {
}
class ATB1{
    {
        System.out.println("IIB- This is Called when object is created");
    }
    static  {
        System.out.println("if u are loading a class i will be called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }
    void readDoc(){
        System.out.println("Non Static method");
        System.out.println(courseName);
    }
    static  void DoassignMent(){
        System.out.println("Do AssignMent");
    }

    private  String name;
    private  int phNo;
    static String courseName="ATb10X";


}