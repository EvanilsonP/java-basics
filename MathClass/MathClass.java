package MathClass;

public class MathClass {
    
    public static void main(String[] args) {

        // int result = Math.round(1.1F); // 1
        // int result = (int)Math.ceil(1.1F); // 2
        // int result = (int)Math.floor(1.1F); // 1
        // int result = Math.max(1, 2); // 2
        int result = (int)Math.round(Math.random() * 100);

        System.out.println(result);
    }
}
