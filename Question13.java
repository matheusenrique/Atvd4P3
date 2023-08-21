package atvd4;
import java.util.Scanner;

public class Question13 {
    /*Peça ao usuário que insira o dia da semana (por extenso) e, em seguida, exiba uma mensagem
informando se é um dia útil ou um fim de semana. */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o dia da semana: ");
        String dia = s.nextLine().toLowerCase();
        switch(dia){
            case "segunda-feira":
            case "terça-feira":
            case "quarta-feira":
            case "quinta-feira":
            case "sexta-feira":
                System.out.println("Dia útil");
                break;
            case "sábado":
            case "domingo":
                System.out.println("Fim de semana");
                break;
        }
    }
}
