package Exercises;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = scanner.nextInt();

       if (number > 0) {
            System.out.println("Positive number.");

       } else if(number < 0) {
            System.out.println("Negative number.");

       } else {
            System.out.println("It is a zero.");
       }

        scanner.close();
    }
}
// Crie um programa que verifica se um número digitado pelo usuário é positivo, negativo ou zero.
