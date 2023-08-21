package atvd4;
import java.util.Scanner;
public class Question16 {
    /*Receba um número decimal do usuário e arredonde-o para o inteiro mais próximo usando a
estrutura de controle try/catch para tratar exceções. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Digite um número decimal: ");
            double decimal = s.nextDouble();
            int arredondar = (int)Math.round(decimal);
            System.out.println("Número arredondado: "+arredondar);
        } catch (Exception e) {
            System.out.println("Erro.");
        }
    }
}
