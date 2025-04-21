package Enum_DataType;

public class lab_198_enum {
    public static void main(String[] args) {
        System.out.println(Locator.pag1_Button.getLocator());
    }

}
enum Locator{
    pag1_Button("#btn"),
    input_box("#Inp");

   private String Locator;
    Locator(String locator){
        this.Locator=locator;


   }
   String getLocator(){
        return this.Locator;
   }

}
