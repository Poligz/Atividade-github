package Atividade_github;

import java.util.Scanner;

public class pag_33_ex_5 {

    public static void main(String[] args) {

    float valorhora = (10.25f);
    System.out.printf("Digite o Valor de Horas trabalhadas: ");

    Scanner Htb = new Scanner(System.in);
    float diaria = Htb.nextFloat();

    float salario =  (diaria * valorhora); 
       
    if (salario > 50.00f){
     System.out.println("Seu Salario é de: R$ " + salario); 
    }else{
     System.out.println("Seu Salario é de: R$ " + salario + " Atenção, dirija-se à direção do Hotel!");
    }
     Htb.close();
    }   
}
