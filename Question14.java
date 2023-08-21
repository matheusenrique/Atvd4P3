package atvd4;
import java.util.Scanner;

public class Question14 {
    /*Elabore um programa que leia um número inteiro de 1 a 5 e exiba a mensagem "Muito bom",
"Bom", "Regular", "Insuficiente" ou "Muito insuficiente", de acordo com o valor lido, utilizando
switch/case. */
    public static void main(String[] args) {
        System.out.println("Digite um número de 1 a 5.");
        Scanner s = new Scanner(System.in);
        int num =  s.nextInt();
        switch(num) {
            case 1:
                System.out.println("Muito insuficiente.");
                break;
            case 2:
                System.out.println("Insuficiente.");
                break;
            case 3:
                System.out.println("Regular.");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Muito bom.");
                break;
        }
    }
}
