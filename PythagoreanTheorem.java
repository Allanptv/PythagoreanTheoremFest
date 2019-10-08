/*
  * Pontif�cia Universidade Cat�lica de Minas Gerais
  * Instituto de Ci�ncias Exatas e Inform�tica
  * Belo Horizonte, 25 de Fevereiro de 2018
  * Aluno: Matheus Luiz Oliveira Spindula
*/

import java.util.Scanner;

public class PythagoreanTheorem{
   public static void main(String[] args){
      Scanner read = new Scanner(System.in);
         
      double catheter1, catheter2, hypotenuse;
      
      System.out.println("Bom dia !!");
      
      System.out.println("Este program te ajuda a descobrir qual a hipotenusa de um triangulo !!");
      
      System.out.print("Insira o valor 1: ");
      catheter1 = read.nextDouble();
      
      System.out.print("insira o valor 2: ");
      catheter2 = read.nextDouble();
      
     hypotenuse = Math.sqrt( Math.pow(catheter1, 2) + Math.pow(catheter2, 2) );
     
     System.out.print("A hipotenusa é: " +hypotenuse); 
   }
}