package Arrays;

import java.util.Arrays;

public class ArrywtLoop {
    public static void main(String[] args) {
        int [] marks ={23,45,67,45,67,77};
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
       Arrays.sort(marks);
    }
}
