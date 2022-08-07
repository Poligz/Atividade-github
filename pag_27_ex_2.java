package Atividade_github;

import java.util.Scanner;

public class pag_27_ex_2 {
 
    public static void main (String [] args){

        Scanner entrada= new Scanner(System.in);

      Double h,B,b,A;

        System.out.println("Digite o valor da altura:  ");
        h = entrada.nextDouble();

        System.out.println("Digite o valor da base menor:  ");
        b = entrada.nextDouble();

        System.out.println("Digite o valor da base maior:  ");
        B = entrada.nextDouble();

        A = (h * (B+b))/ 2;

        System.out.println("O valor da área do trapézio é:  " + A);
        System.out.println("O valor da área do trapézio arrendondando é:  " + Math.round (A));

}

}   