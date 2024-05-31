package Desafio5;

import java.util.Scanner;

public class ControleSimplesDeSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for (int i = 1; ;i++){
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0){
                System.out.println("Transacoes encerradas.");
            } 
            else if (valorSaque > limiteDiario){
                System.out.println("Limite diario de saques atingido. Transacoes encerradas.");
                break;
            }
            else {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
            System.out.println(i);
        }
        scanner.close();
    }
}
