package Desafio1;
import java.util.Scanner;

public class Simulacaobancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] opcoes = {"Depositar", "Sacar", "Consultar Saldo", "Encerrar"};
        double saldo = 0;
        boolean continuar = true;

        while (continuar){

            for (int opcao = 0; opcao < opcoes.length; opcao++)
            System.out.println((opcao+1) + "." + opcoes[opcao]);
        
            int escolha = scanner.nextInt();
        
            switch (escolha){
                case 1:
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if (saldo > valorSacado){
                        System.out.println("Saldo atual: " + (saldo - valorSacado));
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
        scanner.close();
    }
}
