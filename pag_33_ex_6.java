package Atividade_github;

import java.util.Scanner;

public class pag_33_ex_6 {
   
    public static void main(String[] args) {

String vSimb = ""; 
double rL=0; 
double rLKg=0;

 System.out.println("1 - Converter Kg em libras");
 System.out.println("2 - Converter Libras em Kg");  

    Scanner resposta = new Scanner (System.in);
     System.out.printf("Digite: ");         
     int opcao = resposta.nextInt(); 

    if(opcao==1) { 
     System.out.printf("Digite o valor em kg: ");
     double d = resposta.nextDouble(); 
     rL= d * 2.2046; vSimb = " libras";
     System.out.println("O valor aproximado é de: " + rL + " " + vSimb);
}   else {
     System.out.printf("Digite o valor em Libras: ");
     double d = resposta.nextDouble(); 
     rLKg = d * 0.4536; vSimb = "kg";
     System.out.println("O valor aproximado é de : " + rLKg + " " + vSimb);
    } 
    resposta.close();
    } 
}
