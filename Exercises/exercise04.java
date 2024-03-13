package Exercises;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What day is it?");
        String weekDay = scanner.next().toLowerCase();

        switch (weekDay) {

            case "monday":
                System.out.println("Today is Monday.");
                break;

            case "tuesday":
                System.out.println("Today is Tuesday.");
                break;

            case "wednesday":
                System.out.println("Today is Wednesday.");
                break;

            case "thursday":
                System.out.println("Today is Thursday.");
                break;

            case "friday":
                System.out.println("Today is Friday.");
                break;

            case "saturday":
                System.out.println("Today is Saturday.");

            case "sunday":
                System.out.println("Today is Sunday.");
                break;
        
            default:
                System.out.println("Invalid input.");
                break;
        }

        scanner.close();
    }
}

//Solicite ao usuário um dia da semana (em formato numérico de 1 a 7) e exiba o nome correspondente usando um bloco switch.
