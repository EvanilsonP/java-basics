package Exercises;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int number1 = scanner.nextInt();

        System.out.print("Second number: ");
        int number2 = scanner.nextInt();

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number2 != 0 ? number1 / number2 : 0;
        double average = (double)(number1 + number2 ) / 2;

        System.out.println("The sum between " + number1 + " and " + number2 + " is: " + addition);
        System.out.println("The subtraction  between " + number1 + " and " + number2 + " is: " + subtraction);
        System.out.println("The multiplication between " + number1 + " and " + number2 + " is: " + multiplication);
        System.out.println(number2 != 0 ? "Resultado da divisão: " + division : "Cannot divide by zero.");
        System.out.println("The average is: " + average);


        scanner.close();
    }
}

// Peça dois números ao usuário e realize operações de adição, subtração, multiplicação e divisão. Exiba os resultados.

