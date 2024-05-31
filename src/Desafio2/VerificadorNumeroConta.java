package Desafio2;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.next();

            verificarNumeroConta(numeroConta);

            System.out.println("Número da conta válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally{
            scanner.close();
        }
    }
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException{
        if (numeroConta.length()!=8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
