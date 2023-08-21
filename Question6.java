package atvd4;
import java.util.Scanner;
public class Question6 {
    //  Crie um programa que receba o nome de duas pessoas e exiba qual delas possui o maior número
    // de caracteres em seu nome.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dois nomes: ");
        String nome1 = s.nextLine();
        String nome2 = s.nextLine();
        if(nome1.length() > nome2.length()) {
            System.out.println("O primeiro nome é maior.");
        }
        if(nome2.length() > nome1.length()) {
            System.out.println("O segundo nome é maior.");
        }
        if(nome1.length() == nome2.length()) {
            System.out.println("Mesmo número de caracteres.");
        }
    }
}
