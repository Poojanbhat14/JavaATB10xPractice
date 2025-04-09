package Encapsulation;

public class Lab176 {
    public static void main(String[] args) {
        Vowlogin login=new Vowlogin("admin","ad123");


        System.out.println(login.password);
        login.password="2345x";
    }

}


class  Vowlogin{
    String username;
    String password;

    public Vowlogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
class GoodVnloging{
    private String username;
    private String password;

    public GoodVnloging(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
