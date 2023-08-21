package atvd4;
import java.util.Scanner;
public class Question3 {
   // Desenvolva um programa que leia dois números inteiros e mostre qual deles é o maior, ou se são iguais.
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira dois números inteiros: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        if(n1>n2){
            System.out.println("O primeiro número é maior.");
        }
        if(n2>n1){
            System.out.println("O segundo número é maior.");
        }
        if(n1==n2){
            System.out.println("Os dois números são iguais.");
        }
   }
}
