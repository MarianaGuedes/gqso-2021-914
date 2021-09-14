# Calculadora API (GQSO IFAL)

Cada diretório nesse repositório implementa a calculadora em uma linguagem diferente.

import java.util.Scanner;

public class calculadora {

   
    public static void main(String[] args) 
    {
       int num1 = 0 , num2 = 0, resultado;
      
       Scanner input = new Scanner(System.in);
       
       System.out.println("Introduza o 1 numero");
       num1 = input.nextInt();
       
       System.out.println("Introduza o 2 numero");
       num2 = input.nextInt();
             
       resultado = num1 + num2;
       
       System.out.println(" O resultado é: " + resultado);
             
       
           }
    
}
