package atvd4;
import java.util.Scanner;
public class Question11 {
    /*Desenvolva um programa que leia o salário de um funcionário e calcule o valor do seu aumento.
Para salários superiores a R$ 1.500,00, o aumento deve ser de 10%. Caso contrário, o aumento é de
15%. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salario = s.nextDouble();
        double aumento;
        if(salario <= 1500.00){
            aumento = salario * 1.15;
            System.out.println("Novo salário: "+ aumento);
        }
        if(salario > 1500.00) {
            aumento = salario * 1.10;
            System.out.println("Novo salário: "+ aumento);
        }
    }
}
