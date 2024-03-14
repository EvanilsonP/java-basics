package Exercises;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double purchase;
        double percentage10 = 10.0 / 100.0;
        double percentage5 = 5.0 / 100.0;

        System.out.println("Valor total de sua compra: ");
        purchase = scanner.nextInt();

        if(purchase >= 200) {
            double discount = purchase * percentage10;
            double total = purchase - discount;

            System.out.println("Você tem um desconto de " + discount + " R$ e pagará apenas " + total + " R$");

        } else if(purchase >= 100 && purchase <= 200) {
            double discount = purchase * percentage5;
            double total = purchase - discount;

            System.out.println("Você tem um disconto de " + discount + " R$ e pagará apenas " + total + " R$");
        } else {

            System.out.println("Infelizmente não haverá disconto.");
        }


        System.out.println("Método de pagamento: \nOpção 1: Cartão de Crédito\nOpção 2: Boleto Bancário\nOpção 3: Transferência Bancária");
        int method_of_payment = scanner.nextInt();

        switch (method_of_payment) {
            case 1:
                System.out.println("Você pagou com cartão de crédito.");
                break;
            
            case 2: 
                System.out.println("Você pagou com boleto bancário.");
                break;
            
            case 3:
                System.out.println("Você pagou com transferência bancária.");
        
            default:
                System.out.println("Erro no pagamento. Opção inválida.");
                break;
        }
        
        scanner.close();
    }
}

// Desenvolva um programa em Java para simular um sistema de pedidos de uma loja online. O programa deve:

// 1. Solicitar ao usuário que insira o valor total de sua compra.
// 2. Com base nesse valor, aplicar descontos conforme as seguintes regras:
// Se o valor for maior que R$ 200, aplique um desconto de 10%.
// Se o valor estiver entre R$ 100 e R$ 200, aplique um desconto de 5%.
// Caso contrário, não aplique desconto.

// 3. Exiba o valor final a ser pago pelo usuário após o desconto.
// Além disso, implemente um menu utilizando um switch para permitir ao usuário escolher o método de pagamento:
// Opção 1: Cartão de crédito
// Opção 2: Boleto bancário
// Opção 3: Transferência bancária
