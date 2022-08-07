package Atividade_github;

public class pag_33_ex_2 {

    public static void main(String[] args) {    
     for (int num = 0; num <= 123; num++) 
         if( Primo(num)){
         System.out.println(num + " é primo.");
         }  
         }
         
    public static boolean Primo(int numero) {
      for (int primo = 0; primo < numero; primo++) {
      if (numero % primo == 0)
      return false;   
      }
     return true;
    }
    }
