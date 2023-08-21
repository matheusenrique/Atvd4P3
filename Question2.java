package atvd4;
import java.util.Scanner;
public class Question2 {
  //  Crie um programa que receba a idade de uma pessoa e exiba se ela é maior de idade ou menor de idade.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        }
        else {
            System.out.println("Você é menor de idade.");
        }
    }
}
