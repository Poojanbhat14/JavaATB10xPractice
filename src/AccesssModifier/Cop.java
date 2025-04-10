package AccesssModifier;

public class Cop {
    public  int gun;
    String icard;
    public Cop(int gun) {
        this.gun = gun;
    }
    protected void canIshoot(){
        System.out.println("Yes U can shoot");
    }

    }


