package atvd4;
import java.util.Scanner;
public class Question5 {
  //  Elabore um programa que leia três notas de um aluno e calcule a média. Em seguida, exiba se o
  //  aluno está aprovado (média maior ou igual a 7) ou reprovado.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Notas do aluno: ");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        if(media >= 7){
            System.out.println("Média do aluno: "+media +"(APROVADO)");
        }
        else {
            System.out.println("Média do aluno: "+media+"(REPROVADO)");
        }
    }
}
