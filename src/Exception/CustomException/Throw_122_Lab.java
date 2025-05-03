package Exception.CustomException;

public class Throw_122_Lab {
    static void validate_Age(int Age) {
        if (Age < 18) {
            try {
                throw new Exception("Age cant be <18");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }


    public static void main(String[] args) {
        validate_Age(21);
    }
}