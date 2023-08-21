package atvd4;
import java.util.Scanner;
public class Question20 {
    /*Desenvolva um programa que leia o nome e a idade de uma pessoa. Utilize o bloco try/catch para
garantir que a idade digitada seja um valor inteiro válido. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.println("Informe seu nome e idade.");
            String nome = s.nextLine();
            int idade = s.nextInt();
            System.out.println("Nome: "+nome+", Idade: "+idade);
        } catch (Exception e) {
            System.out.println("Erro.");
        }
    }
}
