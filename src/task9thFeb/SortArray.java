package task9thFeb;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

for (int i=0;i< numbers.length-1;i++){
    for (int j=0;j< numbers.length-1-i;j++){
        if(numbers[j]>numbers[j+1]){
            int temp=numbers[j];
            numbers[j]=numbers[j+1];
            numbers[j+1]=temp;
        }
    }

    }
        System.out.println("Sorted Array");
        for (int n:numbers){
            System.out.println(n+"");
}
        }
    }

