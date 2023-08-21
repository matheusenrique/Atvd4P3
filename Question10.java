package atvd4;
import java.util.Scanner;
public class Question10 {
   // Escreva um programa que receba um número de mês (1 a 12) e exiba o nome do mês correspondente.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva um número de 1 a 12: ");
        int numMes = s.nextInt();
        if(numMes == 1) {
            System.out.println("Janeiro");
        }
        if(numMes == 2) {
            System.out.println("Fevereiro");
        }
        if(numMes == 3) {
            System.out.println("Março");
        }
        if(numMes == 4) {
            System.out.println("Abril");
        }
        if(numMes == 5) {
            System.out.println("Maio");
        }
        if(numMes == 6) {
            System.out.println("Junho");
        }
        if(numMes == 7) {
            System.out.println("Julho");
        }
        if(numMes == 8) {
            System.out.println("Agosto");
        }
        if(numMes == 9){
            System.out.println("Setembro");
        }
        if(numMes == 10) {
            System.out.println("Outubro");
        }
        if(numMes == 11) {
            System.out.println("Novembro");
        }
        if(numMes == 12) {
            System.out.println("Dezembro");
        }
        if(numMes < 1 || numMes > 12) {
            System.out.println("Digite um número válido");
        }
    }
}
