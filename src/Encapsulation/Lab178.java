package Encapsulation;

public class Lab178 {
    public static void main(String[] args) {
        ICICIBank amith=new ICICIBank(2000,"amith");
        System.out.println(amith.getBal());
        boolean cashier=true;
        amith.setBal(230,cashier);
        System.out.println(amith.getBal());

    }

}
class ICICIBank{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean cashier) {
        if (cashier){
            this.bal=bal;

        }else {
            System.out.println("Not allowed change bal");
        }
        this.bal = bal;
    }

    private  String name;

    public ICICIBank(long bal, String name) {
        this.bal = bal;
        this.name = name;
    }

    private  long bal;
}
