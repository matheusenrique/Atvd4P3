package atvd4;
import java.util.Scanner;
public class Question12 {
    /*Receba um número inteiro do usuário e verifique se ele é divisível por 3 e por 5 ao mesmo tempo,
exibindo uma mensagem apropriada. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int inteiro = s.nextInt();
        if (inteiro % 3 == 0 && inteiro % 5 == 0) {
            System.out.println("Número divisível por 3 e 5 ao mesmo tempo.");
        }
        else {
            System.out.println("Não é um número divisível por 3 e 5 ao mesmo tempo.");
        }
    }
}
