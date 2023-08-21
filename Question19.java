package atvd4;
import java.util.Scanner;

public class Question19 {
    /*Solicite ao usuário dois números inteiros e, usando a estrutura switch/case, exiba o resultado da
operação escolhida pelo usuário (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão). */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe dois números inteiros: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int soma = num1+num2;
        int sub = num1 - num2;
        double multiplicacao = num1 * num2;
        double div =  num1/num2;
        System.out.println("Escolha a operação: 1-soma, 2-subtração, 3-multiplicação, 4-divisão");
        int op = s.nextInt();
        switch(op) {
            case 1:
                System.out.println(soma);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(multiplicacao);
                break;
            case 4:
                System.out.println(div);
                break;
            default:
                System.out.println("Insira uma operação válida");

        }
        
    }
}
