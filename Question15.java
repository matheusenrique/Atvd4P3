package atvd4;
import java.util.Scanner;
public class Question15 {
    /*Peça ao usuário que digite um número entre 1 e 7 e exiba o dia da semana correspondente (1 -
Domingo, 2 - Segunda-feira, etc.). */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 7");
        int numDia = s.nextInt();
        switch(numDia) {
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda");
                break;
            case 3:
                System.out.println("3 - Terça");
                break;
            case 4:
                System.out.println("4 - Quarta");
                break;
            case 5:
                System.out.println("5 - Quinta");
                break;
            case 6:
                System.out.println("6 - Sexta");
                break;
            case 7:
                System.out.println("7 - Sábado");
                break;

        }
    }
}
