package Exercises;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumber;
        int negativeNumber;
                
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if(number > 0) {
            positiveNumber = number;
            System.out.println("Positive number: " + positiveNumber);
            
        } else {
            negativeNumber = number;
            System.out.println("Negative number: " + negativeNumber);
        }
        // Usa-se Math.abs para garantir que estamos lindando com o valor absoluto do número, não importando se é positivo ou negativo
        switch (Math.abs(number % 2) ) {
            case 0:
                System.out.println("The number is even.");
                break;
        
            case 1:
                System.out.println("The number is odd.");
                break;
        }
        
        scanner.close();
    }
}

// Escreva um programa em Java que solicita ao usuário um número inteiro. Com base nesse número, o programa deve realizar as seguintes ações:

// 1. Se o número for positivo, armazene-o em uma variável e exiba uma mensagem indicando que é positivo.
// 2. Se o número for negativo, armazene o valor absoluto em uma variável e exiba uma mensagem indicando que é negativo.
// 3. Utilize um bloco switch para verificar se o número é par ou ímpar. Exiba uma mensagem correspondente.


