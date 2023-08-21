package atvd4;
import java.util.Scanner;

public class Question8 {
   // Faça um programa que receba três números e os imprima em ordem crescente.
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Coloque três números: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        
            if(num1 <= num2 && num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println("Ordem crescente: "+num1+", " +num2+", "+ num3);
                }
                else if (num3 <= num2){
                    System.out.println("Ordem crescente: "+num1+", "+ num3+", "+ num2);
                }
            }
            if(num2 <= num1 && num2 <= num3) {
                if(num1 <= num3) {
                    System.out.println("Ordem crescente: "+num2+", "+num1+", "+num3);
                }
                else if(num3 <= num1) {
                    System.out.println("Ordem crescente: "+num2+", "+num3+", "+num1);
                }
            }
            if(num3 <= num1 && num3 <= num2) {
                if(num1 <= num2) {
                    System.out.println("Ordem crescente: "+num3+", "+num1+", "+num3);
                }
                else if(num2 <= num1) {
                    System.out.println("Ordem crescente: "+num3+", "+num2+", "+num1);
                }
            }
            

        
   }
}
