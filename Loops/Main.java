package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for(int i = 5; i > 0; i--) {
        //     System.out.println("Countdown to happy new year: "+ i);
        // }
        // System.out.println("Happy new year!");

        Scanner scanner = new Scanner(System.in);
        // String message = "";

        // while(!message.equals("quit")) {
        //     System.out.print("Input: ");
        //     message = scanner.nextLine().toLowerCase();
        //     System.out.println(message);
        // }

        // scanner.close();
        
        // String message = "";

        // do {
        //     System.out.print("Input: ");
        //     message = scanner.nextLine().toLowerCase();
        //     System.out.println(message);
            
            
        // } while (!message.equals("quit"));

        // scanner.close();

        String input = "";

        while (!input.equals("quit")) {

            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();

            // When we quit, the quit word is not returned on the terminal
            // if(!input.equals("quit")) {
            //     System.out.println(input);
            // } 
            // Goes to the top of the loop and the other if statement is ignored
            if(input.equals("pass")) {
                continue;
            };

            if(input.equals("quit")) {
                break;
            } else {
                System.out.println(input);
            }
        }
        
        scanner.close();
    }
}
