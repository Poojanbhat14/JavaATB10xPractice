package ArrayList;

public class Student {
    private  String Nam;
    private  Integer RolNo;

    public Integer getRolNo() {
        return RolNo;
    }

    public void setRolNo(Integer rolNo) {
        RolNo = rolNo;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String nam) {
        Nam = nam;
    }

    public  Student(String name, Integer RN){
        this.Nam= name;
        this.RolNo=RN;

    }

    @Override
    public String toString() {
        return "Student{"+
                "name=" + Nam +
                "rolNo" + RolNo +'}';
    }

    public  void PrintDetails(){
        System.out.println("name of the student" + this.Nam);
        System.out.println("Roll No of the student" + this.RolNo);
    }
}
