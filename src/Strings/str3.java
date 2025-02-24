package Strings;

public class str3 {
    public static void main(String[] args) {
        String str1="Hello world";
       String str2= str1.concat(" here I am");
        System.out.println(str2);
        System.out.println(str2.replace("here","nowhere"));
        System.out.println(str2);
        String str3="poojanb14@gmail.com";
        String[] split= str3.split("i");
        System.out.println(split[0]);
        System.out.println(str1.startsWith("H"));
        System.out.println(str3.trim());
    }
}
