package atvd4;
import java.util.Scanner;
public class Question1 {
   // Escreva um programa que leia um número inteiro e verifique se ele é positivo, negativo ou igual a zero.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numInt = s.nextInt();
        if (numInt > 0) {
            System.out.println("Positivo");
        }
        if (numInt < 0) {
            System.out.println("Negativo");
        }
        if (numInt == 0) {
            System.out.println("Igual a zero");
        }
    }
}
