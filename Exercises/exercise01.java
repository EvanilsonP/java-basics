package Exercises;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        scanner.close();
    }
}

// Solicite o nome e a idade do usuário. Em seguida, exiba uma mensagem com essas informações.