package atvd4;
import java.util.Scanner;

public class Question21 {
    /*Crie um programa que leia um valor em metros e o converta para centímetros, milímetros e
quilômetros. Utilize o bloco try/catch para tratar possíveis exceções durante os cálculos. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        try {
            double metros = s.nextDouble();
            double cm = metros * 100;
            double mm = metros * 1000;
            double km = metros / 1000;
            System.out.println("Valor em centímetro: "+cm);
            System.out.println("Valor em milímetros: "+ mm);
            System.out.println("Valor em quilômetros: "+km);

            
        } catch (Exception e) {
            System.out.println("Erro.");
        }
        
    }
}
