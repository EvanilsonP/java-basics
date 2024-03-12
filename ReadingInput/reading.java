package ReadingInput;

import java.util.Scanner;

public class reading {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); // Evanilson Pereira. If i use next() only Evanilson shows on terminal
        System.out.println("How old are you?");
        byte age = scanner.nextByte();

        System.out.println("You are " + name);
        System.out.println("You are " + age);

        scanner.close();
    }
}
