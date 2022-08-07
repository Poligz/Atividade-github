package Atividade_github;

import java.util.Scanner;

public class pag_33_ex_3 {

    public static void main(String[] args) {
      
    System.out.printf("Digite um numero: ");
    Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    
     if( Primo(a) ){
  System.out.println(a + " - É primo.");  
     }else{
  System.out.println(a+ " - Não é primo.");
     }         
    if (a % 2 == 0) {
  System.out.println(a + " - Numero par");
     }else{ 
  System.out.println(a + " - Numero impar");
        n.close();
     }
}
public static boolean Primo(int numero) {
  for (int num = 2; num < numero ; num++) { 
    if (numero % num == 0)
  return false;   
  }
 return true;

}
} 
