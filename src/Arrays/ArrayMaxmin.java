package Arrays;

public class ArrayMaxmin {
    public static void main(String[] args) {
        int[] value = {12, 46, 56, 78, 356, 44, 56, 32, 10, 34};

        int max_out = givemax(value);
        int min_out = minimum(value);
        System.out.println(max_out);
        System.out.println(min_out);
    }

    static int givemax(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }

        return min;
    }
}
