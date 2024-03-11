package Strings;

public class Strings {

    public static void main(String[] args) {
        
        String message = "   Hello " + " there!   ";

        System.out.println(message.length()); // 12
        System.out.println(message.endsWith("!")); // true

        System.out.println(message.indexOf("H")); // 0
        System.out.println(message.replace("!", "!!!!!")); // Hello there!!!!!

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        System.out.println(message.trim());

    }
}
