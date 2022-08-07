package Atividade_github;

import java.util.Scanner;

public class ex_10 {

    public static void main(String[] args) {
        int num1;

        System.out.printf("Digite um número: ");
        Scanner resposta = new Scanner(System.in);
        
        num1 = resposta.nextInt();
        System.out.println("O antecessor é: " + (num1 - 1));
        resposta.close();
    }
}
