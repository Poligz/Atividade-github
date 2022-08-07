package Atividade_github;

public class pag_33_ex_1 {

        public static void main(String[] args){
        
          long prodPar = 1;
          int somaImpar = 0;
          int numero;
        
          for(numero = 0; numero <= 30; numero++) {  
        
            if(numero % 2 == 1) {
        
            somaImpar += numero;

            }else{
                if(numero > 0)
                prodPar *= numero;
            }
         }        
         //Resposta Final 
             System.out.println("Soma dos ímpares: " + somaImpar);
             System.out.println("Produto dos pares: " + prodPar);         
                         
        }
        }