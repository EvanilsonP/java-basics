package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for(int i = 5; i > 0; i--) {
        //     System.out.println("Countdown to happy new year: "+ i);
        // }
        // System.out.println("Happy new year!");
        Scanner scanner = new Scanner(System.in);
        String message = "";

        while(!message.equals("quit")) {
            System.out.print("Input: ");
            message = scanner.nextLine().toLowerCase();
            System.out.println(message);
        }

        scanner.close();
    }
}
