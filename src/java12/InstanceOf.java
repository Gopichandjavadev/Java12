package java12;

public class InstanceOf {

    public static void main(String[] args) {
        
        Object obj = "Hello World!";
        
        if (obj instanceof String s) {
            int length = s.length();
        }
    }

}
