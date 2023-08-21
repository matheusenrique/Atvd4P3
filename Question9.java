package atvd4;
import java.util.Scanner;

public class Question9 {
    //  Elabore um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa, dado o peso e
    // a altura. Em seguida, exiba se a pessoa está abaixo do peso, com peso normal, com sobrepeso,
    // obesa ou muito obesa.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira sua altura: ");
        double altura = s.nextDouble();
        System.out.println("Insira seu peso: ");
        double peso = s.nextDouble();
        double imc = peso / (altura * altura);
            if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            }
            if (imc < 24.9) {
                System.out.println("Peso normal.");
            }
            else if (imc < 29.9) {
                System.out.println("Sobrepeso.");
            }
            else if (imc < 34.9) {
                System.out.println("Obesa");
            }
            else {
                System.out.println("Muito obesa");
            }
    }
}
