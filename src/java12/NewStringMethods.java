package java12;

public class NewStringMethods {
    
    String abc = "string";
    
    
   public static void main(String[] args) {
       
       String text = "Hello Wotld!\nThis is Java 12.";

       text = text.indent(4);
       System.out.println(text);

       text = text.indent(-10);
       System.out.println(text);
       
       String text1 = "World";
       String transformed = text1.transform(value ->
         new StringBuilder(value).reverse().toString()
       );
       
       System.out.println(transformed);
       
   }
    
}
