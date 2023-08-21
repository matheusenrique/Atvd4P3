package atvd4;
import java.util.Scanner;
public class Question17 {
    /*Peça ao usuário que insira a sua idade e verifique se ele é um bebê (0 a 1 ano), criança (1 a 12
anos), adolescente (13 a 18 anos) ou adulto (mais de 18 anos). */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = s.nextInt();
        if(idade >= 0 && idade <= 1) {
            System.out.println("Bebê");
        }
        if(idade >= 1 && idade <= 12) {
            System.out.println("Criança");
        }
        if(idade >= 13 && idade <=18) {
            System.out.println("Adolescente");
        }
        if(idade > 18) {
            System.out.println("Adulto");
        }
    }
}
