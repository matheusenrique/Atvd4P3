package atvd4;
import java.util.Scanner;

public class Question7 {
   // Desenvolva um programa que leia um caractere e verifique se ele é uma vogal ou uma consoante.
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        char c = s.nextLine().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u' ) {
            System.out.println("Vogal");
        }
        else {
            System.out.println("Consoante");
        }

   }
}
