# Calculadora API (GQSO IFAL)

Nesse repositório utilizamos a linguagem de programação Java, com o intuito de facilitar o desenvolvimento do código.

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
       soma(num1, num2);
           }
           
     public static void soma (int num1, int num2) {
         resultado = num1 + num2;
         System.out.println(" O resultado é: " + resultado);
     }
    
}
