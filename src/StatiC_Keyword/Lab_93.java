package StatiC_Keyword;

public class Lab_93 {
    public static void main(String[] args) {
        ATB ashish=new ATB(1234767,"ashish");
        ATB trisha=new ATB(2233478,"trisha");
        System.out.println(ashish.phNo);
        System.out.println(trisha.phNo);
        System.out.println(ATB.Course);
        ATB.markAtt();
    }
}

class  ATB{
    static String Course ="ATB10";
    int phNo;
    String name;

    public ATB(int phNo_p, String name){
        this.phNo=phNo_p;
        this.name=name;
    }
    void  display(){
        System.out.println(this.phNo +this.name +Course);

    }
   static void markAtt(){
        System.out.println("Mark attendance");
    }

}
