package ForLoops;

public class even_odd {
    public static void main(String[] args) {
        int i=0;
        for (;i<10;i++){
            if(i%2==0){
                System.out.printf("%d is even\n",i);
            }else {
                System.out.printf("%d is Odd\n",i);
            }
        }
    }
}
