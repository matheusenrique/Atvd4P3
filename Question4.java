package atvd4;
import java.util.Scanner;
public class Question4 {
    //Faça um programa que verifique se um número é par ou ímpar.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("Par");
        }
        else{
            System.out.println("Ímpar");
        }
    }
    }
