package Statements;

public class Main {
    public static void main(String[] args) {

        int age = 14;

        if(age < 16) {
            System.out.println("You cannot drive;");
        } else {
            System.out.println("You can drive.");
        }

        // Making if statements simple
    int income = 120_000;
    boolean hasHighIncome = (income > 100_000);
    System.out.println(hasHighIncome);

    }
}
