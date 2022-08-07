package Atividade_github;

import java.util.Scanner;

public class pag_33_ex_4 {
 
 public static void main(String[] args) {
     
  float valorhora = (10.25f); 
  System.out.printf("Digite o valor de horas trabalhadas: ");

  Scanner Htb = new Scanner(System.in); 
   float diaria = Htb.nextFloat();

   float salario = (diaria * valorhora); 
    System.out.println("Seu Salario é de: " + salario);
     Htb.close();

    }   
}
