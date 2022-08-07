package Atividade_github;

import java.util.Scanner;

public class pag_27_ex_3 {
  
    public static void main(String[] args) {

    Scanner entrada =  new Scanner(System.in);

    int n1, n2, n3, n4, n5, n6, resultado;

         n1 = 3;
         n2 = 2;
         n3 = 1;
         n4 = 2;
         n5 = 1;
         n6 = 3;

         System.out.println("==================================================");
         resultado = ((n1 -n2 -n3) + (n4 + n5 + n6));
         System.out.println("O valor da conta é: " + resultado);
    
         n1 = 2;
         n2 = 3;
         n3 = 4;
         n4 = 5;

         System.out.println("==================================================");
         resultado = ((n1 * n2) - (n3 * n4));
         System.out.println("O valor da conta é: " + resultado);
    
         n1 = 2;
         n2 = 6;
         n3 = 3;
         n4 = 7;
         n5 = 9;

         System.out.println("==================================================");
         resultado = ((n1 + n2 - n3)/(n4 * n5 ));
         System.out.println("O valor da conta é: " + resultado);
         
         n1 = 3;
         n2 = 4;
         n3 = 8;

         System.out.println("==================================================");
         resultado = ((n1 % n2 ) - n3);
         System.out.println("O valor da conta é: " + resultado);
         System.out.println("==================================================");
    
     }
    
}